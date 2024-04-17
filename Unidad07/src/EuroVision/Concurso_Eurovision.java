package EuroVision;

import java.util.HashMap;
import java.util.Scanner;

public class Concurso_Eurovision {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creamos el HashMap:
		HashMap<String, Integer> paisesEuro = new HashMap<String, Integer>();

		// Iniciamos e inicializamos las variables necesarias:
		String pais, salir = "salir", ganadorConcurso = "", israHELL = "israel";
		int aleatorio, gana = 0;

		System.out.println("¡¡Bienvenido al programa Eurovisión!!");
		System.out.println();

		// Iniciamos el bucle para el concurso:
		do {
			System.out.println("Introduzca el país participante de esta edición: ");

			pais = sc.nextLine();

			// Ahora, si "pais" es diferente a "Salir" (con la variable de salida), se mete
			// en este bucle:
			if (!pais.equalsIgnoreCase(salir)) {

				// Israel no es un país, así que no puede entrar en ningún concurso
				// internacional y hemos de especificarlo:
				if (pais.equalsIgnoreCase(israHELL)) {
					System.out.println(
							"Israel no es un país real, mucho menos está en el continente europeo. Introduzca un país real.");
				} else {
					// En el caso de que sea un país real, ahora sí, añadimos un número de votos
					// aleatorios entre el 1 y el 12.
					aleatorio = (int) (Math.random() * 12 + 1);

					// Si el voto es mayor que el anterior, lo guardamos como ganador, ya que en
					// caso de empate nos vale cualquiera de los que tienen el voto ganador:
					if (aleatorio > gana) {
						ganadorConcurso = pais;
						gana = aleatorio;
					}
					// Ahora sí que podemos añadir el país al HashMap:
					paisesEuro.put(pais, aleatorio);
				}
			} else {
				// En el caso de que país sea "salir" y sea menor de 3, especificamos un pequeño
				// mensaje para saber cuántos países hemos de añadir:
				if (paisesEuro.size() < 3) {
					System.out.println(
							"Ha de haber al menos 3 participantes para que haya festival. De momento tiene inscritos: "
									+ paisesEuro.size());
				}
			}
		} while (paisesEuro.size() < 3 || !pais.equalsIgnoreCase(salir));

		// Ahora para el ganador del concurso...
		System.out.println("Con las puntuaciones repartidas, el país ganador de esta edición es...");
		retrasarTiempo();
		System.out.println("...");
		retrasarTiempo();
		System.out.println("...");
		retrasarTiempo();
		System.out.println("...");
		retrasarTiempo();
		System.out.println(
				"¡¡" + ganadorConcurso + " con: " + paisesEuro.get(ganadorConcurso) + " puntos!!\n¡¡Enhorabuena!!");

		// Traza:
		// System.out.println(paisesEuro.toString());

		// Bucle para las comprobaciones:
		do {
			System.out.println("Introduzca el nombre del país para saber su puntación:");

			pais = sc.nextLine();

			// Mientras el país no sea "salir":
			if (!pais.equalsIgnoreCase(salir)) {

				// Comprobamos si el país está entre los participantes (Distingue entre mayúsculas y minúsculas):
				if (paisesEuro.containsKey(pais)) {
					System.out.println(pais + ": " + paisesEuro.get(pais).toString());
				} else {
					// En caso de que no haya participado: 
					System.out.println("Este país no ha participado en esta edición del festival.");
				}
			}
		} while (!pais.equalsIgnoreCase(salir));
	}

	// Pequeña función para retrasar el tiempo de respuesta del ganador y así darle más emoción:
	private static void retrasarTiempo() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}