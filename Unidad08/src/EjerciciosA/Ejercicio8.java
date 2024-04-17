package EjerciciosA;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero=0;
		
		System.out.println("Por favor, introduzca un número:");

		try {
			numero = sc.nextInt();
			System.out.println("Valor introducido: " + numero);
		} catch (Exception e) {
			System.out.println("Valor introducido incorrecto.");
		} 
	}

}
