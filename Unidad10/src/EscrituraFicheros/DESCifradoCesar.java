package EscrituraFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DESCifradoCesar {

	public static void main(String[] args) {

		String[] cesar = new String[3];
		String comprobacion, deCypher = "", respuesta;
		char letra;
		int ascii;
		boolean bucle = true;
		Scanner sc = new Scanner(System.in);

//		Primero leeremos el fichero:

		try {
			File aDescifrar = new File("user_info.txt");

			Scanner lector = new Scanner(aDescifrar);

			for (int i = 0; i < 3; i++) {
				cesar[i] = lector.nextLine();
//				System.out.println(cesar[i]); // Traza
			}

			System.out.println("Para verificar que es usted el usuario, introduzca su contraseña:");
			comprobacion = sc.nextLine();

			for (int i = 0; i < cesar.length; i++) {

				for (int j = 0; j < cesar[i].length(); j++) {

					ascii = ((int) cesar[i].charAt(j)) - 5;
					if (ascii < 97) { // "a"
						if (ascii == 27) { // Para conservar los espacios.
							ascii = 32;
						} else {
							ascii = 123 - (97 - ascii); // Calculamos la diferencia hasta la nueva letra
						}
					}
					letra = (char) ascii;
					deCypher = deCypher + letra;
//					System.out.println(deCypher); // Traza

				}

				cesar[i] = deCypher;
				deCypher = ""; // Reiniciamos la variable. IMPORTANTE
			}

			do {

				if (comprobacion.equals(cesar[1])) {

					System.out.println("Usuario: " + cesar[0] + " || Contraseña: " + cesar[1] + " || Pregunta de seguridad: " + cesar[2]);
					bucle = false;

				} else {

					System.err.println("Contraseña incorrecta, ¿quiere una pista sobre ella? (y/n)");
					respuesta = sc.nextLine();
					if (respuesta.equals("y")) {
						System.out.println(cesar[2]);
						System.out.println("Introduzca ahora su contraseña:");
						comprobacion = sc.nextLine();
						bucle = true;
					} else {
						bucle = false;
					}
				}
			} while (bucle);
			sc.close();
			System.out.println("'Alea jacta est'");

		} catch (FileNotFoundException fnfe) {
			System.out.println("No existe ningún archivo para descifrar.");
		}

	}

}
