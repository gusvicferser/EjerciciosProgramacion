package ProgramaMe;

import java.util.Arrays;
import java.util.Scanner;

public class FaseFinal {
	
	private static String[] equipos = new String[64];
	private static String[] aux = new String[32];
	private static String[] resultados = new String[64];
	private static int[] ganadores = new int[32];
	private static int contador = 0; 
	private static int equicont = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, numero;
		
		do {
			n=sc.nextInt();
			sc.nextLine();
			if (n!=0) {	
				for (int i=0; i<n; i++) {
					equipos[i] = sc.nextLine();
				}
				
				for (int i=0; i<(n/2); i++) {
					resultados[i] = sc.nextLine();
					ganadores(i);				
				}
		
				while (n>2) {
					n=(n/2);
					for (int i=0; i<n; i++) {
						ganadores(i);
					}
					contador=0;
					equicont=0;
					for (int i=0; i<n; i++) {
						equipos[i] = aux[i];
					}
					for (int i=0; i<n; i++) {
						resultados[i] = sc.nextLine();
						ganadores(i);
					}
				}
				
				if (ganadores[0]>ganadores[1]) {
					System.out.println(equipos[0]);
				} else {
					System.out.println(equipos[1]);
				}
				Arrays.fill(resultados, 0);
				Arrays.fill(equipos, "");
			}
		} while (n!=0);
	}
	
	public static void ganadores(int posicion) {
		int control, n1, n2;
		
		control = resultados[posicion].indexOf(" ");
		n1=Integer.parseInt(resultados[posicion].substring(0, control));
		n2=Integer.parseInt(resultados[posicion].substring(control, resultados[posicion].length()));
		
		if (n1>n2) aux[contador] = equipos[equicont];
		else aux[contador] = equipos[(equicont+1)];
		contador++;
		equicont+=2;
	}
}

