package EscrituraFicheros;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.*;

public class EjercicioB4 {

	public static void main(String[] args) {

//		Iniciamos variables:
		String rutaNombres, rutaApellidos, rutaDestino, nombreAleatorio;
		int generar = 0, aleatorioApe, aleatorioNom;

//		Creamos las Strings de ruta:
		rutaNombres = "usa_nombres.txt";
		rutaApellidos = "usa_apellidos.txt";
//		String rutaPrueba = "usa_prueba.txt";

		try {
//			Creamos las files:
			File archivoNombres = new File("DOCS/" + rutaNombres);
			File archivoApellidos = new File("DOCS/" + rutaApellidos);

//			Creamos los Scanners:
			Scanner sc = new Scanner(System.in);
			Scanner lectorNombres = new Scanner(archivoNombres);
			Scanner lectorApellidos = new Scanner(archivoApellidos);

//			Creamos dos array list:
			ArrayList<String> nombrePersona = new ArrayList<String>();
			ArrayList<String> apellidoPersona = new ArrayList<String>();

//			Leemos y añadimos los nombres y los apellidos a los ArrayList:
			while (lectorNombres.hasNextLine()) {
				nombrePersona.add(lectorNombres.nextLine());
			}

			while (lectorApellidos.hasNextLine()) {
				apellidoPersona.add(lectorApellidos.nextLine());
			}

//			Preguntamos al usuario cuántos nombres aleatorios quiere generar:
			System.out.println("¿Cuántos nombres quiere generar aleatoriamente?");
			generar = sc.nextInt();
			sc.nextLine();
			
			System.out.println("¿A qué archivo le gustaría añadirlos?");
			rutaDestino = sc.nextLine();
			
//			Creamos el escritor. Ponemos el append a true para que borre lo que ya hay:
			FileWriter escritor = new FileWriter("DOCS/" + rutaDestino, true);
//			FileWriter escritor = new FileWriter("DOCS/" + rutaPrueba, true); // Prueba

//			Generamos dos aleatorios, uno para nombre y otro para apellido:
			for (int i = 0; i < generar; i++) {
				aleatorioNom = (int) (Math.random() * nombrePersona.size());

				aleatorioApe = (int) (Math.random() * apellidoPersona.size());

				nombreAleatorio = nombrePersona.get(aleatorioNom) + " " + apellidoPersona.get(aleatorioApe);

				escritor.write(nombreAleatorio + "\n");

			}
			
			lectorNombres.close();
			lectorApellidos.close();
			escritor.close();

			System.out.println("Se han generado " + generar + " nombres aleatorios y se han introducido en el archivo "
					+ rutaDestino);

		} catch (FileNotFoundException fnfe) {
			System.out.println("No se encuentra el archivo, revise el nombre.");

		} catch (FileAlreadyExistsException fae) {
			System.out.println("El archivo que intenta crear ya existe.");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
