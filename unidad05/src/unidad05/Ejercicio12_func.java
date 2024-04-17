package unidad05;

import java.util.Scanner;

public class Ejercicio12_func {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double k;
		
		System.out.println("Introduzca los kilómetros para cambiarlos a millas: ");
		k = sc.nextDouble();
		
		System.out.printf("%.3f son %.3f millas.", k, km_a_millas(k));

	}
	
	public static double km_a_millas(double k) {
		
		return k/1.60934;
		
	}

}
