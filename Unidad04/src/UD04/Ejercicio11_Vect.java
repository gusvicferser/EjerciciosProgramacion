package UD04;

import java.util.*;

public class Ejercicio11_Vect {

	public static void main(String[] args) {
		
		//Inicializamos variables:
		int i, j;
		
		//Iniciamos los arrays:
		int numeros[] = new int[10];
		
		int numeros2[] = new int[10];
		
		//Hacemos un for para introducir los números y dentro de ese bucle ya alternándolos en el segundo array:
		for (i = 0; i < numeros.length; i++) {
			numeros[i] = (i+1);
			
			//Traza
			//numeros2[i] = (10-i);
			System.out.println("Número: " + numeros[i]);
		}
		for (i = 0; i< numeros.length; i++) {
			numeros2[i] = numeros[(numeros.length-1)-i];
		}
		
		System.out.println("El primer array es: " + Arrays.toString(numeros) + ". El segundo array es: " + Arrays.toString(numeros2));
	
	}
}
