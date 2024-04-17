package unidad05;

import java.util.Scanner;

public class Ejercicio8_func {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sumatorio, productorio, n;
		double intermedio;
		
		System.out.println("Por favor, introduzca un número N: ");
		n = sc.nextInt();
		
		sumatorio = suma1aN(n);
		productorio = producto1aN(n);
		intermedio = intermedio1aN(n);
		
		System.out.printf("El sumatorio de %d es %d, el productorio es %d y el valor intermedio es %.2f.", n, sumatorio, productorio, intermedio);
		
	}

	public static int suma1aN (int n) {
		
		int suma =n;
		
		for (int i=0; i<n; i++) {
			
			suma +=i;
		}
		return suma;	
	}
	
	public static int producto1aN(int n) {
		
		int producto =1;
		
		for (int i=1; i<=n; i++) producto*=i;
	
		return producto;	
	}
	
	public static double intermedio1aN(int n) {
		
		int media =n;
				
			for (int i=0; i<n; i++) {
					
				media +=i;
				//System.out.print(media + ", ");
			}
			return media/n;
		
	}
	
}
