package unidad05;

import java.util.Scanner;

public class Ejercicio5_func {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int a; 
		double resultado;
		
		System.out.println("Por favor, introduzca un número entero de millas: ");
		a= sc.nextInt();

		resultado = millas_a_kilometros(a);
		System.out.println(a + " millas son " + resultado + " kilómetros.");
		
	}
	
	public static double millas_a_kilometros (int millas) {
		
		double kilometros = millas*1.60934;
		
		return kilometros;
		
		/*
		 * Se puede poner mejor como
		 * 
		 * return 1.60934 * millas; 
		 */
		
	}
	
	
	
}
