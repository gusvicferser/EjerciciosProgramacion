package EjerciciosMaestroJedi;
import java.util.*;
public class Ejercicio5_Maes {

	public static void main(String[] args) {
		// Definimos scanner:
		Scanner sc = new Scanner(System.in);

		// Definimos variables (Aquí necesito otras dos variables definidas a cero para hacer la suma:
		int x, cont, contador, suma = 0, add = 0;

		// Pedimos al usuario un número y lo guardamos en una variable entera:
		System.out.println("Introduzca el número: ");
		x = sc.nextInt();
		
		System.out.println();

		//Creamos el primer bucle:
		for (cont = 1; cont <= x; cont++) {
			System.out.println("Tabla del " + cont + ": ");
			
			//Aquí saldrán las tablas de multiplicar dentro del bucle:
			for (contador = 1; contador <= 10; contador++) {
				//Aquí realizamos la operación:
				add = cont*contador;
				//Sustituimos aquí el cont*contador por add:
				System.out.println(contador + " x " + cont + " = " + add);
				//Aquí vamos añadiendo a la variable suma el resultado de cada iteración:
				suma += add; 
			}
			//Al final de cada uno se imprimirá por pantalla la suma:
			System.out.println("Suma = " + suma + "\n");
			
		}
	}
}