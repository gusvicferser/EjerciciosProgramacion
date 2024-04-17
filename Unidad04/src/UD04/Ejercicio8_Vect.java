package UD04;
import java.util.*;
public class Ejercicio8_Vect {

	public static void main(String[] args) {
		
		//Inicializamos el scanner:
		Scanner sc = new Scanner(System.in);
		
		//Inicializamos las variables:
		int i;
		double valor, suma = 0;
		
		//Creamos el array:
		double numeros[] = new double[100];
		
		//Creamos un for para introducir los números aleatorios en el array: (max*min)+1+min)
		for (i = 0; i < 100; i++) {
			numeros[i]=  Math.random();
			//Traza de control para asegurarnos de que introduce los valores válidos:
			//System.out.println(numeros[i]);
		}
		
		//Le pedimos al usuario un valor real:
		System.out.println("Por favor, introduzca un valor real entre 0.0 y 1.0: ");
		valor = sc.nextDouble();
		
		//En el bucle creamos un if para que cada vez que encuentre un valor igual o superior se añada uno al contador de suma:
		for (i = 0; i < 100; i++) {
			if (valor<=numeros[i]) suma+=1;

		}
		
		//Imprimimos por pantalla:
		System.out.printf("Los valores que son iguales o superiores son %.0f", suma);
			
			
		}
		

	}


