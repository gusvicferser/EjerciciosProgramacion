package UD04;

//Importamos esta categoría de Arrays de java:
import java.util.Arrays;
import java.util.Scanner;

/*
 * Utilización de métodos de la clase Arrays:
 */
public class OtrasOtrasOtrasCosasClase {

	public static void main(String[] args) {
		
		//int[] numeros;
		//numeros = new int[10];
		
		
		Scanner sc= new Scanner(System.in);
		
		/*for (int i=0;i<10;i++) {
			System.out.println("Escribe el número: " + i);
			numeros[i]= sc.nextInt();
		}*/
		
		int[] numeros = {1, 3, 1};
		int pos =0;
		Arrays.sort(numeros); //¡¡Solo ordena ascendentemente!!
		pos = Arrays.binarySearch(numeros, 1);
		System.out.println(Arrays.toString(numeros));
		System.out.println("En la posición: " + pos);
		
		
		/*
		 * Métodos de Java en otros lenguajes engloba dos formas de almacenar la información: 
		 * Function (Función): De la que esperamos algo en retorno o 
		 * Procedure (Procedimientos): Que son aquellos que almacenan algo pero no devulven nada.
		 */
		
		//Arrays.sort(numeros); //Solamente ordena ascendentemente.
		//System.out.println(Arrays.toString(numeros));
		
		/*Definimos cómo llenar el vector:
		//int n = 8;
		
		//fill sirve para llenar un vector:
		//Arrays.fill(numeros, n);
		
		/*
		 * Arrays fill lo que hace es modificar los números que le indiquemos de la siguiente manera:
		 * el primer número es la primera posición, el segundo es el número donde acaba (sin incluírlo)
		 * y el tercer número es el que va a sustituir el que hay:
		 */
		//Arrays.fill(numeros, 3,5,7);
		
		/*
		 * Array.toString(); sirve para analizar o hacer trazas porque muestra el vector como una String.
		 * Nos ahorra el bucle for.
		 */
		
/*		System.out.println(Arrays.toString(numeros));
		
		//Bucle for para mostrar el array entero.
		//for (int i=0; i<10; i++) System.out.println(numeros[i]);

		/*
		 * Arrays.fill() puede usarse como substring de esta forma:
		 * Arrays.fill(nombre de la matriz, posición en la cual queremos que empiece, posición en la que queremos que termine, valor con el que queremos rellenarlo);
		 * Arrays.fill(numeros, cont, cont+1, valor);
		 


*/
		
		
	}

}
