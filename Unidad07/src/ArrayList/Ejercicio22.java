package ArrayList;

import java.util.ArrayList;

public class Ejercicio22 {

	public static void main(String[] args) {

		// Creamos un ArrayList:
		ArrayList<String> colores = new ArrayList();
		colores.add("Turquesa");
		colores.add("Azabache");
		colores.add("Burdeos");
		colores.add("Beige");
		colores.add("Lavanda");

		System.out.println(colores);
		
		//Para imprimir cada elemento dentro del ArrayList hacemos un bucle forEach:
		for (String elemento : colores) {
			System.out.println(elemento);
		}

	}

}
