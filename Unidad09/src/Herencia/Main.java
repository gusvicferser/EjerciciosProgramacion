package Herencia;

public class Main {

	public static void main(String[] args) {

		Persona a = new Persona("Ferran", 29);
		a.mostrar();
		Alumno b = new Alumno("Sandra", 18);
		b.mostrar();
		Alumno c = new Alumno("Gustavo", 25, 10.0);
		c.mostrarAlumno();
	}

}

// Creamos una clase después de la clase principal:
class Persona {

	protected String nombre = ""; // Si ponemos protected, sólo pueden acceder las clases de ese paquete.
	// private int edad = 0; // Si ponemos 'private', las subclases no podrán heredar este dato.
	int edad =0;
	
	
	public Persona(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;
	}

	public void mostrar() {
		System.out.println("La persona de nombre " + this.nombre + " tiene " + this.edad + " años de edad.");
	}

}

// Creamos una subclase (alumno)
class Alumno extends Persona {

	private double media;

	// Siempre que hacemos una subclase, hemos de crear inmediatamente un
	// constructor que además tenga todos los atributos que hereda y un
	// 'super' como primer argumento:
	public Alumno(String nombre, int edad) {

		super(nombre, edad);

	}

	// También podemos sobrecargar el método:
	public Alumno(String nombre, int edad, double media) {

		super(nombre, edad);
		this.media=media;

	}

	// Para acceder a un atributo de la superclase, necesitamos que el atributo esté o bien como
	// 'Protected' o bien como 'Publico' (Aunque esta última opción es peligrosa):
	public void mostrarAlumno() {
		System.out.println("La persona de nombre " + super.nombre + " tiene " + super.edad + " años de edad y una media de " + this.media);
	}
}
