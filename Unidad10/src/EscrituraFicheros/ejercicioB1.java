package EscrituraFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicioB1 {

	public static void main(String[] args) {


		try {
			File fil = new File("DOCS/numeros.txt");
			Scanner lector = new Scanner(fil);
			int numero = 0;
			int maximo = Integer.MIN_VALUE;
			int minimo = Integer.MAX_VALUE;

			while (lector.hasNext()) {
				
				try {
				numero = lector.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("La línea está mal formateada");
					lector.next(); // Necesita esto para poder continuar.
					continue;
				} 
				
				if (numero>maximo) {
					maximo = numero;
				}
				
				if (numero<minimo) {
					minimo=numero;
				}
//				System.out.println(numero);
			}

			lector.close();
			System.out.println("Mínimo: " + minimo + ". Máximo: " + maximo);

		} catch (FileNotFoundException fnfe) {
			System.out.println("Archivo no encontrado.");
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}

	}

}
