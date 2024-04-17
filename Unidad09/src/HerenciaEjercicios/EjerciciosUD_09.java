package HerenciaEjercicios;

import java.util.ArrayList;

public class EjerciciosUD_09 {

	public static void main(String[] args) {

//		Ejercicio 8:
		ArrayList<Persona> personas = new ArrayList<Persona>(); // Un arraylist de una clase, admite todas las subclases en el mismo:

		
		personas.add(new Persona("Juan", "Algo", "13-12-2011"));
		personas.add(new Persona("Alberto", "Tremendo", "11-10-2009"));
		personas.add(new Persona("Maripili", "Flipante", "10-09-2008"));

		personas.add(new Profesor("Ferran", "Primero", "09-08-2007", 1548.5, "Programación"));
		personas.add(new Profesor("Paco", "ElBueno", "08-07-2006", 1234.5, "Lenguaje de Marcas"));
		personas.add(new Profesor("Sergio", "Tercero", "07-06-2005", 1357.5, "Base de datos"));

		personas.add(new Alumno("Sandra", "Cuarta", "06-05-2004", "1o DAW", 8.8));
		personas.add(new Alumno("Eloy", "Quinto", "05-04-2003", "2o DAM", 6.9));
		personas.add(new Alumno("Víctor", "Sexto", "04-03-2002", "3o DAW", 7.2));

		for (Persona ese : personas) System.out.println(ese.toString()); // Llama al método .toString() de su propia clase.
		

	}

}

class Persona {

//	Ejercicio 3:
	protected String nombre;
	protected String apellidos;
	protected String fechaNacim;

	public Persona(String n, String a, String f) {
		nombre = n;
		apellidos = a;
		fechaNacim = f;
	}

//	Ejercicio 4:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getFechaNacim() {
		return fechaNacim;
	}

	public void setFechaNacim(String fechaNacim) {
		this.fechaNacim = fechaNacim;
	}

//	Ejercicio 6:
	@Override
	public String toString() {
		return (this.getClass().getSimpleName() + " de nombre: " + nombre + " " + apellidos + " que nació el " + fechaNacim);
	}
}

// Ejercicio 1:
class Profesor extends Persona {

//	Ejercicio 3:
	protected double salario;
	protected String especialidad;

	public Profesor(String nombre, String apellidos, String fechaNac) {

		super(nombre, apellidos, fechaNac);

	}

//	Ejercicio 7:
	public Profesor(String nombre, String apellidos, String fechaNac, double salario, String especialidad) {

		super(nombre, apellidos, fechaNac);
		this.salario = salario;
		this.especialidad = especialidad;

	}

//	Ejercicio 4:
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

//	Ejercicio 5:
	@Override
	public String getNombre() {
		return ("Profesor:" + nombre);
	}

	public String toString() {
		return (super.toString() + ", tiene " + salario + "€ de salario y su especialidad es " + especialidad + ".");

	}
}

// Ejercicio 2:
class Alumno extends Persona {

//	Ejercicio 3:
	protected String grupo;
	protected double notaMedia;

	public Alumno(String nombre, String apellidos, String fechaNac) {

		super(nombre, apellidos, fechaNac);

	}

//	Ejercicio 7:
	public Alumno(String nombre, String apellidos, String fechaNac, String grupo, double notaMedia) {

		super(nombre, apellidos, fechaNac);
		this.grupo = grupo;
		this.notaMedia = notaMedia;
	}

//	Ejercicio 4:
	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

//	Ejercicio 5:
	@Override
	public String getNombre() {
		return ("Alumnos:" + nombre);
	}

	public String toString() {
		return (super.toString() + ", tiene " + notaMedia + " de nota media y su grupo es " + grupo + ".");
	}
}
