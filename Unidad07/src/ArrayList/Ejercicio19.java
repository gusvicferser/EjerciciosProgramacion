package ArrayList;

import java.util.ArrayList;

public class Ejercicio19 {

	public static void main(String[] args) {

		// Creamos un ArrayList:
		ArrayList<String> c1 = new ArrayList(); //Un ArrayList por general ocupa 10 espacios:
		
		System.out.println(c1.size());
		
		//Esta función es un recolector de basura:
		c1.trimToSize();
		
		System.out.println(c1.size());

	}

}
