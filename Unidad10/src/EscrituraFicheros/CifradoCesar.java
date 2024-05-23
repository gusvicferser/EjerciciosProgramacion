package EscrituraFicheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CifradoCesar {

	public static void main(String[] args) {

//		Primero estableceremos variables:
		String user, password, remember = "", cypher = "";
		int ascii;
		char letter;
		String[] cesar = new String[3];

//		Iniciamos el scanner:
		Scanner sc = new Scanner(System.in);

//		Pedimos al usuario nombre, contraseña y frase recodatorio:
		System.out.println("Por favor, introduzca su usuario:");
		user = sc.nextLine();
		cesar[0] = user;

		System.out.println("Introduzca su contraseña:");
		password = sc.nextLine();
		cesar[1] = password;

		while (remember.length() < 15) {
			System.out.println("Introduce una frase de recordatorio de la contraseña (mínimo 15	caracteres):");
			remember = sc.nextLine();
		}
		cesar[2] = remember;

//		Ahora haremos la conversión de las letras:
		for (int i = 0; i < cesar.length; i++) {

//			Para simplificarlo, en lugar de hacer 3 bucles con cada palabra, hacemos un anidado:
			for (int j = 0; j < cesar[i].length(); j++) {

//				Aquí sumamos 5 directamente al caracter ascii que tengamos en ese momento:
				ascii = 5 + ((int) cesar[i].charAt(j));

//				Si el caracter es superior a la z, reiniciamos el bucle:
				if (ascii > 122) { // "z"
					ascii = 96 + (ascii-122); // Calculamos la diferencia hasta la nueva letra.
				} else if (ascii == 37) {
					ascii = 32;
				}
//				System.out.println((char) ascii); // Traza
				letter = (char) ascii; // Lo devolvemos a character
				cypher = cypher + letter; // Lo acumulamos en una variable para la palabra
			}

//			Sustituimos la palabra por la cifrada:
			cesar[i] = cypher;
			cypher = ""; // Reiniciamos variable.

		}

//		Creamos entonces el fichero:
		FileWriter escritor;
		
		try {
			escritor = new FileWriter("user_info.txt", false);

			for (int i = 0; i < cesar.length; i++) {
				escritor.write(cesar[i] + "\n");
			}
			
			escritor.close(); // Cerramos escritor siempre.
			System.out.println("'Et tu, Brutus?'");
			
		} catch (IOException e) {
			System.out.println(e.getMessage());			
		}

	}

}
