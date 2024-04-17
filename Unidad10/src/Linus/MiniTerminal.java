package Linus;

import java.io.File;
import java.util.Scanner;

public class MiniTerminal {

	static Scanner sc = new Scanner(System.in); // Creamos el escaner como static para usarlo en todas las funciones:

	public static void main(String[] args) {

		String action; // Aquí guardaremos la acción del usuario

		do {

			System.out.println(MiniFileManager.getActual() + ">");
			action = sc.nextLine().trim(); // Si ponemos trim se quitan los espacios innecesarios (MUY IMPORTANTE)

			try {
				consola(action);
			} catch (Exception exc) { // Capturamos aquí todas las excepciones que puede lanzar.
				System.out.println(exc.getMessage());
			}

		} while (!action.equalsIgnoreCase("exit")); // Cuando la acción sea salir, se saldrá del bucle.

	}

	private static void consola(String action) throws Exception {

		String option;
		File fileName = MiniFileManager.getActual();
		File fileNameChange = MiniFileManager.getActual();

//		Debemos separar la opción de los nombres de archivos:
		if (action.indexOf(" ") == -1) {
			option = action.toLowerCase(); // Si lo ponemos en minúscula siempre será una opción posible.
//			System.out.println("Acción: " + action + "// Opción: " + option); // Traza

		} else {
			option = action.substring(0, action.indexOf(" ")).toLowerCase();
//			System.out.println("Acción: " + action + "// Opción: " + option); // Traza

			if (action.indexOf(" ") != action.lastIndexOf(" ")) { // Si la posición del espacio es distinta del inicio
																	// al del final, hay dos filas y por lo tanto
																	// creamos otro file distinto para el segundo
																	// directorio:

				fileName = new File(action.substring(action.indexOf(" ") + 1, action.lastIndexOf(" ")));

//				Por último tomamos el segundo nombre de archivo si lo hubiera:
				fileNameChange = new File(action.substring(action.lastIndexOf(" ") + 1, action.length()));

			} else {
				fileName = new File(action.substring(action.indexOf(" ") + 1, action.length()));
			}

		}

//		Switch para las distintas opciones:
		switch (option) {

		case "pwd": // Muestra fichero actual
			System.out.println(MiniFileManager.getActual());
			break;
		case "cd": // Cambia carpeta (necesita comprobar si existe)
			MiniFileManager.changeDir(fileName);
			break;
		case "ls": // Listado de directorios sin tamaño ni fecha de modificación.
			System.out.println(fileName);
			MiniFileManager.listFiles(fileName, false);
			break;
		case "ll": // Listado de directorios con tamaño y fecha de modificación.
			System.out.println(fileName);
			MiniFileManager.listFiles(fileName, true);
			break;
		case "mkdir": // Crea el directorio que menciona. Lleva File.separator sacado de ChatGPT y se explica en MiniFileManager (Para que pueda funcionar en Windows).
			MiniFileManager.createDir(new File(MiniFileManager.getActual() + File.separator + fileName));
			break;
		case "rm": // Borra el directorio que le mandes.
			File remover = new File(MiniFileManager.getActual() + File.separator + fileName);

			if (remover.exists()) {
				String respuesta = "";
				do {
//					Aquí hago un pequeño inciso para no borrar algo de sopetón. Hago esta comprobación aquí para no poner scanner en el FileManager y así no interactuar con el usuario.
					System.out.println("¿Está seguro de que quiere eliminar esta carpeta o archivo? y/n");
					respuesta = sc.nextLine();
					
//					Si la respuesta es afirmativa, entonces procedemos a borrar el directorio:
					if (respuesta.equalsIgnoreCase("y")) {
						MiniFileManager.removeDir(remover);
					}
//					Si el usuario escribe cualquier cosa que no sea un "y" o una "n", le vuelve a preguntar:
				} while (!respuesta.equalsIgnoreCase("y") && !respuesta.equalsIgnoreCase("n")); 
				
			} else {
//				En caso de que no exista el fichero, lo comunica:
				System.out.println("El directorio que intenta eliminar no existe.");
			}
			break;
		case "mv": // Mueve el directorio a uno nuevo.
			MiniFileManager.moveFile(new File(MiniFileManager.getActual() + File.separator + fileName), new File(MiniFileManager.getActual() + File.separator + fileNameChange));
			break;
		case "help": // Muestra todas las opciones.
			MiniFileManager.options();
			break;
		case "exit": // Mensaje de salida y finaliza el programa.
			System.out.println("Hasta la vista... baby!");
			break;
		default: // Para toda opción no contemplada.
			System.out.println("No existe la acción solicitada. Pruebe de nuevo.");
			break;
		}
	}
}
