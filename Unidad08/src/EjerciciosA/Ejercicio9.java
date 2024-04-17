package EjerciciosA;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numA = 0, numB;
		double division;

		while (true) {
			System.out.println("Por favor, introduzca un número A:");
			
			// Hacemos la primera petición:
			try {
				numA = sc.nextInt();
				// System.out.println("Valor introducido: " + numero);
				
				// Si pasa por aquí hacemos la segunda petición:
				while (true) {
					System.out.println("Introduzca el valor de un número B:");
					try {
						numB = sc.nextInt();
						try {
							division = (double) (numA / numB);
							System.out.printf("La división de los dos números es: %.2f" , division);
							break;
						} catch (Exception e) {
							sc.nextLine();
							System.out.println("El número no puede ser 0.");
						}
					} catch (Exception e) {
						sc.nextLine();
						System.out.println("Valor de B introducido es incorrecto. Vuelva a intentarlo.");
					}
				}
				break;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("Valor de A introducido es incorrecto. Vuelva a intentarlo.");
			}
		}
	}

}
