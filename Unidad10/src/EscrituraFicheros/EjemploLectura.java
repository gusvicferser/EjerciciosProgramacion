package EscrituraFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploLectura {

	public static void main(String[] args) {
		
		int i = 0;
		
		try {
			File fil = new File("DOCS/numeros.txt");
			Scanner lector = new Scanner(fil);
			int numero = 0;
			/*for(i=0; i<10; i++) {
			numero = lector.nextInt();
			System.out.println(numero);
			}*/
			
			while (lector.hasNext()) {
				numero = lector.nextInt();
				System.out.println(numero);
			}
			
			lector.close(); // Es IMPORTANTE cerrar el scanner con los file!!!!
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("Archivo no encontrado.");
			
		} catch (InputMismatchException ime) {
			System.out.println("No existe un número en la línea " + (i+1));
		}
	}
}
