package unidad05;

import java.util.Scanner;

public class Ejercicio6_func {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	double a;
	
	for (int i=0; i<5; i++) { 		
		System.out.println("Por favor, introduzca el precio: ");
		a=sc.nextDouble();
		System.out.print("El precio es: ");
		System.out.printf("%.2f euros. \n", precioConIVA(a));
		}
	}
	
	public static double precioConIVA (double precio) {
		return precio*1.21;	
	}
}
