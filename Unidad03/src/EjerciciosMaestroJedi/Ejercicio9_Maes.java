package EjerciciosMaestroJedi;
import java.util.*;
public class Ejercicio9_Maes {

	public static void main(String[] args) {

		// Creamos el scanner:
		Scanner sc = new Scanner(System.in);

		// Especificamos las variables:
		int asteriscos, fila, blancos, contador, cont;

		// Le pedimos al usuario un número y lo asignamos a una variable:
		System.out.println("Introduzca un número: ");
		fila = sc.nextInt();

		// Comenzamos el bucle:
		for (cont = 1; cont <= fila; cont++) {
			
			/*La idea feliz es que necesitaremos dos bucles. Uno que dibuje los espacios y otro que dibuje los asteriscos.
			* Para ello creamos una variable llamada blancos que serán los espacios en blanco y una variable asteriscos
			*  que cada vez se hará más grande. Mientras un bucle escribe cada vez menos, el otro bucle escribe más.
			*  Eso lo logramos con la fórmula de blancos es igual a las filas menos el cont del bucle principal y asteriscos
			*  es la fila menos esos espacios que cada vez se hacen menos:
			*/
			blancos = fila - cont;
			asteriscos = fila - blancos;
//			System.out.println(blancos + "/" + asteriscos); //Traza 1 de control.
			
			//En este primer bucle se van poniendo los espacios en blanco en un print (acumulándose) y haciéndose la pirámide entonces invertida y más pequeña:
			for (contador = 1; contador <= blancos ; contador++) {
				System.out.print(" ");
			}
			
			//En este segundo bucle se van dibujando los asteriscos cuya pirámide va ocupando más campos según crece la línea:
			for (contador = 1; contador <= asteriscos; contador ++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}