package UD04;

import java.util.*;

public class Ejercicio3_Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, m, contpos = 0, contcero = 0, contneg = 0;
		System.out.println("Ponga el número de filas: ");
		n = sc.nextInt();

		System.out.println("Ponga el número de columnas: ");
		m = sc.nextInt();
		System.out.println();

		int[][] matriz = new int[n][m];

		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {

				System.out.println("Escriba el número de la fila " + (i + 1) + ", y la columna " + (j + 1));
				matriz[i][j] = sc.nextInt();

				if (matriz[i][j] > 0) {
					contpos += 1;
				} else if (matriz[i][j] == 0) {
					contcero += 1;
				} else {
					contneg += 1;
				}

			}
		}
		System.out.println("Positivos = " + contpos + ". Ceros = " + contcero + ". Negativos = " + contneg);

	}
}
