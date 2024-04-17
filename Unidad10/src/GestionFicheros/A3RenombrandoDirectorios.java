package GestionFicheros;

import java.io.File;

public class A3RenombrandoDirectorios {

	public static void main(String[] args) {

		File rutaFoto = new File("Documentos/Fotografias");
		File rutaFotos = new File(rutaFoto.getParent() + "/FOTOS");
		if(rutaFoto.renameTo(rutaFotos)) {
			System.out.println("Foto hecho");
		}

		File rutaLibros = new File("Documentos/Libros");
		File rutaLecturas = new File(rutaLibros.getParent() + "/LECTURAS");
		if(rutaLibros.renameTo(rutaLecturas)) {
			System.out.println("Libros hecho");
		}

		File rutaDoc = new File("Documentos");
		File rutaDocs = new File("DOCS");
		if (rutaDoc.renameTo(rutaDocs)) {
			System.out.println("Docs hecho");
		}

		cambiarNombre(rutaFotos);
		cambiarNombre(rutaLecturas);

	}

	public static void cambiarNombre(File rutaOriginal) {

		if (rutaOriginal.exists()) {
			File[] carpeta = rutaOriginal.listFiles();

			if (carpeta.length != 0) {
				for (File elemento : carpeta) {
					System.out.println(elemento.getName());
				}

				for (File elemento : carpeta) {
					elemento.renameTo(new File(elemento.getParent() + "/"
							+ elemento.getName().substring(0, (int) (elemento.length() - 4))));
				}
			} else {
				System.out.println("El directorio no contiene ningun archivo");
			}
				
			} else {
				System.out.println();
		}
	}

}
