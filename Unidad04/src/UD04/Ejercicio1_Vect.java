package UD04;
import java.util.*;
public class Ejercicio1_Vect {

	public static void main(String[] args) {
		
		//Iniciamos el scanner:
		Scanner sc= new Scanner(System.in);
		
		//Iniciamos la variable de index y el array;
		int i;
		double[] numeros = new double[10];
		
		//Un bucle for para introducir los números en las posiciones del array;
		for (i = 0; i < numeros.length; i++) {
			System.out.println("Por favor, escriba el número que va en la posicion " + (i+1) + ":");
			numeros[i] = sc.nextDouble();
			System.out.println("Posición: " + (i+1) + " = "  + numeros[i]);

	}
		//Hacemos un bucle for para imprimir los números del array.
		for (i=0; i<numeros.length; i++) System.out.print(numeros[i] + ", ");

	}}
