package UD09_EjerciciosD;

import java.util.ArrayList;

public class ProgramaMascotas {

	public static void main(String[] args) {
		
		ArrayList <Mascota> bichillos = new ArrayList<Mascota>();
		
//		Ejercicio 1: Probamos a instanciar una mascota:
//		bichillos.add(new Mascota("Pepe", 3)); // Efectivamente no se puede instanciar
		
//		Ej.2: Creamos los Perros:
		bichillos.add(new Perro("Thor", 8));
		bichillos.add(new Perro("Huskycia", 4));
		
//		Ej.2: Creamos los Gatos:
		bichillos.add(new Gato("Cardenal Michelieur", 3));
		bichillos.add(new Gato("Michigan", 2));
		
		
//		Ej.2: Creamos los canarios:
		bichillos.add(new Canario("Pico de galo", 1));
		bichillos.add(new Canario("Mojo Picón", 6));
		
//		Ejercicio 3:
		for (Mascota bicho : bichillos) {
			System.out.println(bicho.toString());
		}
		
//		Ejercicio 4:
		for (int i=0; i<5; i++) {
			for (int j=0; j<bichillos.size(); j++) {
				bichillos.get(j).cumpleanhos();
			}
		}
		
//		Ejercicio 5:
		for (Mascota bicho : bichillos) {
			System.out.println(bicho.toString());
		}
		
//		Ejercicio 6:
		for (Mascota bicho : bichillos) {
			System.out.print(bicho.getNombre() + " dice ");
			bicho.habla();
		}
	}
}

abstract class Mascota {
	
	protected String nombre;
	protected int edad;
	
	public Mascota() {
		
	}
	
	public Mascota(String nombre, int edad) {
		
		this.nombre=nombre;
		this.edad=edad;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected void cumpleanhos() {
		edad+=1;
	}
	
	@Override
	public abstract String toString(); // toString() existe en todos los objetos instanciables de base.
	public abstract void habla();
		
}

class Perro extends Mascota {
	
	public Perro() {
		
	}
	
	public Perro(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	public String toString() {
		
		return "Perro de nombre " + nombre + " tiene " + edad + " años.";
	}
	
	@Override
	public void habla() {
		System.out.println("Guau guau");
	}
	
}

class Gato extends Mascota {
	
	public Gato() {
		
	}
	
	public Gato(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	public String toString() {
		return "Gato de nombre " + nombre + " tiene " + edad + " años.";
	}
	
	@Override
	public void habla() {
		System.out.println("Miau Miau");
	}
}

class Canario extends Mascota {
	
	public Canario() {
		
	}
	
	public Canario(String nombre, int edad) {
		super(nombre, edad);
	}
	
	@Override
	public void cumpleanhos() {
		edad+=2;
	}
	
	@Override
	public String toString() {
		return "Canario de nombre " + nombre + " tiene " + edad + " años.";
	}
	
	@Override
	public void habla() {
		System.out.println("Pio pio");
	}
}