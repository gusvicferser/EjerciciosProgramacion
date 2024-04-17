package ArrayList;

import java.util.ArrayList;

public class Ejercicio18 {

	public static void main(String[] args) {

		// Creamos un ArrayList:
		ArrayList<String> colores = new ArrayList();
		colores.add("Turquesa");
		colores.add("Azabache");
		colores.add("Burdeos");
		colores.add("Beige");
		colores.add("Lavanda");

		System.out.println(colores);
		System.out.println();

		//Vamos a comprobar si está vacío con ".isEmpty":
		if (colores.isEmpty()) {
			System.out.println("El ArrayList está vacío.");
		}
		else {
			System.out.println(colores);
		}
		
		//Limpiamos el ArrayList:
		colores.clear();
		
		//Volvemos a comprobar:
		if (colores.isEmpty()) {
			System.out.println("El ArrayList está vacío.");
		}
		else {
			System.out.println(colores);
		}
	}

}
