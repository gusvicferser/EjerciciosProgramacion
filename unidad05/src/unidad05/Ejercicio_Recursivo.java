package unidad05;

import java.util.Scanner;
import java.util.concurrent.RecursiveAction;

public class Ejercicio_Recursivo {

	public static void main(String[] args) {
		
		boolean binario = true;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba su número para comprobar si es binario: ");
		num = sc.nextInt();
		
		if (recursiva(num)) {
			System.out.println(num + " es binario.");
		} else {
			System.out.println(num + " no es binario.");
		}
		

	}
	public static boolean recursiva(int num) {
		
	return true;	
	}
	

}
