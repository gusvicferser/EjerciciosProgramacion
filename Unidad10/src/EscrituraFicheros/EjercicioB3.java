package EscrituraFicheros;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.*;

public class EjercicioB3 {

	public static void main(String[] args) {

//		Creamos un ArrayList:
		ArrayList<String> nombres = new ArrayList<String>();

		try {

//			Creamos el file PRIMERO DE TODO:
			File lectura = new File("DOCS/usa_personas.txt");

//			Creamos el scanner:
			Scanner lector = new Scanner(lectura);

//			Creamos un bucle para añadir los nombres al Array:
			while (lector.hasNextLine()) {

				nombres.add(lector.nextLine());
			}

//			Ordenamos el Array:
			Collections.sort(nombres);
			
			String nuevoFile = "usa_personas_sort.txt";

			FileWriter escritor = new FileWriter("DOCS/" + nuevoFile, false);
			
			for (String nombre : nombres) {
				escritor.write(nombre + "\n");
			}
			
			lector.close();
			escritor.close(); // Cerramos TODAS LAS VECES el lector y el escritor.

			System.out.println("El contenido del fichero " + lectura.getName() + " ha sido traspasado al fichero " + nuevoFile);

		} catch (FileNotFoundException fnfe) { // Creamos excepción por si el archivo no existe:
			System.out.println("El fichero al que trata de acceder no existe.");
			
		} catch (FileAlreadyExistsException fae) { // Por si el archivo existe al crearlo:
			System.out.println("¡Este fichero ya existe!");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
