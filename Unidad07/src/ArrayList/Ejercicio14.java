package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio14 {

	public static void main(String[] args) {

		// Creamos un ArrayList:
		ArrayList<String> colores = new ArrayList();
		colores.add("Turquesa");
		colores.add("Azabache");
		colores.add("Burdeos");
		colores.add("Beige");
		colores.add("Lavanda");

		System.out.println(colores);
		
		//Función que intercambia dos posiciones:
		Collections.swap(colores, 4, 1);
		Collections.swap(colores, 3, 0);
		
		System.out.println(colores);
	}

}
