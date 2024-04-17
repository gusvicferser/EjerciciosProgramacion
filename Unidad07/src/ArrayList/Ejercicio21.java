package ArrayList;

import java.util.ArrayList;

public class Ejercicio21 {

	public static void main(String[] args) {

		// Creamos un ArrayList:
		ArrayList<String> colores = new ArrayList();
		colores.add("Turquesa");
		colores.add("Azabache");
		colores.add("Burdeos");
		colores.add("Beige");
		colores.add("Lavanda");

		System.out.println(colores);
		
		//Para sustituir el segundo elemento hemos de recordar que comienza por 0 y usar set:
		colores.set(1, "Cian");
		
		System.out.println(colores);

	}

}
