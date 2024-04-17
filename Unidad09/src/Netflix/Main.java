/**
 * Programa de ejemplo para NexusDev Solutions, S.L.
 * En este programa trateremos de crear un sistema para 
 * añadir películas o series a una aplicación similar a 
 * Netflix.
 * 
 * @author Gustavo Víctor
 * @version 1.0.
 * 
 */

package Netflix;

import java.util.*;

/**
 * Esta clase main iniciará la aplicación llamando a la función menu() y trata excepciones.
 *  
 * @author Gustavo Víctor
 * @version 1.0
 * @see #menu() 
 */

public class Main {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Contenido> catalogo = new ArrayList<Contenido>();

	public static void main(String[] args) {

		boolean salida = true;

//		Creamos un bucle para repetir menú hasta que nos confirme la salida con un false:
		while (salida) {
			try {
//				Como el menú puede devolver excepciones, hemos de recogerlas con un try/catch:
				salida = menu();
			} catch (Exception exc) {
				System.out.println(exc.getMessage());
				System.out.println();
			}
		}

	}

	
	/**
	 * 
	 * En esta función desplegamos el menú y llamamos a la función main, devolviéndole un booleano.
	 * También lanza una excepción y, por eso, la debemos tratar a parte con try/catch.
	 * Posee un switch para cada caso u opción.
	 * 
	 * @author gusferser 
	 * @return boolean Sirve para declarar el cierre del programa o continuar con el bucle.
	 * @throws Exception Maneja distintas excepciones como InputMismatchException y excepciones varias. 
	 * @param opcion Variable donde se guarda la opcion escogida por el usuario.
	 * 
	 * @see altaPelicula()
	 * @see altaSerie()
	 * @see verContenido()
	 * @see mostrar()
	 * @see pendiente()
	 * 
	 */

