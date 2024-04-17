package unidad05;

import java.util.*;

public class Ejercicio1_func {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		double a, b, resultado;
		
		System.out.println("Por favor, introduzca dos números reales: ");
		a= sc.nextDouble();
		
		System.out.println("Introduzca ahora el segundo número: ");
		b= sc.nextDouble();
		
		//Llamamos a la función que crearemos;
		resultado = multiplica(a,b);
		System.out.println("El resultado es: " + resultado);
		

	}
	public static double multiplica(double a, double b) {

		return a*b;
		
	}
	

}
