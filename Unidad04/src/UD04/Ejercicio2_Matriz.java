package UD04;

public class Ejercicio2_Matriz {

	public static void main(String[] args) {
		
		int[][] matriz = new int[10][10];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (i+1)*(j+1);
				
				System.out.printf("%4d", matriz[i][j]);
			}
			System.out.println();
		}

	}
}

