package UD04;

import java.util.Scanner;

public class Ejercicio4_Vect {

	public static void main(String[] args) {
		
		//Iniciamos el scanner:
		Scanner sc= new Scanner(System.in);
		
		//Iniciamos la variable de index y el array;
		int i, sumapos = 0, sumares = 0;
		int[] numeros = new int[20];
		
		//Un bucle for para introducir los números en las posiciones del array;
		for (i = 0; i < numeros.length; i++) {
			System.out.println("Por favor, escriba el número que va en la posicion " + (i+1) + ":");
			numeros[i] = sc.nextInt();
			//System.out.println("Posición: " + (i+1) + " = "  + numeros[i]);
				if (numeros[i]>=0) {
					sumapos=sumapos+numeros[i];
				}
				else {
				sumares=sumares+numeros[i];
				}
	}
			System.out.println("La suma de los positivos es: " + sumapos + " y la suma de los negativos es: " + sumares);
	

	}

}
