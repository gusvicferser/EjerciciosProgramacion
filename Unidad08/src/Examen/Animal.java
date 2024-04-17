package Examen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Animal {

	private char tipo;
	private String nombre;
	private int peso;
	private static ArrayList<Animal> listaZoo = new ArrayList<Animal>();

	// Establecemos constructor que pueda lanzar excepciones:
	public Animal(char tipo, String nombre, int peso) {

		setTipo(tipo);
		setNombre(nombre);
		setPeso(peso);

	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public static ArrayList<Animal> getListaZoo() {
		return listaZoo;
	}

	public static void setListaZoo(ArrayList<Animal> listaZoo) {
		Animal.listaZoo = listaZoo;
	}

	// Hacemos la función de búsqueda de un animal, ya que la usaremos varias veces.
	// Devuelve true o false:
	public static boolean buscarAnimal(String criatura) {

		boolean encontrada = false;
		
		if (listaZoo.size() != 0) { // Si el tamaño del ArrayList es cero pasa a dar excepción.
			for (Animal animal : listaZoo) {
				if (animal.getNombre().equalsIgnoreCase(criatura)) {
					encontrada = true; 
					String nombre = animal.getNombre();// Si existe el animal, devolvemos el animal. Si no, excepción.
				} 
			}
		}
		return encontrada;
	}
	
	public static int buscarNombreAnimal(String criatura) {
		
		if (listaZoo.size() != 0) { // Si el tamaño del ArrayList es cero pasa a dar excepción.
			for (int i=0; i<listaZoo.size();i++) {
				if (listaZoo.get(i).getNombre().equalsIgnoreCase(criatura)) {
					 int posicion = i;// Si existe el animal, devolvemos el animal. Si no, excepción.
					 return posicion;
				} 
			}
		}
		return -1;
	}

	public static void addAnimal(Animal criatura) {

		listaZoo.add(criatura);
	}

	// Función para dar de baja a un animal
	public static void darBaja(String criatura) throws Exception {

		if (listaZoo.size() != 0) {
			// Buscamos la criatura en el HashMap. Si la devuelve, entonces la eliminamos,
			// si no, lanzamos una excepción:
			if (Animal.buscarAnimal(criatura)) {
				int posicion = Animal.buscarNombreAnimal(criatura);
				listaZoo.remove(posicion);
				System.out.println("La criatura ha sido dada de baja.\n");
			} else {
				throw new Exception("¡Error!: La criatura no está en la base de datos\n");
			}
		} else {
			throw new Exception("¡Error!: ¡Aún no hay animales en el Zoo!\n");
		}
	}

	public static void imprimirLista() throws Exception {

		String tipo;

		if (listaZoo.size() != 0) {
			for (Animal criatura : listaZoo) {
				if (criatura.getTipo() == 't') {
					tipo = "Tigre";
				} else {
					tipo = "León";
				}

				System.out.println(tipo + " de nombre " + criatura.getNombre() + " y peso " + criatura.getPeso() + ".");
			}
		} else {
			throw new Exception("¡Error!: ¡No hay aún animales añadidos!\n");
		}
		System.out.println();

	}
}