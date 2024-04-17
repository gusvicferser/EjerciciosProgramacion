package ArrayList;

import java.util.*;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		//Creamos un ArrayList:
		ArrayList <String> colores = new ArrayList();
		colores.add("Turquesa");
		colores.add("Azabache");
		colores.add("Burdeos");
		colores.add("Beige");
		colores.add("Lavanda");

		System.out.println(colores);
		
		//Creamos un Array hecho de una parte para comparar:
		ArrayList <String> copia = new ArrayList(colores.subList(1, 5));
		
		System.out.println(copia);
		
		//Ahora creamos un tercer Array para copiar el primero:
		ArrayList <String> otro = new ArrayList <String>(5);
		otro.add("A");
		otro.add("A");
		otro.add("A");
		otro.add("A");
		otro.add("A");
		
		//Ahora copiamos el primero:
		Collections.copy(otro, colores);
		//Una peculiaridad es que compara el contenido, no necesita ser con el orden estricto:
		Collections.shuffle(otro);
		
		System.out.println(otro);
		
		//Ahora debemos hacer un if para comprobar si son iguales (En este no lo son por tamaño):
		if (copia.containsAll(colores)) {
			System.out.println("Los ArrayList son iguales.");
		}
		else {
			System.out.println("Los ArrayList no son iguales.");
		}
		
		//En este sí lo son aunque esté el segundo desordenado:
		if (otro.containsAll(colores)) {
			System.out.println("Los ArrayList son iguales.");
		}
		else {
			System.out.println("Los ArrayList no son iguales.");
		}

	}

}
