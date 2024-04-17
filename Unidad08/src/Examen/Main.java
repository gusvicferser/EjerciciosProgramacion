package Examen;

import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Establecemos una variable de salida:
		boolean salida = true;

		// Iniciamos un bucle while para el menú:
		while (salida) {

			// Como el usuario ha de introducir un número, hemos de crear un try/catch:
			try {
				salida = menu(); // El menú nos devolverá un 'true' mientras no se escoja la opción 5
			} catch (Exception exc) { // Aquí gestionamos las distintas excepciones que nos devuelva.
				System.out.println(exc.getMessage());
			}
		}

	}

	// Menú para el sistema del zoo:
	public static boolean menu() throws Exception {

		int num;

		System.out.println("*****Bienvenido al Zoologico digital Gustavo Víctor*****");
		System.out.println();
		System.out.println("******************¿Qué desea hacer?*********************");
		System.out.println("1 - Dar de alta animal");
		System.out.println("2 - Dar de baja animal");
		System.out.println("3 - Modificar peso");
		System.out.println("4 - Listado animales");
		System.out.println("5 - Salir");
		System.out.println("********************************************************");

		try {
			num = sc.nextInt(); // Nos aseguramos un try/catch para números.
			sc.nextLine();
		} catch (InputMismatchException exc) {
			sc.nextLine();
			throw new Exception("¡Error!: No ha introducido un número. Vuelva a probar\n");
		}

		// Si ha introducido un número del 1 al 5, entra en el menú:
		if (num > 0 && num < 6) {

			switch (num) {
			case 1: // Aquí añadiremos al animal.
				try {
					altaAnimal();
				} catch (Exception exc) {
					throw new Exception(exc.getMessage()); // Excepción en caso de no haber podido añadirlo.
				}
				return true;
			case 2:
				try {
					String criatura;
					System.out.println("Introduzca el animal a dar de baja:");
					criatura = sc.nextLine();
					Animal.darBaja(criatura);
				} catch (Exception exc) {
					throw new Exception(exc.getMessage());
				}
				return true;
			case 3:
				try {
					modPeso();
				} catch (Exception exc) {
					throw new Exception(exc.getMessage());
				}
				return true;
			case 4:
				try {
					Animal.imprimirLista();
				} catch (Exception exc) {
					throw new Exception(exc.getMessage());
				}
				return true;
			case 5:
				System.out.println(
						"Muchísimas gracias por haber confiado en sistemas Gustavo Víctor.\n\nEsperamos todo haya sido de su agrado.");
				return false;

			}
		} else {
			throw new Exception("¡Error!: ¡Opción incorrecta!\n"); // Si no ha introducido un número del 1 al 5 lanzamos
																	// excepción.

		}
		return true;

	}

	// Función para dar de alta al animal:
	public static void altaAnimal() throws Exception {

		char tipo;
		String nombre;
		int peso;

		// Preguntamos el tipo de animal:
		System.out.println("Por favor, introduzca el tipo de animal ('l' de león o 't' de tigre):");
		while (true) {
			// Aquí determinamos si el tipo que nos pasan coincide con el tipo que le
			// pedimos (l de león o t de tigre):
			try {
				tipo = sc.nextLine().charAt(0);
				if (tipo == 't' || tipo == 'l') {
					break;
				} else { // Lanzamos excepción en caso contrario:
					throw new Exception("¡Error!: Sólo puede ser 'l' de león o 't' de tigre.\n");
				}
			} catch (IllegalFormatException exc) {
				throw new Exception("¡Error: Lo introducido no es un caracter.\n");
			}
		}
		// Mismo sistema para la longitud del nombre que ha de ser como mínimo de 4
		// letras:
		while (true) {
			System.out.println("Introduzca ahora el nombre del animal:");
			nombre = sc.nextLine();

			if (nombre.length() < 4) {
				throw new Exception("¡Error!: ¡El nombre ha de tener al menos 4 letras!\n");

			} else {
				if (Animal.buscarAnimal(nombre) == false) {
					break;
				} else {
					throw new Exception("Error: El nombre que intenta introducir ya existe.\n");
				}
			}
		}

			// Pedimos el peso:
			System.out.println("Introduzca el peso del animal (Kg):");
			while (true) {
				try {
					peso = sc.nextInt();

					// Mismo sistema para el peso. Si es negativo, lo devolvemos como excepción:
					if (peso < 0) {
						throw new Exception("¡Error!: El peso no puede ser negativo.\n");
					}
					break;

				} catch (InputMismatchException exc) { // Lanzamos excepción si no ha introducido un número:
					sc.nextLine();
					throw new Exception("¡Error!: No ha introducido un número. Vuelva a probar\n");
				}
			}

			// Y ahora probamos a añadirlo con todos los tipos ya puestos:
			try {
				Animal nuevo = new Animal(tipo, nombre, peso);
				Animal.addAnimal(nuevo);
				System.out.println(nombre + " ha sido añadido como animal.\n");
			} catch (Exception e) { // Si ha lanzado un mensaje, lo capturamos y lo lanzamos de nuevo.
				throw new Exception(e.getMessage());
			}
		}


	// Función para modificar el peso del animal:
	public static void modPeso() throws Exception {

		String criatura;
		int peso, posicion;

		System.out.println("Introduzca el nombre del animal a modificar:");
		try {
			criatura = sc.nextLine();
			if (Animal.buscarAnimal(criatura)) {
				posicion = Animal.buscarNombreAnimal(criatura);
				
				System.out.println("Introduzca el nuevo peso:");
				while (true) {
					try {
						peso = sc.nextInt();
						Animal.getListaZoo().get(posicion).setPeso(peso);
						break;
					} catch (InputMismatchException inputE) {
						sc.nextLine();
						throw new Exception("¡Error!: No ha introducido un número. Vuelva a probar\n");
					}
				}
			} else {
				throw new Exception("¡Error!: El animal que busca no existe.");
			}
		} catch (Exception exc) {
			throw new Exception(exc.getMessage());
		}

	}
}