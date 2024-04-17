package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1_8 {

	public static void main(String[] args) {
		
		//Ejercicio 1:
		ArrayList <String> colores = new ArrayList();
		colores.add("Turquesa");
		colores.add("Azabache");
		colores.add("Burdeos");
		colores.add("Beige");
		colores.add("Lavanda");
		
		
		//Ejercicio 2:
		for (String elemento : colores) {
			System.out.println(elemento);
		}
		System.out.println();
		
		//Ejercicio 3:
		colores.add(1, "Chicle");
		
		//Ejercicio 4:
		System.out.println("Pos 3 = " + colores.get(3));
		System.out.println();
		
		//Ejercicio 5: 
		colores.set(3, "Cian");
		System.out.println("Pos 3 = " + colores.get(3));
		System.out.println();
		
		//Ejercicio 6:
		colores.remove(3);
		
		//Ejercicio 7:
		if (colores.contains("Cian")) {
			System.out.println("El color está en la lista");
		}
		else {
			System.out.println("El color no existe en la lista");
		}
		System.out.println();
		
		//Ejercicio 8:
		Collections.sort(colores);
		
		System.out.println(colores);
	}

}
