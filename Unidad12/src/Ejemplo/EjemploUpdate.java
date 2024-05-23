package Ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EjemploUpdate {

	public static void main(String[] args) {
		
		Connection conexion = null;

		try {
			conexion = ConexionDB.conectar();
			
//			Cada SELECT es al principio una String:
			String query = "SELECT netapa AS 'Clave Primaria', salida FROM etapa WHERE salida LIKE 's%'";
			
//			Para convertirla en lenguaje entendible por la base de datos, se pasa a Statement
//			***¡¡¡El orden de type_scroll es importante!!!***
			Statement queryUpdate = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE); // Se le ponen condiciones para hacerlo scrolleable y que pueda ser actualizado.
//			ResultSet es una colección que contiene los campos que hemos obtenido de la query:
			ResultSet resultado = queryUpdate.executeQuery(query);
			
			while (resultado.next()) {
				
				if(resultado.getString("salida").equals("Segovio")) {
//					Se hacen las modificaciones sobre el ResultSet (NO EN LA BASE DE DATOS):
					resultado.updateString("salida", "Segovia"); // Esto sólo modifica el ResultSet
//					Al acabar las actualizaciones se actualiza la base de datos con .updateRow():
					resultado.updateRow(); // Para poder actualizar la base de datos, 
				}
				System.out.println(resultado.getString("salida"));
			}
			
//			Ejemplo de scroll:
			resultado.first();
			System.out.println();
			System.out.println(resultado.getString("salida"));
			
			; // Cerramos la conexión
			queryUpdate.close(); // Cerramos el Statement
			
			} catch (SQLException sqle) {
//				System.err.println("Ups...");
				sqle.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
