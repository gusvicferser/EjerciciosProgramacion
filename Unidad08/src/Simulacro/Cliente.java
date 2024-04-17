package Simulacro;

import java.util.InputMismatchException;

public class Cliente {
	
	private static int edad;
	private static String nombre;
	
	public Cliente (String nombre, int edad) {
		
		nombre = this.nombre;
		edad = this.edad;
	}

	public static int getEdad() {
		return edad;
	}

	public static void setEdad(int edad) {
		Cliente.edad = edad;
	}

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Cliente.nombre = nombre;
	}
		
		
	
}
