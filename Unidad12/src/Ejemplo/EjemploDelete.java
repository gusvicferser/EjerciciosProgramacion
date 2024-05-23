package Ejemplo;

import java.sql.Connection;
import java.sql.Statement;
import DBGraph.ConexionDB;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EjemploDelete {

	public static void main(String[] args) {

		Connection conexion = null;

		try {
			conexion = ConexionDB.conectar();

//			Cada SELECT es al principio una String:
			String query = "SELECT nomeq FROM equipo";

//			Para convertirla en lenguaje entendible por la base de datos, se pasa a Statement
//			***¡¡¡El orden de type_scroll es importante!!!***
			Statement queryUpdate = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE); // Se le ponen condiciones para hacerlo scrolleable y que pueda ser
													// actualizado.
//			ResultSet es una colección que contiene los campos que hemos obtenido de la query:
			ResultSet resultado = queryUpdate.executeQuery(query);

			while (resultado.next()) {

				if (resultado.getString("nomeq").equalsIgnoreCase("2DAW")) {

					resultado.deleteRow();
					System.out.println("Se ha borrado 2DAW");

				} else {
					// Este else es para no acceder al registro de la fila borrada!!!!
					System.out.println(resultado.getString("nomeq"));
				}
			}

			queryUpdate.close(); // Cerramos el Statement

			ConexionDB.desconectar(conexion);

		} catch (SQLException sqle) {
			
			sqle.printStackTrace();
		}
	}
}
