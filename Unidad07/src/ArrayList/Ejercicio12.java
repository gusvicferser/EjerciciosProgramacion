package ArrayList;

import java.util.*;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		ArrayList <String> colores = new ArrayList();
		colores.add("Turquesa");
		colores.add("Azabache");
		colores.add("Burdeos");
		colores.add("Beige");
		colores.add("Lavanda");
		
		ArrayList <String> subcolores = new ArrayList(colores.subList(1, 4)); //Para crear una sublista con parte de la lista anterior.
		
		System.out.println(subcolores);
		
	}

}
