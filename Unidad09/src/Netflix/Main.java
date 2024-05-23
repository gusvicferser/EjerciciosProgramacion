package Netflix;

import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Pelicula> catalogoPelis = new ArrayList<Pelicula>();

	public static void main(String[] args) {

		boolean salida = true;

		while (salida) {
			try {
				salida = menu();
			} catch (Exception exc) {
				System.out.println(exc.getMessage());
			}
		}

	}

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
			if (opcion > 6 || opcion <= 0) {
				throw new Exception("¡Error crítico!: La opción introducida no es válida");
			}
		} catch (InputMismatchException exc) {
			throw new Exception("¡Error crítico!: ¡No ha introducido un número!");
		}

		switch (opcion) {
		case 1:
			try {
				altaPelicula();
			} catch (Exception exc) {
				throw new Exception(exc.getMessage());
			}
			return true;
		case 2:
			return true;
		case 3:
			return true;
		case 4:
			return true;
		case 5:
			return true;
		case 6:
			System.out.println("Gracias por usar Gusflix. Un sistema mucho mejor que su homólogo ¡y gratis!");
			return false;
		}

		return true;
	}

	protected static void altaPelicula() throws Exception {

		String titulo, productora;
		int anhoPublicacion, nominaciones, oscars;

		System.out.println("Introduzca el título de la película:");
		titulo = sc.nextLine();

		System.out.println("Introduzca el nombre de la productora:");
		productora = sc.nextLine();

		System.out.println("Introduzca el año de publicación (YYYY)");

		while (true) {
			try {
				anhoPublicacion = sc.nextInt();
				if (anhoPublicacion<1896) {
					throw new Exception("¡Error crítico!: ¡No puede existir ninguna película creada en esa fecha!");
				} else if (anhoPublicacion>2024) {
					throw new Exception("¡Error crítico!: ¡Esa película no ha sido creada!");
				}
				break;
			} catch (InputMismatchException inExc) {
				throw new Exception("¡Error crítico!: ¡No ha introducido un número!");
			}
		}

	}
}
