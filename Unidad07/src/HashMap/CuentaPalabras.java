package HashMap;

import java.util.*;

public class CuentaPalabras {

	public static void main(String[] args) {

		String frase = "En estos tiempos ¡de examen! que corren, toca estudiar que llega el examen a tiempos";

		// Este HashMap almacena cada caracter y su frecuencia en un texto:
		HashMap<String, Integer> cuentaPalabra = new HashMap<String, Integer>();

		String palabra = " ";

		// Recorremos la frase para almacenar cada palabra:
		for (char letra : frase.toLowerCase().toCharArray()) {
			
			// Comprobamos si cada character es una letra:
			if (Character.isLetter(letra)) {
				
				// Si es una letra pero la palabra empieza por espacio,
				// entonces hemos de poner como primer character la primera letra:
				if (palabra.equals(" ")) {
					palabra = Character.toString(letra);
					
				} else { // En caso de que ya haya letras, vamos añadiendo la letra a la palabra:
					palabra += Character.toString(letra);
				}
			} else {
				// En este else debemos hacer una excepción para que no guarde " " como una palabra
				// cuando el siguiente caracter tampoco sea una letra.
				if (palabra.equals(" ")) {
					
				} else { 
					// En caso de que se acabe la palabra porque haya un espacio o un símbolo
					// este else almacena ya la palabra en el HashMap: 
					cuentaPalabra.put(palabra, cuentaPalabra.getOrDefault(palabra, 0) + 1);
					
					//Traza:
					//System.out.println(palabra);
					
					palabra = " "; // Aquí reiniciamos la palabra para que no se acumule.
				}
			}
		}
		// .Entry se usa para hacer un tipo de vista Set que nos permite ver el mapa
		// como una lista:
		for (HashMap.Entry<String, Integer> e : cuentaPalabra.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}
	}

}
