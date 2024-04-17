package ArrayList;

import java.util.ArrayList;

public class Ejercicio20 {

	public static void main(String[] args) {

		// Creamos un ArrayList:
		ArrayList<String> colores = new ArrayList();
		colores.add("Turquesa");
		colores.add("Azabache");
		colores.add("Burdeos");
		colores.add("Beige");
		colores.add("Lavanda");

		System.out.println(colores.size());
		
		colores.ensureCapacity(6);
		
		//Esto sólo muestra cuántos elementos hay dentro del ArrayList, de ahí que no salga la ampliación:
		System.out.println(colores.size());
		
		

	}

}
