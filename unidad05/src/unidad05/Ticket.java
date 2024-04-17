package unidad05;

import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		int opcion, numPro =0;
		int iva; 
		double suma=0;
		String[] productos= new String[10];
		double[] precios = new double[10];
		Scanner sc = new Scanner(System.in);
		do {
			/*
			 * Con este if nos aseguramos de que el usuario
			 * nunca introduzca más productos de los que puede
			 * almacenar el array:
			 */
			if (numPro==productos.length) {
				opcion=3;
			} else {
				mostrarMenu();
				opcion=sc.nextInt();
			}
			switch(opcion) {
			case 1:
				addProduct(productos, precios, numPro);
				precios[numPro] = calcIVA(precios[numPro]);
				suma+=precios[numPro];
				numPro++; 
				break;

			case 2: 
				addProduct(productos, precios, numPro);
				iva = pedirIVA();
				precios[numPro]=calcIVA(precios[numPro],iva);
				suma+=precios[numPro];
				numPro++;
				break;
			case 3: 
				//Hemos creado una función para mostrar el precio:
				mostrarPrecio(productos, precios, suma);break;
			default: System.out.println("Opción no válida"); break;
			}
		}while(opcion!=3);
	}
	public static int pedirIVA() {
		int iva;
		System.out.println("Introduce el IVA especial: ");
		Scanner sc = new Scanner(System.in);
		iva=sc.nextInt();
		return iva;
	}
	public static void addProduct(String[] productos, double[] precios, int numPro) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el nombre del precio:");
		productos[numPro] = sc.nextLine();
		
		System.out.println("Introduce el valor sin iva:");
		precios[numPro]=sc.nextDouble();
		sc.nextLine();
	}
	public static void mostrarMenu() {
		System.out.println("---------------------------------------------");
		System.out.println("1.Añade precio con IVA normal (21%)");
		System.out.println("2.Añade precio con IVA especial");
		System.out.println("3.Muestra total del pedido con IVA y finaliza");
		System.out.println("---------------------------------------------");
	}
	
	public static void mostrarPrecio(String[] productos, double[] precios, double suma) {
		System.out.println("\nSUPERMERCADOS GUSTAVO VICTOR");
		System.out.println("------------------------------");
		for (int i=0; i<productos.length; i++) {
			System.out.printf("%s\t\t%.2f€\t\t\n", productos[i], precios[i]);
		} 
		System.out.println("------------------------------");
		System.out.printf("Su total acumulado es %.2f€.\n", suma);
		System.out.println("------------------------------");
		System.out.println("GRACIAS POR SU VISITA");
	}
	
	public static double calcIVA(double x) {
		return x*1.21;
	}
	
	public static double calcIVA(double x, int iva) {
		return x+x*(iva/100.0);
	}
}	