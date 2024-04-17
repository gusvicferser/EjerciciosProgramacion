package unidad05;

import java.util.Scanner;

public class Ejercicio3_func {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int a, b, resultado;
		
		System.out.println("Por favor, introduzca dos números enteros: ");
		a= sc.nextInt();
		
		System.out.println("Introduzca ahora el segundo número: ");
		b= sc.nextInt();
		
		resultado=minimo(a, b);
		System.out.println("El mínimo entre los dos números es: " + resultado);

	}
	public static int minimo(int a, int b) {
		
		if (a>b) {
			return b; 
		} else if (a<b) {
			return a;
		} else return a;
		
	} //Es mucho más sencillo poner algo más simple. Si son iguales, da igual el valor que devuelva:
	/*if(a<b) {
	 * 	return a;}
	 * else return b;
	 */

}
