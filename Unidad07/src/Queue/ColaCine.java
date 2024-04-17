package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColaCine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Para este ejercicio vamos a crear una cola:
		Queue<String> colaCine = new LinkedList<String>();

		// Iniciamos variables necesarias:
		String clientes = "";
		int num;

		// Creamos un bucle 'do while' para hacer lo que nos pide el ejercicio. La
		// salida será la palabra salir.
		do {
			System.out.println(
					"Introduzca los clientes para ENTRAR separados por una @, 'nadie' para no añadir clientes o 'salir' para finalizar la cola:");

			clientes = sc.nextLine();

			if (clientes.equalsIgnoreCase("salir")) {
				System.out.println("¡Hasta luego!");

			} else {

				// Aquí si pone 'nadie' no introducimos nada:
				if (clientes.equalsIgnoreCase("nadie")) {

				} else { // En caso contrario, introducimos los nombres:
					String[] listaClientes = clientes.split("@");

					for (String persona : listaClientes) {
						colaCine.add(persona.trim()); // .trim() quita todos los espacios que no necesitas para
														// palabras, ¡¡¡NO USAR EN FRASES!!!
					}
				}

				// Aquí hacemos un bucle con Iterator para mostrar toda la lista componente a
				// componente:
				System.out.println("Estado de la cola después de ENTRAR:");
				if (colaCine.isEmpty()) { // .isEmpty() pertenece a colecciones y muestra si está vacía la cola o no.
					System.out.println("¡No hay nadie en la cola!");

				} else {
					Iterator<String> iter = colaCine.iterator();
					while (iter.hasNext()) {
						System.out.println(" " + iter.next());
					}
				}

				// Aquí comenzamos el bucle de salida:
				do {
					System.out.println("Introduzca los clientes para SALIR:");
					num = sc.nextInt();
					sc.nextLine();

					// Aquí si el tamaño que pretende borrar es mayor al tamaño de la cola, se lo
					// avisamos:
					if (num > colaCine.size()) {
						System.out
								.println("¡No se pueden eliminar tantas personas! El número de personas en la cola es: "
										+ colaCine.size());

						// Ningún número negativo es válido, así que lo especificamos aquí:
					} else if (num < 0) {
						System.out.println("Introduzca un número válido (es decir, positivo):");

						// En cualquier otro caso, enseñamos quién sale de la cola:
					} else {
						for (int i = 0; i < num; i++) {
							System.out.println("Sale de la cola " + colaCine.element() + ".");
							colaCine.remove();
						}
						break;
					}

				} while (true);

				// Mostramos el estado de la cola:
				System.out.println("Estado de la cola después de SALIR:");
				if (colaCine.size() > 0) {

					Iterator<String> iter = colaCine.iterator();
					while (iter.hasNext()) {
						System.out.println(" " + iter.next());
					}

					// Si no hay nadie en la cola lo especificamos:
				} else {
					System.out.println("¡No hay nadie en la cola!");
				}
			}

			// Si el usuario le da a salir, entonces salimos del bucle:
		} while (!clientes.equalsIgnoreCase("salir"));
	sc.close();
	}

} 
