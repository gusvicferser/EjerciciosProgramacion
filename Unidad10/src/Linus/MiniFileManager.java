package Linus;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Date;

public class MiniFileManager {

	protected static File actual = new File("");

	public static File getActual() {
		return actual.getAbsoluteFile();
	}

	public static void setActual(File actual) {
		MiniFileManager.actual = actual;
	}

//	Función para cambiar de directorio:
	public static void changeDir(File fileName) throws FileNotFoundException {

//		System.out.println(fileName); // Traza

//		Si nos solicitan volver atrás en el directorio con ".."
		if (fileName.getName().equals("..")) {
			/*Si existe una posición de "/" va recortando las files. 
			 * El problema es que en Windows no funciona. 
			 * Le he preguntado a ChatGPT para solucionar esto y dice que con File.separator
			 * se puede corregir y he comprobado que funciona. Mi problema ha sido no saber encontrarlo
			 * en ningún foro (como StackOverflow). 
			 */
			if (actual.getAbsolutePath().lastIndexOf(File.separator) != -1 && actual.getAbsolutePath().lastIndexOf(File.separator) != 0) {
//				Aquí actualizamos la dirección por aquello que estuviera antes de la barra.
				MiniFileManager.setActual(
						new File(actual.getAbsolutePath().substring(0, actual.getAbsolutePath().lastIndexOf(File.separator))));
			}
		} else {
//			Como el fileName es simplemente un nombre, debemos comprobar si existe añadiéndole el AbsolutePath:
			File newDir = new File(actual.getAbsoluteFile() + File.separator + fileName);

			if (newDir.isDirectory()) {
//				System.out.println(MiniFileManager.getActual()); // Traza
				setActual(new File(MiniFileManager.getActual() + File.separator + fileName.getName()));
			} else {
				throw new FileNotFoundException("El archivo o directorio no existe");
			}
		}
	}

//	Función para mostrar los archivos con tamaño y fecha de modificación:
	public static void listFiles(File fileName, boolean datos) throws FileNotFoundException {

		if (!fileName.exists()) { // Si el archivo no existe, se lanza excepción
			throw new FileNotFoundException("El archivo o directorio no existe");
		}

		if (fileName.isFile()) { // Aquí si la fileName es archivo tratamos esta:
			System.out.println(fileName.getName());
		} else if (fileName.isDirectory()) { // Si el file es un directorio, entonces debemos mostrar los directorios
												// que este contenga primero y luego los archivos
			File[] archivosDentro = fileName.listFiles();

			if (archivosDentro.length != 0) {

				Arrays.sort(archivosDentro); // Ordenamos el array de archivos.

				for (File directorio : archivosDentro) { // Bucle for para mostrar los directorios.
					if (directorio.isDirectory()) {
						Date fechaDir = new Date(directorio.lastModified());
						if (datos) { // Si el booleano que le hemos pasado es cierto, se muestra la última
										// modificación.
							System.out
									.println("[DIR] " + directorio.getName() + " || Última modificación: " + fechaDir);
						} else {
							System.out.println("[DIR] " + directorio.getName());
						}
					}
				}

				for (File archivo : archivosDentro) {
					if (archivo.isFile()) {
						Date fechaArc = new Date(archivo.lastModified());
						if (datos) { // Si el booleano que le hemos pasado es cierto, se enseña el tamaño y la última
										// modificación.
							System.out.println("[FILE] " + archivo.getName() + " || Tamaño: " + archivo.length()
									+ " Bytes || Última modificación: " + fechaArc);
						} else {
							System.out.println("[FILE] " + archivo.getName());
						}
					}
				}
			}
		}
	}

//	Función para crear una carpeta:
	public static void createDir(File fileName) {

//		Como le hemos pasado directamente la ruta absoluta, ahora solo debemos comprobar si existe y si es así crear el directorio

		if (fileName.mkdir()) {
			System.out.println("El directorio se ha creado correctamente");
		} else {
			System.out.println(
					"No se ha podido crear el directorio porque ya existe o porque no tiene permisos de escritura, pruebe de nuevo.");
		}
	}

//	Función para borrar un directorio o archivo (hay que ir con muchísimo cuidado):
	public static void removeDir(File fileName) {

//		Creamos un booleano que nos diga si existen subcarpetas en la carpeta. Si es así no la borraremos.
		boolean comprueba = false;

		if (fileName.isDirectory()) {
			for (File archivo : fileName.listFiles()) {
				if (archivo.isDirectory()) {
					comprueba = true; // Si existe una subcarpeta tan sólo, ya no borraremos.
				}
			}

//			Si es verdadero, no podemos borrar:
			if (comprueba) {
				System.out.println("El directorio contiene subcarpetas y no se puede borrar.");

			} else {
//			Si no hay subcarpetas, se puede borrar todo:
				for (File archivo : fileName.listFiles()) {
					if (archivo.isFile()) {
						archivo.delete(); // Borramos todos los archivos primero
					}
				}
				if (fileName.delete()) { // Luego borramos por último la carpeta.
					System.out.println("El directorio se ha removido correctamente");
				}
			}
		} else {
			if (fileName.delete()) { // Si es un archivo no necesitamos hacer todo el trámite, lo eliminamos y
				// listos.
				System.out.println("El archivo se ha removido correctamente");
			}
		}
	}

//	Función para cambiar el nombre del archivo o directorio:
	public static void moveFile(File fileName, File changeName) {

//		Si el primer archivo existe y el segundo no:
		if (fileName.exists() && !changeName.exists()) {
			if (fileName.renameTo(changeName)) {
				if (!changeName.isFile()) {
					System.out.println("La carpeta ha sido cambiada de nombre.");
				} else {
					System.out.println("El archivo ha sido cambiado de nombre.");
				}
			}
		} else if (!fileName.exists()) {
			System.out.println("El archivo o directorio que intenta modificar no existe.");
		} else if (changeName.exists()) {
			System.out.println("El nombre al que quiere cambiar el archivo ya existe.");
		}
	}

//	Muestra las opciones con una descripción:
	public static void options() {

		System.out.println("Comandos disponibles para el usuario:");
		System.out.println(
				"**********************************************************************************************");
		System.out.println(" > pwd: Muestra cual es la carpeta actual");
		System.out.println(" > cd <DIR>: Cambia la carpeta actual a ‘DIR’. Con .. cambia a la carpeta superior");
		System.out.println(
				" > ls: Muestra la lista de directorios y archivos de la carpeta actual \n   (primero directorios, luego los archivos, ambos ordenados alfabéticamente)");
		System.out.println(" > ll: Como ls pero muestra también el tamaño y la fecha de última modificación");
		System.out.println(" > mkdir <DIR>: Crea el directorio ‘DIR’ en la carpeta actual");
		System.out.println(
				" > rm <FILE>: Borra ‘FILE’. Si es una carpeta, borrará primero sus archivos y luego la carpeta. \n   Si tiene subcarpetas, las dejará intactas y mostrará un aviso al usuario");
		System.out.println(" > mv <FILE1> <FILE2>: Mueve o renombra ‘FILE1’ a ‘FILE2’.");
		System.out.println(" > help: Muestra una breve ayuda con los comandos disponibles");
		System.out.println(" > exit: Termina el programa");
		System.out.println(
				"**********************************************************************************************");
	}
}
