package ArrayList;

import java.util.ArrayList;

public class Ejercicio17 {

	public static void main(String[] args) {

		// Creamos un ArrayList:
		ArrayList<String> colores = new ArrayList();
		colores.add("Turquesa");
		colores.add("Azabache");
		colores.add("Burdeos");
		colores.add("Beige");
		colores.add("Lavanda");

		System.out.println(colores);
		
		//Con esta función limpiamos TODA la ArrayList (¡¡¡CUIDADO!!! = DELETE SIN WHERE):
		colores.clear();
		
		System.out.println(colores);

	}

}
