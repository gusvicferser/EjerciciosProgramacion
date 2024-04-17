package UD04;

import java.util.*;

public class Ejercicio2_Vect {

	public static void main(String[] args) {
		//Iniciamos el scanner:
		Scanner sc= new Scanner(System.in);
		
		//Iniciamos la variable de index y el array;
		int i;
		double suma =0;
		double[] numeros = new double[10];
		
		//Un bucle for para introducir los números en las posiciones del array;
		for (i = 0; i < numeros.length; i++) {
			System.out.println("Por favor, escriba el número que va en la posicion " + (i+1) + ":");
			numeros[i] = sc.nextDouble();
			System.out.println("Posición: " + (i+1) + " = "  + numeros[i] + "\n");

	}
		//Hacemos un bucle for para sumar los números del array.
		for (i=0; i<numeros.length; i++) suma += numeros[i];

		System.out.println(suma);
	}
	

	}


