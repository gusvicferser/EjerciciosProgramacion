package EscrituraFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class EjercicioB2 {

	public static void main(String[] args) {

		try {
//			Definimos el file primero de todo:
			File archivo = new File("DOCS/alumnos_notas.txt");

			// Preparamos el escaner
			Scanner lector = new Scanner(archivo);

			// Iniciamos variables para calcular la media:
			int lineaTexto = 0;
			double notas = 0, media = 0;
			ArrayList<String> alumnos = new ArrayList<String>();

			while (lector.hasNextLine()) {

				// Creamos un vector para almacenar todas las partes y lo inicializamos:
				String[] partes = (lector.nextLine()).split(" ");

//				System.out.println(partes.length); // Traza

				if (partes.length > 0) {
					// Hacemos un bucle for para ir sumando las distintas notas:
					if (partes.length > 2) {
						for (int i = 2; i < partes.length; i++) {
							notas += Integer.parseInt(partes[i]);
						}

						// Calculamos la media y la guardamos en la variable
						media = (double) notas / (double) (partes.length - 2);

					} else {
						media = 0;
					}

//					System.out.println("Notas: " + notas + ". Media: " + media); // Traza

				}
				// Añadimos entonces la string al ArrayList:
				alumnos.add(String.format("%.2f %s %s", media, partes[0], partes[1]));
				notas=0; // Hay que reiniciar las variables al acabar.
				media=0;
			}

			// Ordenamos el array fuera del bucle while.
			Collections.sort(alumnos); 

			// Lo mostramos a la inversa:
			for (int i = (alumnos.size() - 1); i >= 0; i--) {
				System.out.println(alumnos.get(i));
			}

			lector.close(); // Cerramos el scanner

		} catch (FileNotFoundException fnfe) {
			System.out.println("El archivo no existe o no se ha encontrado.");
		} catch (NoSuchElementException nsee) {
			System.out.println("No hay elemento");
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

	}

}