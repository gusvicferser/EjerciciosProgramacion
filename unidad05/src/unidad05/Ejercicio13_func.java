package unidad05;

import java.util.Scanner;

public class Ejercicio13_func {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double precio, precio_desc;
		
		System.out.println("Introduzca el precio SIN descuento: ");
		precio = sc.nextDouble();
		
		System.out.println("Introduzca el precio ya descontado: ");
		precio_desc=sc.nextDouble();
		
		System.out.printf("Su descuento es %.2f%%", descuento(precio, precio_desc));

	}
	
	public static double descuento(double precio, double precio_desc) {
		
		return 100-(100*precio_desc)/precio;
	}

}
