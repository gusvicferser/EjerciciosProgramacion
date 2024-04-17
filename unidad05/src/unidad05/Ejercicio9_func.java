package unidad05;

import java.util.Scanner;

public class Ejercicio9_func {

	public static void main(String[] args) {
		
		int a, b, c, mayor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número: ");
		a = sc.nextInt();
		
		System.out.println("Introduzca el segundo número: ");
		b= sc.nextInt();
		
		System.out.println("Introduzca el tercer número: ");
		c= sc.nextInt();
		
		mayor = elevado(elevado(a,b), c);

		System.out.println("El mayor es: " + mayor);
		
	}
	public static int elevado(int a, int b) {
		/*if (a>b) {
			return a;
		} else return b;
		*/
		//También se puede poner return a>b? (el interrogante es un 'if' y las opciones se pueden poner entre puntos) a:b;
		return a>b? a:b;
	}

}
