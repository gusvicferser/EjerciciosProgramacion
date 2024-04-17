package UD04;

import java.util.*;

public class Ejercicio12_Vect {

	public static void main(String[] args) {
		
		//Iniciamos el Scanner:
		Scanner sc = new Scanner(System.in);
		
		//Iniciamos variables:
		int num, V, P;
		
		//Creamos el array:
		int matriz[] = new int[10];
		
		/*
		 * Vamos a crear un do while ya que el ejercicio nos pide que hagamos un pequeño menú con opciones
		 * desde el cual se salga con la tercera opción:
		 */
		do {
			
			//Ponemos el menú y las opciones por pantalla:
			System.out.println();
			System.out.println("Por favor, escoja una opción:");
			System.out.println("------------------------------");
			System.out.println("1. Mostrar Valores: ");
			System.out.println("2. Introducir Valor: ");
			System.out.println("3. Salir: ");
			System.out.println("------------------------------");
			
			//Metemos el número en la variable:
			num = sc.nextInt();
			
			//Para los distintos casos necesitamos un switch cuya activación sea con la variable:
			switch (num) {
				//Ahora los casos. El primero es ver el Array:
				case 1: 
					System.out.print("Contenido del Array { ");
					for (int i=0; i<matriz.length; i++) {
					System.out.print(matriz[i] + ", ");
					}
					System.out.print("} \n");
					break;
					
				case 2: 
					System.out.println("Introduzca un valor: ");
					V = sc.nextInt();
					
					System.out.println("Introduzca una posición en la matriz (entre 1 - 10): ");
					P = sc.nextInt()-1;
					
					matriz[P] = V; break;
					}
			
			
		} while (num!=3);
		System.out.println("Muchas gracias por usar Sistemas Gustavo.");
	}

}
