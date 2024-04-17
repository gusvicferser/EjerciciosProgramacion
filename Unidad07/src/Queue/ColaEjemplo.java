package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ColaEjemplo {

	public static void main(String[] args) {
		
			Queue <String> colaCine = new LinkedList<String>(); //La queue es una clase abstracta y hay que crear la instancia con LinkedList
			colaCine.add("Juan");
			colaCine.add("Perico");
			colaCine.add("Andrés");
			
			System.out.println(colaCine);
			System.out.println("El que lleva más tiempo esperando es: " + colaCine.element());
			System.out.println("El que lleva más tiempo esperando es: " + colaCine.peek());
			
			colaCine.remove();
			System.out.println(colaCine);
			
			colaCine.add("Tardón");
			System.out.println("Ahora hay "  + colaCine.size() + " personas en la cola.");
			
			
	}

}
