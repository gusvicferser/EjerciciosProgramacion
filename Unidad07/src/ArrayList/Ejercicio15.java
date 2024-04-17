package ArrayList;

import java.util.ArrayList;

public class Ejercicio15 {

	public static void main(String[] args) {

		// Creamos un ArrayList:
		ArrayList<String> colores = new ArrayList();
		colores.add("Turquesa");
		colores.add("Azabache");
		colores.add("Burdeos");
		colores.add("Beige");
		colores.add("Lavanda");

		System.out.println(colores);

		// Creamos otro ArrayList:
		ArrayList<String> masColores = new ArrayList();
		masColores.add("Cian");
		masColores.add("Magenta");
		masColores.add("Amarillo");
		masColores.add("Caqui");
		masColores.add("Avellana");

		System.out.println(masColores);
		
		//Con esta función añadimos los elementos de un ArrayList a otro (sin quitarlos del segundo ArrayList):
		colores.addAll(masColores);
		
		System.out.println(colores);
		System.out.println(masColores);
		

	}

}
