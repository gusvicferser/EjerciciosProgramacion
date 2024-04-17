package ArrayList;

import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		
		ArrayList <String> colores = new ArrayList();
		colores.add("Turquesa");
		colores.add("Azabache");
		colores.add("Burdeos");
		colores.add("Beige");
		colores.add("Lavanda");

		System.out.println(colores);
		
		Collections.shuffle(colores);
		
		System.out.println(colores);

	}

}
