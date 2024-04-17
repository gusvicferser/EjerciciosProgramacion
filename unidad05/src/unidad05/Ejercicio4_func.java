package unidad05;

import java.util.Scanner;

public class Ejercicio4_func {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int a, resultado;
		
		System.out.println("Por favor, introduzca un número entero: ");
		a= sc.nextInt();
		
		resultado = dimeSigno(a);
		if (resultado==-1) System.out.println("Negativo");
		else if (resultado==1) System.out.println("Positivo");
		else System.out.println("Es cero");
		

	}
	public static int dimeSigno (int a) {
		
		if (a>0) {
			return 1;
		} else if (a<0) {
			return -1;
		} else return 0;
		
	}

}
