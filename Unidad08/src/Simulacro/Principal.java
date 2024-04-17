package Simulacro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num =0, salas =0;
		
		System.out.println("¿Cuántas salas tiene el cine?");
		
		do {
			System.out.println("****************KINEPOLIS****************");
			System.out.println("1 - Encolar cliente en una sala");
			System.out.println("2 - Desencolar cliente de una sala");
			System.out.println("3 - Estado de una cola");
			System.out.println("4 - Salir");
			System.out.println("*****************************************");
			
			num = comprobarNumero();
			
			switch (num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println("Gracias por haber usado Gustavo Victor sistemas.\nEsperamos que haya disfrutado de su experiencia.");
			}
			
		} while(num!=4);

	}
	
	private static int comprobarNumero() {
		
		int num;
		try {
			num = sc.nextInt();
			return num;
		} catch (InputMismatchException noNumero) {
			System.out.println("Me temo que no ha introducido un número. Vuelva a probar:");
		}
		return 0;
	}

}
