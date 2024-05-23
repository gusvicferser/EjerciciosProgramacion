package Ejemplo;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


public class EjemploInsert {
	
	public static void main(String[] args) {
		
		Connection conexion = null;

		try {
			conexion = ConexionDB.conectar();
			
//			Cada SELECT es al principio una String:
//			String query = "SELECT nomeq FROM equipo";
			String query = "SELECT * FROM equipo";
//			Para convertirla en lenguaje entendible por la base de datos, se pasa a Statement
			Statement querySelect = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//			ResultSet es una colección:
			ResultSet resultado = querySelect.executeQuery(query);
			
			resultado.moveToInsertRow();
			resultado.updateString(1, "1DAW");
			resultado.updateString(2, "Ferran");
			resultado.insertRow();
			
//			resultado.moveToInsertRow();
//			resultado.updateString(1, "2DAW");
//			resultado.insertRow();
			
//			while (resultado.next()) {
//				System.out.println(resultado.getString(1) + " // " + resultado.getString(2));
//			}
			
			resultado.last();
			System.out.println(resultado.getString(1) + " // " + resultado.getString(2));
			resultado.previous();
			System.out.println(resultado.getString(1) + " // " + resultado.getString(2));
			resultado.first();
			System.out.println(resultado.getString(1) + " // " + resultado.getString(2));
			resultado.next();
			System.out.println(resultado.getString(1) + " // " + resultado.getString(2));
			
			
			ConexionDB.desconectar(conexion); // Cerramos la conexión
			querySelect.close(); // Cerramos el Statement

			} catch (Exception e) {
//				System.err.println("Ups...");
				e.printStackTrace();
			}
	}
}
