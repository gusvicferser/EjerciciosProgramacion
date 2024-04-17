package UD04;

import java.util.*;

public class Ejercicio7_Vect {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int p,q, prueba;
		
		System.out.println("Introduzca el primer valor: ");
		p = sc.nextInt(); 
		
		System.out.println("Introduce el segundo valor: ");
		q = sc.nextInt();
		
		prueba = q-p+1;
		
		int[] numeros = new int[prueba];
		
		for (int i=0; i<prueba; i++) numeros [i] = (p+i);
		
		System.out.println(Arrays.toString(numeros));
		
		

	}

}
