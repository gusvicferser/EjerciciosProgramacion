package HashMap;

import java.util.HashMap;

public class Paises {

	public static void main(String[] args) {

		/*
		 * El HashMap a diferencia del ArrayList, necesita una referencia primero (o
		 * código) y luego el dato que introducimos porque no hay orden, se accede por
		 * clave. Sin saber la clave no podemos acceder al dato sin tener que buscar en
		 * todo el HashMap.
		 */
		HashMap<Integer, String> listaPaises = new HashMap();

		listaPaises.put(34, "España");
		listaPaises.put(46, "Portugal");
		listaPaises.put(43, "Francia");

		System.out.println(listaPaises);
		System.out.println();
		
		System.out.println(listaPaises.get(34));
		System.out.println();
		
		listaPaises.remove(46);
		
		System.out.println(listaPaises);
		System.out.println();

	}

}
