package unidad05;

import java.util.*;

public class Calculadora {
	
	// Creamos una función de menú que no retorna nada:
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int num;
		//Un bucle do para repetir el menú las veces que haga falta mientras no sea el 9:
		do {
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("Seleccione una opción de entre las siguientes:");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("1 - Suma dos números (positivos o negativos): ");
			System.out.println("2 - Resta dos números (positivos o negativos): ");
			System.out.println("3 - Multiplica dos números (positivos o negativos): ");
			System.out.println("4 - Divide dos números (positivos o negativos): ");
			System.out.println("5 - Calcula el área de un rectángulo (de entre 0 y un millón): ");
			System.out.println("6 - Calcula el área de un triángulo equilátero (de entre 0 y un millón): ");
			System.out.println("7 - Calcula el área de un círculo (de entre 0 y un millón): ");
			System.out.println("8 - Calcula el seno, coseno y la tangente de un ángulo dado (entre -360 y 360):");
			System.out.println("9 - Sal de la calculadora:");
			System.out.println("-------------------------------------------------------------------------------");

			num = sc.nextInt();
			sc.nextLine();
			//Como el bucle se repetirá mientras no se seleccione el nueve, he puesto un pequeño comentario para pedir un valor correcto.
			if (num > 9 || num < 0) System.out.println("Introduzca una opción de menú válida");
			// Switch con los casos posibles del 1 al 8:
			switch (num) {
				case 1:
					suma(); break;
				case 2:
					resta(); break;
				case 3:
					multiplicacion(); break;
				case 4:
					division(); break;
				case 5:
					rectangulo(); break;
				case 6:
					triangulo(); break;
				case 7:
					circulo(); break;
				case 8:
					sen_cos_tan(); break;
				} System.out.println();
		} while (num!=9);
		//Mensaje de despedida al salir del "do while":
		System.out.println("Gracias por haber confiado en Sistemas Gustavo Víctor para su calculadora\n\nMientras esperamos que la experiencia haya sido de su agrado, tenga un fascinante día.");
	}
	//Función para verificar que el valor en las opciones de la 5 a la 8 es correcto:
	public static double valorCorrecto(int min, int max){
		/*
		 * Iniciamos dos variables, el correcto, que es un booleano, nos servirá para controlar el valor 
		 * y devolverlo, más una variable de doble en el num:
		 */
		boolean correcto = true;
		double num;
		Scanner sc = new Scanner(System.in);
		//Bucle while porque desconocemos las iteraciones necesarias:
		while (correcto) {
			System.out.println("Introduzca un valor: ");
			num = sc.nextDouble();
			//Si el valor es inferior al minimo o superior al máximo, entra en el 'if':
			if (num < min || num > max) {
				System.out.println("El valor ha de estar entre " + (min) +  " y " + (max) + ". Pruebe de nuevo.");
				correcto = true;						
			} else {
				correcto = false;
				//Pequeño mensaje para verificar que el valor ha sido aceptado:
				System.out.println("Valor aceptado\n");
				return num;
			}
		} return 0.0;
	}
	//Esta función servirá para sumar valores y mostrarlos:
	public static void suma() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer valor: ");
		double a = sc.nextDouble();
		System.out.println("Introduzca el segundo valor: ");
		double b = sc.nextDouble();
		System.out.printf("Su resultado de sumar %.2f y %.2f es = %.2f\n", a, b, (a+b));
	}
	//Esta función restar dos números y los muestra por pantalla:
	public static void resta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer valor: ");
		double a = sc.nextDouble();
		System.out.println("Introduzca el segundo valor: ");
		double b = sc.nextDouble();
		System.out.printf("Su resultado de restar %.2f y %.2f es = %.2f\n", a, b, (a-b));
	}
	//Hacemos función para multiplicar y mostrarlo:
	public static void multiplicacion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer valor: ");
		double a = sc.nextDouble();
		System.out.println("Introduzca el segundo valor: ");
		double b = sc.nextDouble();
		System.out.printf("Su resultado de multiplicar %.2f y %.2f es = %.2f\n", a, b, (a*b));
	}
	//Esta función debe mostrar una división pero nunca puede ser entre cero. Para eso le añadimos un escaner:
	public static void division() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer valor: ");
		double a = sc.nextDouble();
		System.out.println("Introduzca el segundo valor: ");
		double b = sc.nextDouble();		
		// En el caso de la división hemos de poner la única condición de que no puede ser entre 0:
		while (b == 0) {
			System.out.println("El divisor b no puede ser 0, por favor, seleccione otro número:");
			b = sc.nextDouble();
		}
		System.out.printf("Su resultado de dividir %.2f y %.2f es = %.2f\n", a, b, (a/b));
	}
	//Función del rectángulo que es multiplicar lado por lado y mostrar por pantalla:
	public static void rectangulo() {
		Scanner sc = new Scanner(System.in);
		int min = 0, max = 1000000;
		double a = valorCorrecto(min, max), b = valorCorrecto(min, max);
		System.out.printf("Su área de rectángulo de lado %.2f y lado %.2f es = %.2f\n", a, b, (a*b));
	}
	//Función del triángulo que es lado por lado, dividiéndolo entre dos y mostrando por pantalla:
	public static void triangulo() {
		int min = 0, max = 1000000;
		double a = valorCorrecto(min, max), b = valorCorrecto(min, max);
		System.out.printf("Su área de triángulo con base %.2f y altura %.2f es = %.2f\n", a, b, ((a*b)/2));
	}
	//Función del área del círculo que es lado al cuadrado y luego por PI:
	public static void circulo() {
		int min = 0, max = 1000000;
		double x = valorCorrecto(min, max);		
		System.out.printf("Su área de círculo con radio %.2f es = %.2f\n", x, ((x*x)*Math.PI));
	}
	/*
	 * Ahora haremos la función del seno, coseno y tangente del número que nos
	 * proporcionen. Para ello se me ha ocurrido que podemos hacerlo todo con una
	 * misma función y un bucle for de 3 iteraciones a la entrada de datos:
	 */
	public static void sen_cos_tan() {
		
		int min = -360, max = 360;
		double x = valorCorrecto(min, max);
		//Para averiguar el seno, coseno y tangente correctos, hemos de pasar el valor en grados a radianes:
		x = Math.toRadians(x);
		for (int i = 0; i < 3; i++) {
			//Traza 1:
			//System.out.println("X = " + x);
			if (i == 0) {
				System.out.printf("Su seno es %.3f // ", Math.sin(x));
			} else if (i == 1) {
				System.out.printf("Su coseno es %.3f // ", Math.cos(x));
			} else {
				System.out.printf("Su tangente es %.3f\n", Math.tan(x));
			}		
		}
	}
	//Nuestra función principal que sólo necesita de tres líneas:
	public static void main(String[] args) {		
		System.out.println("Bienvenido a la primera calculadora de Sistemas Gustavo Victor:");
		// Hemos creado una función de menú y de momento es todo lo que necesitamos en el main:
		menu();
	}
}
