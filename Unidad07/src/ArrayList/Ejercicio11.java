package ArrayList;

import java.util.*;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		ArrayList <String> colores = new ArrayList();
		colores.add("Turquesa");
		colores.add("Azabache");
		colores.add("Burdeos");
		colores.add("Beige");
		colores.add("Lavanda");

		System.out.println(colores);
		
		Collections.reverse(colores); //Para revertir la Lista
		
		System.out.println(colores);
	}

}
