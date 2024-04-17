package UD04;
import java.util.*;
public class Ejercicio9_Vect {

	public static void main(String[] args) {
		
		//Inicializamos el scanner:
		Scanner sc = new Scanner(System.in);
		
		//Inicializamos las variables:
		int i, valor, suma = 0;
		
		//Creamos el array:
		int numeros[] = new int[100];
		
		//Creamos un for para introducir los números aleatorios en el array: (max*min)+1+min). En este caso son 10.
		for (i = 0; i < 100; i++) {
			numeros[i]= (int) (Math.random()*(10-1+1)+1);
			//Traza de control para asegurarnos de que introduce los valores válidos:
			//System.out.println(numeros[i]);
		}
		
		//Le pedimos al usuario un valor real:
		System.out.println("Por favor, introduzca un valor real: ");
		valor = sc.nextInt();
		
		System.out.print("El número se encuentra en la posición: {");
		
		for (i = 0; i < 100; i++) {
			if (valor==numeros[i]) System.out.print(i + ", ");

		}
		System.out.println("}");
			
			
		}
		

	}