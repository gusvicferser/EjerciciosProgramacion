package EscrituraFicheros;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.*;

public class EjercicioB5 {

	public static void main(String[] args) {

		char letra, primeraLetra;
		String palabra, ruta;
		int numFile = 0;

		try {
//			Inicializamos la ruta del directorio a crear:
			String rutaDiccionario = "DOCS/Diccionario";
			numFile++;
			File carpetaDiccionario = new File(rutaDiccionario);
			carpetaDiccionario.mkdir();

			numFile++;
//			Si ya existe la carpeta, borramos todos los archivos.
			if (carpetaDiccionario.exists()) {
				for (int i = 0; i < 26; i++) {
					letra = (char) (97 + i); // Aquí casteamos la siguiente letra.
					File tester = new File(carpetaDiccionario + File.separator + letra + ".txt");
					tester.delete();
				}
			}

//			Iniciamos un ArrayList para todas las letras del fichero:
			ArrayList<File> abecedario = new ArrayList<File>();

			numFile++;
//			Creamos un bucle for para que haga un file por cada letra:
			for (int i = 0; i < 26; i++) {
				letra = (char) (97 + i); // Aquí casteamos la siguiente letra.
				File tester = new File(carpetaDiccionario + File.separator + letra + ".txt");
				abecedario.add(tester);
				tester.createNewFile();
			}

			numFile++;
//			Creamos la ruta del diccionario:
			File diccionarioBase = new File("DOCS/diccionario.txt");

//			Creamos el Scanner:
			Scanner extraer = new Scanner(diccionarioBase);

			numFile++;
//			Ahora vamos a leer el diccionario.txt y a distribuir las palabras en sus ficheros:
			while (extraer.hasNextLine()) {

				palabra = extraer.nextLine().toLowerCase();
				primeraLetra = palabra.charAt(0);

//				Switch para cambiar vocales acentuadas por sus homónimas sin acento:
				switch ((int) primeraLetra) {
				case 45: // "-"
					primeraLetra = palabra.charAt(1);
					break;
				case 160: // "á"
					primeraLetra = ((char) 97);
					break;
				case 130: // "é"
					primeraLetra = ((char) 101);
					break;
				case 161: // "í"
					primeraLetra = ((char) 105);
					break;
				case 162: // "ó"
					primeraLetra = ((char) 111);
					break;
				case 163: // "ú"
					primeraLetra = ((char) 117);
					break;
				}
				
				System.out.println();

//				Creamos la dirección donde introducir la palabra:
				numFile++;
				ruta = rutaDiccionario + File.separator + primeraLetra + ".txt";
				FileWriter escritor = new FileWriter(ruta);
				escritor.append(palabra);

//				Cerramos el escritor:
				escritor.close();

//				System.out.println(numFile); // Traza
			}

//			Cerramos el lector:
			extraer.close();

		} catch (FileNotFoundException fnfe) {
			System.out.println("El archivo o carpeta que busca no existe: " + numFile);

		} catch (FileAlreadyExistsException fae) {
			System.out.println("La carpeta que intenta crear ya existe: " + numFile);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