	public static boolean menu() throws Exception {

		int opcion;

		System.out.println("***********************Bienvenido a Gusflix***********************");
		System.out.println("*************(Nombre adaptado para evitar copyright)**************");
		System.out.println("******************************************************************");
		System.out.println("****************Escoja una opción a continuación******************");
		System.out.println("1 - Dar de alta una película");
		System.out.println("2 - Dar de alta una serie");
		System.out.println("3 - Ver un contenido");
		System.out.println("4 - Listar contenido");
		System.out.println("5 - Listar contenido pendiente por ver");
		System.out.println("6 - Salir");
		System.out.println("******************************************************************");

		try {
			opcion = sc.nextInt();
			sc.nextLine();
			if (opcion > 6 || opcion <= 0) {
//				Si la excepción se sale de las opciones, lanzamos excepción:
				throw new Exception("¡Error crítico!: La opción introducida no es válida");
			}
		} catch (InputMismatchException exc) {
			sc.nextLine();
			throw new Exception("¡Error crítico!: ¡No ha introducido un número!");
		}

		switch (opcion) {
		case 1: // Para dar de alta una película (Puede lanzar varias excepciones)
			try {
				altaPelicula();
			} catch (Exception exc) {
				throw new Exception(exc.getMessage());
			}
			return true;
		case 2: // Para dar de alta una serie (Puede lanzar varias excepciones)
			try {
				altaSerie();
			} catch (Exception exc) {
				throw new Exception(exc.getMessage());
			}
			return true;
		case 3: // Para ver un contenido y marcarlo como visto (Puede lanzar excepción de no
				// encontrado)

			try {
				verContenido();
			} catch (Exception exc) {
				throw new Exception(exc.getMessage());
			}
			return true;
		case 4: // Para ver todo el contenido del catálogo
			mostrar();
			return true;
		case 5: // Para visualizar qué contenido queda aún por ver
			pendiente();
			return true;
		case 6: // Para la salida del menú.
			System.out.println("Gracias por usar Gusflix. Un sistema mucho mejor que su homólogo ¡y gratis!");
			return false; // Todo devuelve un booleano true excepto esta opción que devuelve falso para
							// salir del bucle.
		}

		return true;
	}

//	Función 1: Dar de alta una película (lanza varias excepciones):
	protected static void altaPelicula() throws Exception {

		String titulo, productora;
		int anhoPublicacion, nominaciones, oscars;

		System.out.println("Introduzca el título de la película:");
		titulo = sc.nextLine();

		System.out.println("Introduzca el nombre de la productora:");
		productora = sc.nextLine();

		while (true) {
			System.out.println("Introduzca el año de publicación (YYYY)");
//			Al ser un número puede dar InputMismatchException, por lo que lo rodeamos de try/catch
			try {
				anhoPublicacion = sc.nextInt();
				sc.nextLine();
				if (anhoPublicacion < 1896) { // La primera película surje en 1896. Ninguna película, por tanto, puede
												// ser anterior a esta fecha.
					System.out.println("¡Error crítico!: ¡No puede existir ninguna película creada en esa fecha!");
				} else if (anhoPublicacion > 2025) { // Como obligamos a poner nominaciones a los oscars, ninguna
														// película puede tenerlos si sale más allá de la próxima gala.
					System.out.println("¡Error crítico!: ¡Esa película no ha sido creada!");
				} else {
					break;
				}
				// Si todo ha salido bien, salimos del bucle (para no pedir todo de nuevo)
			} catch (InputMismatchException inExc) { // Aquí cazamos un fallo en el input.
				sc.nextLine();
				throw new Exception("¡Error crítico!: ¡No ha introducido un número!");
			}
		}

		while (true) { // Nuevamente un bucle while para no tener que repetir todo desde el principio.
			System.out.println("Introduzca el número de nominaciones a los oscars:");
//			Mismo motivo, un try/catch por posibilidad de un InputMismatchException:
			try {
				nominaciones = sc.nextInt();
				sc.nextLine();
				if (nominaciones < 0) { // El número de posibilidades de un oscar pueden ser 0 pero nunca negativas.
					System.out.println("¡Error crítico!: ¡No se puede estar nominado a menos de 0 oscars!");
				} else if (nominaciones > 23) {
					System.out.println("¡Error crítico!: ¡Solo existen 23 categorías a los oscars!");
				}
			} catch (InputMismatchException inExc) {
				sc.nextLine();
				throw new Exception("¡Error crítico!: ¡No ha introducido un número!");
			}

			System.out.println("Introduzca el número de oscars ganados por esta película:");
//			Mismo motivo, un try/catch por posibilidad de un InputMismatchException:
			try {
				oscars = sc.nextInt();
				if (nominaciones < oscars) { // Es importante hacer este if para que no existan más oscars ganados
												// de los que estés nominado.
					System.out.println("¡Error crítico!: ¡No se pueden ganar más oscars de los que estés nominado!");
				} else if (oscars < 0) {
					System.out.println("¡Error crítico!: ¡No se pueden deber oscars!");
				} else {
					break; // Si todo está correcto, se sale del bucle.
				}
			} catch (InputMismatchException inExc) {
				sc.nextLine();
				throw new Exception("¡Error crítico!: ¡No ha introducido un número!");
			}
		}

//		Si todo ha salido correctamente, lo añadimos al catálogo:
		catalogo.add(new Pelicula(titulo, productora, anhoPublicacion, nominaciones, oscars));
		System.out.println(titulo + " añadida correctamente al catálogo.\n");
	}

//	Función 2: creación de una serie (Lanza varias excepciones):
	protected static void altaSerie() throws Exception {

		String titulo, productora, respuesta;
		int anhoPublicacion, temporadas;
		boolean finalizada;

		System.out.println("Introduzca el título de la serie:");
		titulo = sc.nextLine();

		System.out.println("Introduzca el nombre de la productora:");
		productora = sc.nextLine();

		while (true) {
			System.out.println("Introduzca el año de publicación (YYYY)");
//			Al ser un número puede dar InputMismatchException, por lo que lo rodeamos de try/catch
			try {
				anhoPublicacion = sc.nextInt();
				sc.nextLine();
				if (anhoPublicacion < 1928) { // La primera serie surje en en 1928. Ninguna serie, por tanto, puede
												// ser anterior a esta fecha.
					System.out.println("¡Error crítico!: ¡No puede existir ninguna serie creada en esa fecha!");
				} else {
					break;
				}
				// Si todo ha salido bien, salimos del bucle (para no pedir todo de nuevo)
			} catch (InputMismatchException inExc) { // Aquí cazamos un fallo en el input.
				sc.nextLine();
				throw new Exception("¡Error crítico!: ¡No ha introducido un número!");
			}
		}

		while (true) { // Nuevamente un bucle while para no tener que repetir todo desde el principio.
			System.out.println("Introduzca el número de temporadas");
//			Mismo motivo, un try/catch por posibilidad de un InputMismatchException:
			try {
				temporadas = sc.nextInt();
				sc.nextLine();
				if (temporadas < 1) { // Si una serie existe, ha de tener al menos una temporada
					System.out.println("¡Error crítico!: ¡Una serie no puede tener menos de una temporada!");
				} else if (temporadas >= 40) { // Doctor Who es la serie más longeva de la historia en emisión y entre
												// la antigua y la nueva, suman este año 40 temporadas.
					System.out.println("¡Error crítico!: ¡No existe ninguna serie con tantas temporadas!");
				} else {
					break; // Si todo está correcto, se sale del bucle.
				}
			} catch (InputMismatchException inExc) {
				sc.nextLine();
				throw new Exception("¡Error crítico!: ¡No ha introducido un número!");
			}
		}

//		Bucle para finalizada:
		while (true) {
			System.out.println("Diga ahora si la serie está finalizada (y/n)");
			respuesta = sc.nextLine();

			if (respuesta.equalsIgnoreCase("y")) { // Si la respuesta es "yes", marcamos finalizada como true y salimos
													// del bucle.
				finalizada = true;
				break;
			} else if (respuesta.equalsIgnoreCase("n")) { // Si la respuesta es "no", marcamos como false y salimos.
				finalizada = false;
				break;
			} else { // En cualquier otro caso, seguimos preguntando.
				System.out.println("¡Error crítico!: No ha introducido una respuesta válida. Pruebe otra vez.");
			}
		}

//		Si todo ha salido correctamente, lo añadimos al catálogo:
		catalogo.add(new Serie(titulo, productora, anhoPublicacion, temporadas, finalizada));
		System.out.println(titulo + " añadida correctamente al catálogo.\n");
	}

//	Función 3: Ver contenido
	protected static void verContenido() throws Exception {

		int encontrada = -1;
		String busqueda;

		if (catalogo.size() != 0) {
			System.out.println("¿Qué serie o película desea ver?");
			busqueda = sc.nextLine();

//		Podría hacer una función de búsqueda, pero al sólo requerir una opción de esa búsqueda, no necesito función extra:
			for (int i = 0; i < catalogo.size(); i++) {
				if (catalogo.get(i).getTitulo().equalsIgnoreCase(busqueda)) {
					encontrada = i; // Si encuentra una serie o película con ese nombre, devuelve una posición, si
									// no la posición por defecto es -1 que no existe.
				}
			}

			if (encontrada == -1) {
//			Lanzo una excepción para acabar con la opción y volver al menú si no se encuentra la serie:
				throw new Exception(
						"¡Error crítico!: La serie o película que quiere ver no existe en nuestro sistema.");
			} else {
//			En caso contrario, cambio su estado a vista y lo notifico por pantalla:
				catalogo.get(encontrada).setVisto(true);
				System.out.println(catalogo.get(encontrada).getTitulo() + " ha sido visualizada.\n");
			}
		} else {
			throw new Exception("¡Error crítico!: ¡No existe ninguna película o serie por ver aún en el catálogo!");
		}
	}

//	Función 4: Listar el contenido.
	protected static void mostrar() {

		if (catalogo.size() != 0) {
			for (Contenido elemento : catalogo) {
				System.out.println(elemento.toString());
			}
			System.out.println();
		} else {
			System.out.println("Nada que mostrar.\n");
		}

	}

//	Función 5: Listar sólo el contenido que quede pendiente de ver:
	protected static void pendiente() {

		int contador = 0;

		if (catalogo.size() != 0) {
			for (Contenido elemento : catalogo) {
				if (elemento.isVisto() == false) {
					System.out.println(elemento.toString());
					contador++;
				}
			}
			System.out.println();
			if (contador == 0 && catalogo.size() != 0) {
				System.out.println("¡Enhorabuena, ha visto todas las películas y series de nuestro actual catálogo!\n");
			}
		} else {
			System.out.println("Aún no hay nada pendiente porque no hay nada añadido.\n");
		}
	}
}
