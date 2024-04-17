package HashMap;

import java.util.*;

public class DiccionarioEspanishEnglish_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String palabraBuscar = "";

		HashMap<String, String> diccionario = new HashMap<String, String>();

		diccionario.put("melocotón", "peach");
		diccionario.put("pepino", "cucumber");
		diccionario.put("manzana", "apple");
		diccionario.put("sartén", "pan");
		diccionario.put("mantequilla", "butter");
		diccionario.put("albahaca", "basil");
		diccionario.put("fresa", "strawberry");
		diccionario.put("sandía", "watermelon");
		diccionario.put("café", "coffee");
		diccionario.put("mostaza", "mustard");
		diccionario.put("tomate", "tomato");
		diccionario.put("zumo", "juice");
		diccionario.put("arándano", "blueberry");
		diccionario.put("arroz", "rice");
		diccionario.put("haba", "bean");
		diccionario.put("cerveza", "beer");
		diccionario.put("pimienta", "pepper");
		diccionario.put("vino", "wine");
		diccionario.put("agua", "water");
		diccionario.put("cebolla", "onion");

		System.out.println("Bienvenido al primer diccionario de Sistemas Gustavo Víctor.");

		do {
			System.out.println("Por favor, introduzca a continuación la palabra a traducir:");
			palabraBuscar = sc.nextLine().toLowerCase();

			if (!palabraBuscar.equals("salir")) {
				if (diccionario.containsKey(palabraBuscar)) {
					System.out.println("La palabra " + palabraBuscar + " se traduce al inglés como '"
							+ diccionario.get(palabraBuscar) + "'");
				} else {
					System.out.println("Lamentablemente, la palabra que busca no se encuentra en este diccionario.");
				}
			} else {
				System.out.println(
						"Gracias por usar el diccionario de Sistemas Gustavo Víctor.\nQue tenga un fantástico día.");
			}
		} while (!palabraBuscar.equals("salir"));
	}
}
