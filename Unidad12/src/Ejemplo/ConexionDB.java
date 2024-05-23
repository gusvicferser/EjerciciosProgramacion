package Ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

	static final String URL = "jdbc:mysql://127.0.0.1:3307/ciclismo";
	static final String USUARIO = "Doofensmirtz";
	static final String PASS = "Perry";

	public static Connection conectar() {
		
		Connection conexion = null;

		try {
//		Registrar el driver de forma dinámica por si el sistema no admite la asociación estática

			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection(URL, USUARIO, PASS);
			System.out.println("[!]CONEXION ESTABLECIDA");
			System.out.println("************************");
			

		} catch (SQLException | ClassNotFoundException e) {
			
			System.err.println("[!]ERROR CRÍTICO AL CONECTAR");
			e.printStackTrace();
		}
		
		return conexion; // He de comprobar que la conexión no es null. En caso de fallo devuelve null.
	}

	public static boolean desconectar(Connection conexion) {

		if(conexion!=null) {
			
			try {
				
				conexion.close();
				System.out.println("*************************");
				System.out.println("[!]DESCONECTADO DE LA BD");
				return true;
				
			} catch (SQLException e) {
				System.out.println("[!]ERROR AL DESCONECTAR");
				e.printStackTrace();
			}
		}
		
		return false;
	}
}
