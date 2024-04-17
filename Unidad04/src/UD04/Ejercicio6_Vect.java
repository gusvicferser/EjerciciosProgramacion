package UD04;

import java.util.*;

public class Ejercicio6_Vect {

	public static void main(String[] args) {

		// Iniciamos el scanner:
		Scanner sc = new Scanner(System.in);

		// Iniciamos la variable de index y el array;
		
		int n,m;
		System.out.println("Escriba el primer número: ");
		n = (int)sc.nextInt();
		
		int[] numeros = new int[n];
		
		System.out.println("Escriba el segundo número: ");
		m= sc.nextInt();
		
		for (int i=0; i < numeros.length; i++)
			numeros[i] = m;
		
		//Arrays.fill(numeros, m);
		
		System.out.println(Arrays.toString(numeros));
		

		

	}

}
