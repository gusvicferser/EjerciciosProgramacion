package EjerciciosMaestroJedi;

import java.util.*;

public class Ejercicio4_Maes {

	public static void main(String[] args) {
		// Definimos scanner:
		Scanner sc = new Scanner(System.in);

		// Definimos variables:
		int x, cont, contador;

		// Pedimos al usuario un número y lo guardamos en una variable entera:
		System.out.println("Introduzca el número: ");
		x = sc.nextInt();
		System.out.println();

		//Creamos el primer bucle:
		for (cont = 1; cont <= x; cont++) {
			System.out.println("Tabla del " + cont + ": ");
			//Aquí saldrán las tablas de multiplicar dentro del bucle:
			for (contador = 1; contador <= 10; contador++) {
				System.out.println(contador + " x " + cont + " = " + cont*contador);
			}
			System.out.println();
		}
	}
}
