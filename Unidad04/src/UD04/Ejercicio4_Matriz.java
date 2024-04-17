package UD04;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio4_Matriz {

	public static void main(String[] args) {

		// Establecemos scanner:
		Scanner sc = new Scanner(System.in);

		// Inicializamos las variables:
		double media = 0;

		/*
		 * Inicializamos las matrices. La idea es que en la primera matriz se guardan
		 * las notas de los alumnos y luego ponemos una matriz de un array de máx
		 * tantos alumnos como haya. Se pone en double porque puede tener decimales:
		 */
		int[][] matriz = new int[4][5];
		double[] medias = new double[4];
		
		//Ahora hacemos el for para introducir las notas:
		for (int i = 0; i < matriz.length; i++) {

			for (int j = 0; j < matriz[i].length; j++) {
				
				System.out.println("Escriba La nota del alumno " + (i + 1) + ", en la asignatura " + (j + 1));
				/*
				 * Aquí vamos poniendo las clases y sumando los valores y almacenándolos en la matriz "medias" 
				 * en la posición del alumno en cuestion. La suma de los valores va a la posición que toca 
				 * y luego los dividimos:
				 */
				matriz[i][j] = sc.nextInt();
				medias[i]+=matriz[i][j];
			}
			/*
			 * Aquí la idea feliz ha sido de Sandra. No necesitamos una matriz que nos guarde las notas mínimas
			 * si podemos ordenar la matriz de menor a mayor con .sort. Ordenamos la matriz e invocamos el mínimo
			 * (que estará en la posición 0) y el máximo (que estará en el último valor del array):
			 * 
			 */
			
			Arrays.sort(matriz[i]);
		}
		/*
		 * Aquí hacemos un for para mostrar las notas de cada alumno que será cada fila o array (matriz.length)
		 * con el mínimo (matriz[i][0]) y el máximo (matriz[i][4]) que hemos mostrado y además, para hacer la media
		 * hemos de tomar el valor de todos sumados y dividirlo por la longitud del array (medias[i]/matriz[i].length):
		 */
		for (int i = 0; i < matriz.length; i++) {
					System.out.println("La notas notas del alumno " + (i + 1) + " son; Mínima: " + matriz[i][0]
							+ ". Máxima: " + matriz[i][4] + ". Media: " + (medias[i]/matriz[i].length) + ".");
				}
			}
		}
	

	

	
