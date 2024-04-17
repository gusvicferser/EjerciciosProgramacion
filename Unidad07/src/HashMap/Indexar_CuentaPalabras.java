package HashMap;

import java.util.*;

public class Indexar_CuentaPalabras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String frase = "En estos tiempos de examen que corren toca estudiar que llega el examen a tiempos";

		// Este HashMap almacena cada caracter y su frecuencia en un texto:
		HashMap<Character, ArrayList<String>> diccionario = new HashMap<Character, ArrayList<String>>();

		String[] palabras = frase.toLowerCase().split(" ");

		// Recorremos la frase para almacenar cada palabra:
		for (String palabra : palabras) {

			char letra = palabra.charAt(0);
			// Si ya hay una palabra que empieza con esa letra añadir .add palabra:
			if (diccionario.containsKey(letra)) {
				diccionario.get(letra).add(palabra); // Pido a la función que me devuelve el ArrayList y luego le añado
														// la palabra.

			} else { // Crear un nuevo ArrayList, añadir esa palabra y ese elemento al diccionario:
				ArrayList<String> nuevaLetra = new ArrayList<String>(); // El nombre es lo de menos para el ArrayList
																		// cuando le damos el put.
				nuevaLetra.add(palabra); // Y le añadimos la palabra.
				diccionario.put(letra, nuevaLetra); // Aquí le damos la key y el elemento que queremos añadir al mapa.
			}
		}

		// .Entry se usa para hacer un tipo de vista Set que nos permite ver el mapa
		// como una lista:
		/*for (HashMap.Entry<Character, ArrayList<String>> e : diccionario.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}*/
		
		System.out.println("Por favor, introduzca una palabra para su búsqueda:");
		
		String busqueda = sc.nextLine();
	}

}
