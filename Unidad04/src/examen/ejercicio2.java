package examen;

import java.util.*;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int M,N, mina ;
			

		System.out.println("Bienvenido al buscaminas.\n\nIntroduzca un número de filas M: ");
		M =sc.nextInt();
		
		System.out.println("Ahora el número de columnas N: ");
		N = sc.nextInt();
		
		String minas[][]= new String[M][N];
		
		for (int i = 0; i<M; i++) {
			mina = (int) (Math.random()*(N));
			
			//Traza 1: 
			//System.out.println("Mina está en: " + mina);
		
			for (int j=0; j<N; j++) {
				if(mina==j) {
				minas[i][j] ="*";
				} else {
				minas[i][j]= ".";
				}
			System.out.print(minas[i][j]);	
			} 
			System.out.println();
			
			//Traza 2:
			//System.out.println(Arrays.toString(minas[i]));
		

	}

}
}
