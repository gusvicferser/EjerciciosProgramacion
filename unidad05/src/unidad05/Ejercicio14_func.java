package unidad05;

import java.util.*;

public class Ejercicio14_func {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase;
		char caract;
		int num;
		
		System.out.println("Introduzca un caracter para escribirlo: ");
		frase=sc.nextLine();
		caract= frase.charAt(0);
		
		System.out.println("Introduzca el número de veces que ha de repetirse: ");
		num=sc.nextInt();
		sc.nextLine();
		
		piramide(caract, num);
	}
	
	public static void piramide(char caract, int num) {
		
		for (int i=0; i<num; i++) {
			for (int j=0; j<(num*2)+1; j++) {
				//if (j=)
			}
			System.out.println();
		}
	}
}
