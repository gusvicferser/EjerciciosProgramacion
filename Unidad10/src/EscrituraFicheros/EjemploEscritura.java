package EscrituraFicheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploEscritura {

	public static void main(String[] args) {

		try {
			File fil = new File("DOCS/Documentos.txt");
			FileWriter writer = new FileWriter(fil, true);
			writer.write("Hola Mundo!");
			writer.close(); // IMPORTANTE CERRAR EL SCANNER!!!! De lo contrario dos aplicaciones tratan de abrirlo y modificarlo.
			
		} catch (IOException e) {
			System.out.println("No se ha realizado la escritura.");
		}

	}
}
