package unidad05;

import java.util.*;

public class Ejercicio11_func {

	public static void main(String[] args) {
		
		short n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número para obtener su tabla de multiplicar: ");
		n= sc.nextShort();
		
		multiplicar(n);

	}
	public static void multiplicar(short n) {
		
		System.out.println("Tabla de multiplicar de " + n + ":\n");
		
		for (int i=0; i<=10; i++) {
			System.out.printf("%d x %d\t = %d\t%n", n, (i+1), n*(i+1));
		}
		
	}

}
