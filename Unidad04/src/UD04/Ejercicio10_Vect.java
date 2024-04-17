package UD04;
import java.util.*;
public class Ejercicio10_Vect {

	public static void main(String[] args) {
		
		//Inicializamos el scanner:
		Scanner sc = new Scanner(System.in);
		
		//Inicializamos las variables:
		int i, numero, encimaMedia =0, debajoMedia =0;
		double altura, max=0, min=100, suma =0, media =0; 
		
		//Le pedimos al usuario la longitud del array:
		System.out.println("Por favor, introduzca un número total de valores: ");
		numero = sc.nextInt();
		
		//Creamos el array:
		double alt[] = new double[numero];
		
		//Creamos el bucle:
		for (i=0; i < alt.length; i++) {
			System.out.println("Introduzca la altura y pusle enter: ");
			altura = sc.nextDouble();
			alt[i]= altura; 
			
			//Mientras estamos en el bucle podemos ya almacenar los máximos y los mínimos en una variable con dos if:
			suma += altura;
			if (max<alt[i]) {
				max = alt[i];
			} else if (min>alt[i]) {
				min = alt[i];
			}
		}
		//Aquí hacemos la media de las alturas:
		media = (suma/alt.length);
		
		//Traza 1:
		//System.out.println("La media es: " + media + ". El max es: " + max + ". El min es: " + min);
		
		//Un for para colocar aquellas alturas por encima de la media y otra para las alturas por debajo en un if con varias condiciones:
		for (i=0; i < alt.length ; i++) {
			if (alt[i]>media) {
				encimaMedia +=1;
			}
		else if (alt[i]<media) {
				debajoMedia +=1;
		}
		}
		//Traza 2:
		//System.out.println("Por encima: " +  encimaMedia + ". Por debajo: " + debajoMedia);
		
		System.out.printf("La altura máxima es: %.2f, la altura mínima es: %.2f, la media es: %.2f, la cantidad por encima de la media son: %d y la cantidad de personas por debajo es: %d", max, min, media, encimaMedia, debajoMedia);
		

	}

}
