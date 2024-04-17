package ArrayList;

public class Contacto implements Comparable {

	private String nombre;
	private String telefono;
	private String email;
	private int edad;

	// Método constructor:
	public Contacto(String nombre, String telefono, String email, int edad) {

		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.edad = edad;
	}

	// Getters y Setters:
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void mostrarDatos() {

		System.out.println("Nombre: " + nombre + " // Teléfono: " + telefono + " // Email: " + email + " // Edad: " + edad);
	}

	/*@Override // Override hemos de especificarlo cuando sobreescribimos un método que ya
				// existe como "compareTo()"
	public int compareTo(Object o) { // Aquí le pasamos un objeto sin definir.
		Contacto c = (Contacto) o; // La cuestión aquí es que el programador ha de saber que el casting puede
									// hacerse y definir el objeto porque el compilador no puede asegurarse de que
									// este casting puede hacerse realmente.
		
		return this.nombre.compareToIgnoreCase(c.nombre); // Con esto le estamos diciendo que este nuevo nombre que
															// viene del objeto hecho contacto a través de casting, lo
															// podemos comparar con el nombre del objeto que ya tenemos
															// (contacto con this.contacto)
	}*/
	
	@Override
	public int compareTo (Object o) {
		
		Contacto c = (Contacto) o;
		
		if (this.edad>c.edad) {
			return 1;
		} else if (this.edad==c.edad) {
			return 0;
		} else 
			return -1;
	}

}
