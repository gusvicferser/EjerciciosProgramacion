package ArrayList;

import java.util.*;

public class Agenda {

	// Inicializamos Scanner estaticamente:
	static Scanner sc = new Scanner(System.in);

	// Inicializamos el ArrayList como estático para que accedan todas las
	// funciones:
	static ArrayList<Contacto> agenda = new ArrayList();

	public static void main(String[] args) {

		Agenda.menu();

	}

	public static void menu() {

		int opcion;
		// Mostramos menu hasta que la opción esté entre 1 y 5
		do {
			System.out.println("1 - Ver contactos");
			System.out.println("2 - Añadir contacto");
			System.out.println("3 - Eliminar contacto");
			System.out.println("4 - Buscar contacto");
			System.out.println("5 - Salir");

			opcion = sc.nextInt();
			sc.nextLine(); // Limpiamos el buffer.

			switch (opcion) {

			case 1:
				Agenda.mostrarContactos();
				break;
			case 2:
				System.out.println("Introduzca el nombre: ");
				String nombre = sc.nextLine();
				System.out.println("Introduzca el teléfono: ");
				String telef = sc.nextLine();
				System.out.println("Introduzca el email: ");
				String email = sc.nextLine();
				System.out.println("Introduzca la edad: ");
				int edad = sc.nextInt();
				sc.nextLine();

				// ¡¡Es super importante al instanciar un nuevo elemento añadirlo con "new"!!
				agenda.add(new Contacto(nombre, telef, email, edad));
				Collections.sort(agenda);
				System.out.println("¡Añadido correctamente!\n");
				break;
			case 3:
				Agenda.mostrarContactos();
				System.out.println("Id del contacto a eliminar: ");
				int id = sc.nextInt();
				sc.nextLine();
				if (id>=0 && id<agenda.size()) {
					agenda.remove(id);
					System.out.println("¡Contacto eliminado correctamente!");
				} else {
					System.out.println("No es un ID correcto.");
				}
				break;
				
			case 4:
				Agenda.buscarContacto();
				break;
				
			case 5:
				System.out.println("Gracias por usar la nueva agenda de Sistemas Gustavo Víctor");
				break;
			}
		} while (opcion!=5);
	}

	public static void mostrarContactos() {
		
		//Por si la agenda no tiene contactos aún:
		if(agenda.isEmpty()) {
			System.out.println("No existen contactos en la agenda.");
		} else {
			/*for (Contacto elemento : agenda) {
			// El elemento adquiere las cualidades del contenido del ArrayList:
				elemento.mostrarDatos();
			}*/
			int cont=0;
			
			for (int i=0; i<agenda.size();i++) {
				System.out.print(i + " - ");
				agenda.get(i).mostrarDatos();
				cont++;
			}
			System.out.println();
		}
	}
	
	public static void buscarContacto() {
		
		boolean resultado = false;
		
		System.out.println("Introduzca su búsqueda: ");
		String busqueda = sc.nextLine();
		
		for (Contacto elemento : agenda) {
			if (elemento.getNombre().equalsIgnoreCase(busqueda) || 
					elemento.getTelefono().equalsIgnoreCase(busqueda) ||
					elemento.getEmail().equalsIgnoreCase(busqueda)) {
				elemento.mostrarDatos();
				resultado=true;
			}	
		} 
		if (resultado==false) {
			System.out.println("No existen contactos con esa búsqueda.");
		}
	}
}
