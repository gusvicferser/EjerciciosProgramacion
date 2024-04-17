package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		ArrayList <String> colores = new ArrayList();
		colores.add("Turquesa");
		colores.add("Azabache");
		colores.add("Burdeos");
		colores.add("Beige");
		colores.add("Lavanda");
		
		ArrayList <String> copia = new ArrayList<String>(5); //Así lo declararíamos si quisieramos especificar el tamaño de la lista:ArrayList <String> colores = new ArrayList();
		copia.add("0");
		copia.add("0");
		copia.add("0");
		copia.add("0");
		copia.add("0");
		
		Collections.copy(copia, colores);
		
		System.out.println(colores);
		System.out.println(copia);
	}

}
