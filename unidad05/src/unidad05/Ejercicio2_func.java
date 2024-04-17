package unidad05;

import java.util.*;

public class Ejercicio2_func {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a;
		boolean mayor;
		
		System.out.println("Por favor, introduzca una edad para verificar si es mayor de edad: ");
		a=sc.nextInt();
		
		mayor = esMayorEdad(a);
		
		//Java por defecto interpretará que el estamento de dentro del paréntesis del if() es true. 
		if (mayor==true) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
		
	}

	public static boolean esMayorEdad(int a) {
		
		boolean edad;
		
		if (a>=18) {
			return edad=true;
		}
		else { 
			return edad=false;
		}
	}
}
