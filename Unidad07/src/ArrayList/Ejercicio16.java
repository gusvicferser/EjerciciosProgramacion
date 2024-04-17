package ArrayList;

import java.util.ArrayList;

public class Ejercicio16 {

	public static void main(String[] args) {

		// Creamos un ArrayList:
		ArrayList<String> colores = new ArrayList();
		colores.add("Turquesa");
		colores.add("Azabache");
		colores.add("Burdeos");
		colores.add("Beige");
		colores.add("Lavanda");

		System.out.println(colores);

		//Creamos otro ArrayList, lo inicalizamos sin tamaño. Esta es la sintaxis:
		//Dice no checkeado porque Java no comprueba castings al clonar:
		ArrayList <String> otro = (ArrayList <String>)colores.clone();
		
		//Le damos el mismo tamaño que a colores con ".clone":
		
		System.out.println(otro);
		
		

	}

}
