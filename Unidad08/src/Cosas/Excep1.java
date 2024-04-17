package Cosas;

public class Excep1 {

	public static void main(String[] args) {

		// He pedido los datos al cliente y me ha puesto edad -3;
			try {
				Contacto nuevoCliente = new Contacto("Ferran", "654321987", "ajdkjfk@mail.com", -3);
				
			} catch (Exception e) { // El catch toma la excepción pero la tratamos como un objeto.
				
				// Este catch, captura un error y hace lo que le pedimos aquí.
				System.out.println("No puedo crear tu contacto porque tiene una edad negativa.");
				
			} finally {
				
				// Aquí podemos poner lo que sucede tanto si entra como si no.
				System.out.println("El programa ha terminado correctamente.");
			}
		
		

	}

}
