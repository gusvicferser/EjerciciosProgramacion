package ArrayList;

import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {

		ArrayList<String> listaPaises = new ArrayList();

		listaPaises.add("Francia"); // Este está en la posición 0 ya que en Java la primera posición siempre es 0.
		listaPaises.add("Portugal"); // Pos 1
		listaPaises.add("Italia"); // Pos 2
		listaPaises.add(0, "España"); // Esto añade el String en la pos 0
		listaPaises.add(2, "Alemania"); // Esto añade el String en la pos 2, desplaza todos los demás.
		listaPaises.remove(1); // Eliminar por índice.
		//listaPaises.remove("Alemania"); // Eliminar por nombre.
		listaPaises.set(2, "Grecia"); // Modificar por posición.
		
		int pos = listaPaises.indexOf("Francia");
		if (pos<0) {
			System.out.println("País no encontrado.");
		}
		else {
			System.out.println("El primer país es: " + listaPaises.get(pos));
		}
		
		System.out.println(listaPaises); //Forma de imprimirlo como .toString

		//Collections.sort(listaPaises); //Ordena la lista.
		Collections.shuffle(listaPaises); //Baraja la lista.
		/*
		 * //Bucle 'clásico' (Igual de válido que el forEach): for (int i=0;
		 * i<listaPaises.size(); i++) { System.out.println(listaPaises.get(i));
		 */

		for (String elemento : listaPaises) { // Bucle 'forEach' (Creas una variable como i pero para cada elemento, en
												// este caso de tipo String.
			System.out.println(elemento);
		}
	}
}
