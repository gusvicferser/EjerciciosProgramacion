package Ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ejemplo1 {

//	Como es igual de principio a fin, se pone "final" y la variable toda en Mayúsculas:
	static final String URL = "jdbc:mysql://127.0.0.1:3307/ciclismo";
	static final String USUARIO = "Doofensmirtz";
	static final String PASS = "Perry";
	
	public static void main(String[] args) {
		
		Connection conexion = null;

		try {
//			Registrar el driver de forma dinámica por si el sistema no admite la asociación estática
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			Establecimiento de la conexión:
			conexion = DriverManager.getConnection(URL, USUARIO, PASS);
			System.out.println("Conexión establecida");
			
//			Cada SELECT es al principio una String:
//			String query = "SELECT nomeq FROM equipo";
			String query = "SELECT salida, km FROM etapa";
//			Para convertirla en lenguaje entendible por la base de datos, se pasa a Statement
			PreparedStatement querySelect = conexion.prepareStatement(query);
//			ResultSet es una colección:
			ResultSet resultado = querySelect.executeQuery();
			
//			int suma = 0;
			String salidaMax="";
			int maxKm = 0;
			
			while (resultado.next()) {
//				System.out.println(resultado.getString("nomeq"));
//				System.out.println(resultado.getInt("km"));
//				Suma de todos los kilometros de todas las etapas:
//				suma = suma + resultado.getInt("km");
				
				if(maxKm<resultado.getInt("km")) {
					maxKm = resultado.getInt("km");
					salidaMax = resultado.getString("salida");
				}
			}
//			System.out.println(suma + "kms");
			
			System.out.println("Nombre etapa con más kms es: " + salidaMax + " con " + maxKm + "kms");
			
			conexion.close(); // Cerramos la conexión
			querySelect.close(); // Cerramos el Statement
			} catch (Exception e) {
//			System.out.println("Ups...");
				e.printStackTrace();
			}
	}
}
