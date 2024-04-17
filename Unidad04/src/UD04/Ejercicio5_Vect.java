package UD04;

import java.util.*;

public class Ejercicio5_Vect {

	public static void main(String[] args) {

		// Iniciamos el scanner:
		Scanner sc = new Scanner(System.in);

		// Iniciamos la variable de index y el array;
		double total =0, media =0;
		int[] numeros = new int[20];

		// Un bucle for para introducir los números en las posiciones del array;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Por favor, escriba el número que va en la posicion " + (i + 1) + ":");
			numeros[i] = sc.nextInt();
			//System.out.println("Posición: " + (i + 1) + " = " + numeros[i]);
		}

		for (int i=0; i < numeros.length; i++) {
			total = total+numeros[i];
		}
		media= (total/numeros.length);
		System.out.println("Media = " + media);
	}	
}
