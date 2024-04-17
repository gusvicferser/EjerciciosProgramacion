package HashMap;

import java.util.*;

public class DiccionarioEspanishEnglish_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int aleatorio, correctas, equivocadas;
		String respuesta;
		
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
		
		ArrayList <String> palabrasEsp = new ArrayList<String>(diccionario.values());
		ArrayList <String> palabrasEng = new ArrayList<String>(diccionario.keySet());
		
		String[] palabrasAzar = new String[5];
		
		for (int i = 0; i < 5; i++) {
			aleatorio = (int) (Math.random()*5+1);

			palabrasAzar[i] = palabrasEsp.get(aleatorio);
		}
		
		System.out.println("Bienvenido a la primera prueba de inglés del diccionario de Sistemas Gustavo Víctor.");
		
		System.out.print("Por favor, introduzca la traducción de la palabra... ");
		
		for (int i=0; i<5; i++) {
			System.out.println(palabrasAzar[i] + ": ");
			
			respuesta= sc.nextLine().toLowerCase();
			
			if (respuesta.equals(diccionario.containsValue(palabrasAzar[i]))) {
				
			}
			
		}
	}
}
