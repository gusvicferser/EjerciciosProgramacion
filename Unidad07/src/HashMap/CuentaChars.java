package HashMap;

import java.util.*;

public class CuentaChars {

	public static void main(String[] args) {

		String frase = "¡Estudiad, insen%@t0s!";

		// Este HashMap almacena cada caracter y su frecuencia en un texto:
		HashMap<Character, Integer> cuentaChar = new HashMap<Character, Integer>();
		/*
		 * Aquí hemos definido primero la clase envolvente que es Character (Clase
		 * envolvente de char) y luego el número de veces en un texto, con int.
		 */

		// Recorremos la frase para almacenar cada letra:
		for (char letra : frase.toLowerCase().toCharArray()) {

			// La función .isLetter() te permite identificar en los char si es una letra
			// o un número (Muy importante):
			if (Character.isLetter(letra)) { // Descarto lo que no sea letra: (!,'¡...)

				// Este if comprueba si esa letra está:
				if (cuentaChar.containsKey(letra)) {

					int valor = cuentaChar.get(letra);

					// ".put" puede ¡¡añadir o modificar un dato ya existente!!
					cuentaChar.put(letra, valor + 1);

					// Este else se crea para el caso de que no hayamos creado esa letra
					// anteriormente.
				} else {
					cuentaChar.put(letra, 1);
				}

			}
		}

		// .Entry se usa para hacer un tipo de vista Set que nos permite ver el mapa
		// como una lista:
		for (HashMap.Entry<Character, Integer> e : cuentaChar.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

}
