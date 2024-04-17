package ActividadForbes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListaForbes {

	public static void main(String[] args) {

		// Iniciamos Scanner dentro de la main porque no lo necesitamos en las funciones
		// auxiliares:
		Scanner sc = new Scanner(System.in);

		// Iniciamos el array de ricos: (Para tener una lista de ellos cuando llegue la
		// revolución...)
		ArrayList<String> ricos = new ArrayList<String>();

		// Iniciamos las variables necesarias: 
		int numeroRevista = 0, pasta_rico = 0, contador = 0;
		String nombre_rico = "";
		boolean esNombreRico = false, esRico = false;

		System.out.println("Bienvenido a la revista Forbes");
		System.out.println();

		// Paso 1: Solicitar el número de la revista en bucle:
		while (numeroRevista < 2000) {
			System.out.println(
					"Para comenzar a introducir a los nuevos ricos,\nindique en qué número de la revista Forbes van a aparecer:");

			numeroRevista = sc.nextInt();
			sc.nextLine();
			// Si la revista está por debajo de los 2000 ponemos un aviso:
			if (numeroRevista < 2000 && numeroRevista>0) {
				System.out.println("Esa revista ya ha sido publicada y no puede modificarla.\n");
				
				// Si la revista es un número negativo, lo especificamos:
			} else if (numeroRevista<1) {
				System.out.println("Al igual que no existe la revista 0, tampoco una negativa...\n");
			}
		}

		// Paso 2: Añadir ricos.
		do {
			// Paso 2.1: Solicitamos nombre. Si es salir, saldrá del sistema:
			System.out.println("Por favor, introduzca el nombre del candidato a rico:");
			nombre_rico = sc.nextLine();

			// Aquí evaluamos si el usuario ha introducido 'salir' en cuyo caso le mostramos
			// mensaje de salida:
			if (nombre_rico.equalsIgnoreCase("salir")) {
				System.out.println(
						"Ha salido usted de la revista Forbes,\ndesde la editorial de la revista Forbes, lamentamos profundamente que sea pobre.\n");
			} else {
				// En caso distinto continuamos añadiendo:
				System.out.println("Por favor, introduzca la riqueza de este rico para evaluarla:");
				pasta_rico = sc.nextInt();
				sc.nextLine(); // Salto de línea importante después de pedir un Int.

				esNombreRico = decidir_nombre_rico(nombre_rico); // Verificamos si es nombre de rico y si es rico

				esRico = decidir_pasta_rico(pasta_rico);

				// Si no es rico hemos de hacer un bucle 'if' para mostrar el por qué no lo
				// admitimos:
				if (!esNombreRico) {
					System.out.println("¡" + nombre_rico + " no es nombre de rico! ¡Le faltan más vocales!");
				} else {
					// En caso contrario vamos con la verificación de su fortuna:
					if (!esRico) {
						System.out.println("¡Esa no es la fortuna de un rico! " + nombre_rico
								+ " es clase obrera y no puede aparecer en la revista Forbes.");
					} else {
						// Si el nombre es correcto y la fortuna es la correcta, añadimos al rico a la
						// lista:
						ricos.add(nombre_rico);
						contador++; // Subimos el contador de ricos y mostramos por pantalla que ha sido añadido:
						System.out.println(nombre_rico + " ha sido añadido a la revista " + numeroRevista
								+ " en la posición " + contador);
					}
				}
			}
		} while (!nombre_rico.equalsIgnoreCase("salir")); // Aquí negamos la condición de salida para que se ejecute el bucle mientras no sea "salir".

		// Paso 3: Mostramos toda la lista de ricos de uno en uno.
		System.out.println("Los ricos introducidos son los siguientes:");
		
		// Vamos a mostrar la lista con un 'Iterator':
		Iterator iter= ricos.iterator();
		while (iter.hasNext()) {
			System.out.println(" " + iter.next()); 
		}
		
	}

	public static boolean decidir_nombre_rico(String nombre_rico) {

		// En esta función si el nombre del rico contiene la letra e y la letra o, devuelve 'true', en caso contrario devuelve 'false':
		if (nombre_rico.toLowerCase().contains("e") && nombre_rico.toLowerCase().contains("o")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean decidir_pasta_rico(int pasta_rico) {
		
		// Aquí si la riqueza es mayor de 6000€ entonces se devuelve 'true'. Si es menor o igual a 6000 se devuelve 'false':
		if (pasta_rico>6000) {
			return true;
		} else {
			return false;
		}
	}

}
