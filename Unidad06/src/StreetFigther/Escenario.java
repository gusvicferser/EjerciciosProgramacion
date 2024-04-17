package StreetFigther;

public class Escenario {

	private String lugar;
	private int ronda = 1; // La ronda siempre comienza en uno.
	private static boolean quien = true; // Un booleano para saber a quién le toca golpear.

	public Escenario() {
		this.lugar = generarNombre(); // Pedimos un nombre aleatorio.
	}

	public Escenario(String lugar) {
		this.lugar = lugar; // Función constructor para el escenario Mansión de MrBison.
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getRonda() {
		return ronda;
	}

	public void setRonda(int ronda) {
		this.ronda = ronda;
	}

	// Con esta función se genera un nombre aleatorio de escenario entre 10
	// opciones.
	public static String generarNombre() {

		int num = (int) (Math.random() * 10 + 1); // Para que siempre entre en el switch es importante no poner
													// paréntesis en la suma.
		switch (num) {
		case 1:
			return ("'Base del Air Force one'");
		case 2:
			return ("'Callejón del aprendiz'");
		case 3:
			return ("'Bahía hermosa'");
		case 4:
			return ("'Calle lateral ajetreada'");
		case 5:
			return ("'La caja de Pandora'");
		case 6:
			return ("'Elevador cósmico'");
		case 7:
			return ("'Dojo de Rindo-Kan'");
		case 8:
			return ("'Taberna de flamenco'");
		case 9:
			return ("'Templo oculto'");
		case 10:
			return ("'Ring de lucha subterránea'");
		}
		return "";
	}

	// Función para imprimir la presentación del escenario:
	public static void presentacion(Escenario escenario, Luchador l1, Luchador l2) {
		System.out.println(
				"Comienza la pelea entre " + l1.getNombre() + " y " + l2.getNombre() + " en " + escenario.getLugar());
	}

	// Función para la ronda:
	public static void ronda(Escenario escenario) {
		System.out.println("ROUND " + escenario.getRonda() + "....FIGHT!!!");
	}

	// Función para golpear:
	public static void accion(Luchador l1, Luchador l2) {

		int intensidad = Luchador.intensidadGolpe();
		// He establecido un booleano para decidir quién golpea e ir turnándose:
		if (quien) {
			l2.reducirVida(intensidad); // Si no pasa el if, hacemos daño con normalidad.
			if (l2.getVida() < 0) {
				l2.setVida(0); // Si la vida es menor que cero, la dejamos a cero con este if.
			}
			System.out.println(l1.getNombre() + " golpea a " + l2.getNombre() + " con una intensidad de " + intensidad
					+ "\t" + l1.getNombre() + ":" + l1.getVida() + " - " + l2.getNombre() + ":" + l2.getVida());
			quien = false; // Seteamos el booleano a false para que alterne los golpes.

		} else {
			l1.reducirVida(intensidad); // Mismo principio.
			if (l1.getVida() < 0) {
				l1.setVida(0); // Si la vida es menor que cero, la dejamos a cero con este if.
			}
			System.out.println(l2.getNombre() + " golpea a " + l1.getNombre() + " con una intensidad de " + intensidad
					+ "\t" + l1.getNombre() + ":" + l1.getVida() + " - " + l2.getNombre() + ":" + l2.getVida());
			quien = true; // Devolvemos el booleano a su true original.

		}
	}

	// Finalmente he decidido que esta función devuelva un luchador que será el
	// ganador del combate.
	public Luchador pelea(Escenario escenario, Luchador l1, Luchador l2) {

		presentacion(escenario, l1, l2); // Presentamos escenario.
		// Mientras no haya un ganador hacemos un "do while".
		do {
			ronda(escenario);
			// Esta función golpea hasta que uno de los dos luchadores se queda a cero.
			while (l1.getVida() > 0 && l2.getVida() > 0) {
				accion(l1, l2);
				Escenario.retrasar1seg();
			}
			// Un if con un else if dependiendo de quién haya ganado para imprimirlo por
			// pantalla.
			if (l2.getVida() == 0) {
				l1.setRondasGanadas(l1.getRondasGanadas() + 1);
				System.out.println("El ganador de este round es: " + l1.getNombre() + "\n" + l1.getNombre() + ":"
						+ l1.generarFrasecilla());

			} else if (l1.getVida() == 0) {
				l2.setRondasGanadas(l2.getRondasGanadas() + 1);
				System.out.println("El ganador de este round es: " + l2.getNombre() + "\n" + l2.getNombre() + ":"
						+ l2.generarFrasecilla());
			}
			l1.setVida(100); // ¡¡Muy importante!! Al finalizar el combate, debemos restaurar la vida de
								// ambos luchadores al máximo.
			l2.setVida(100);
			escenario.setRonda(escenario.getRonda() + 1);// Aquí añadimos una ronda al contador del escenario.
		} while (l1.getRondasGanadas() < 2 && l2.getRondasGanadas() < 2);
		System.out.print("El ganador de este combate ha sido: ");
		// Nos es más fácil hacer la frase y sólo cambiar quién gana en función de los
		// resultados:
		escenario.setRonda(1); // En realidad esto sólo lo necesitaríamos si volviésemos a pelear en este
		// escenario, pero prefiero ponerlo y comentarlo.
		if (l1.getRondasGanadas() == 2) {
			System.out.print(l1.getNombre() + "\n");
			l1.setRondasGanadas(0);// Esta era la única forma que se me ocurría para resetear las rondas tras
									// haber entrado en el if que decide el ganador.
			l2.setRondasGanadas(0);
			return l1; //Devolvemos el ganador si es el luchador 1.
		} else {
			System.out.print(l2.getNombre() + "\n");
			l1.setRondasGanadas(0);
			l2.setRondasGanadas(0);
			return l2; //Devolvemos el segundo luchador si es el segundo el que gana.
		}
	}

	// Función para retrasar 1 segundo el programa.
	public static void retrasar1seg() {
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
