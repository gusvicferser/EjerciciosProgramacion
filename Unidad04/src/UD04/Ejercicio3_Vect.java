package UD04;
import java.util.*;
public class Ejercicio3_Vect {

	public static void main(String[] args) {
		
		//Iniciamos el scanner:
		Scanner sc= new Scanner(System.in);
		
		//Iniciamos la variable de index y el array;
		int i;
		double min,max;
		double[] numeros = new double[10];
			
		
		//Un bucle for para introducir los números en las posiciones del array;
		for (i = 0; i < numeros.length; i++) {
			System.out.println("Por favor, escriba el número que va en la posicion " + i+1 + ":");
			numeros[i] = sc.nextInt();
			System.out.println("Posición: " + i + " = "  + numeros[i]);

	}	//Es muy importante que inicialicemos antes (colocando los números) 
		max = numeros [0];
		min = numeros [0];
		
		//Hacemos un bucle for para imprimir los números del array.
		for (i=0; i< numeros.length; i++) {
			if (numeros[i] < min) min = numeros[i];
			if (numeros[i] > max) max = numeros[i];
		}
		System.out.println("El min es: " + min + ". El max es: " + max);

	}}