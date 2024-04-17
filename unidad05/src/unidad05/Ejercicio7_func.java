package unidad05;

import java.util.Scanner;

public class Ejercicio7_func {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double ancho, alto, p, a;
		
		System.out.println("Por favor, introduzca el ancho del rectángulo: ");
		ancho = sc.nextDouble();
		
		System.out.println("Por favor, introduzca el alto del rectángulo");
		alto = sc.nextDouble();
		
		//Llamamos a las funciones y les asignamos una variable:
		p = perimetroRectangulo(ancho, alto);
		a = areaRectangulo(ancho, alto);
		
		System.out.printf("El perímetro es: %.2f. El área es: %.2f.", p, a);

	}
	//Creamos las funciones. Han de devolvernos doubles.
	public static double perimetroRectangulo(double ancho, double alto) {
		
		return ancho+alto;
		
	}
	
	public static double areaRectangulo(double ancho, double alto) {
		
		return ancho*alto;
		
	}

}
