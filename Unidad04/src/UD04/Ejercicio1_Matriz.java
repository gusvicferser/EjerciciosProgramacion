package UD04;

public class Ejercicio1_Matriz {

	public static void main(String[] args) {
		
		int cont =1;
		int[][] matriz = new int[5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = cont;
				cont++;
				System.out.printf("%4d", matriz[i][j]);
			}
			System.out.println();
		}

	}

}
