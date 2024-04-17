package GestionFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A1PruebasFicheros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String raiz;

		do {

			System.out.println("Buenas tardes. Introduzca la ruta que quiere indagar:");

			raiz = sc.nextLine(); // Guardamos el file o ruta

			if (!raiz.equals("")) { //Si la ruta es igual a nada (enter a secas) entonces salimos del bucle
				File busqueda = new File(raiz);

				try {
					muestraInfoRuta(busqueda); // Creamos una función como nos pide el ejercicio y la llamamos tratando la excepción que provoca con un try catch
				} catch (Exception exc) {
					System.out.println(exc.getMessage());
				}
			} else {
				System.out.println("Como decía Matias Prats: 'Hay una escasez de anestesia en los hospitales... Se acabó lo que sedaba'");
			}

		} while (!raiz.equals(""));
	}

	public static void muestraInfoRuta(File ruta) throws FileNotFoundException {

		if (!ruta.exists()) { // Es mejor poner aquí la excepción ya que así no carga el resto
			throw new FileNotFoundException("El archivo o directorio no existe");
		}

		if (ruta.isFile()) { // Aquí si la ruta es archivo tratamos esta:
			System.out.println(ruta.getName());
		} else if (ruta.isDirectory()) { // Si la ruta es un directorio, entonces debemos mostrar los directorios que
											// este contenga primero y luego los archivos
			File[] archivosDentro = ruta.listFiles();

			if (archivosDentro.length != 0) {

				for (File directorio : archivosDentro) { // Bucle for para mostrar los directorios.
					if (directorio.isDirectory()) {
						System.out.println("[*] " + directorio.getName());
					}
				}

				for (File archivo : archivosDentro) { // Bucle para mostrar los archivos
					if (archivo.isFile()) {
						System.out.println("[A] " + archivo.getName());
					}
				}
			}
		}
	}
}