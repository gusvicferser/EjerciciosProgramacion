package Lavadoras;

public class Principal {

	public static void main(String[] args) {
		
		Lavadoras lavadoras1 = new Lavadoras("Hyperflush", "Chorros de l'oro", "150x155", 30000, 599.99);
		
		Lavadoras lavadoras2 = new Lavadoras("Tremenda", "La Clasica", "800x800", 40000, 455.37);
		
		Lavadoras lavadoras3 = new Lavadoras("Harry", "Lavadus Maxima", "200000x200000", 1000000, 999.99);

		lavadoras1.centrifugar();
		
		lavadoras2.set_Dimensiones("365x365");
		
		System.out.println("Dimensiones de la lavadora 2: " + lavadoras2.get_Dimensiones());
		
		lavadoras3.vaciar();
		
		lavadoras1.set_Precio(699.99);
		
		System.out.println("Precio de la lavadora 1: " + lavadoras1.get_Precio());
		
		/*System.out.println("Modelo: " + lavadoras1. get_Modelo()+ ". Marca: " + lavadoras1.get_Marca() + ". Precio: " + lavadoras1.get_Precio());
		System.out.println("Modelo: " + lavadoras2. get_Modelo()+ ". Marca: " + lavadoras2.get_Marca() + ". Precio: " + lavadoras2.get_Precio() + ". Dimensiones de la lavadora 2: " + lavadoras2.get_Dimensiones());
		System.out.println("Modelo: " + lavadoras3. get_Modelo()+ ". Marca: " + lavadoras3.get_Marca() + ". Precio: " + lavadoras3.get_Precio());
		 */
	}

}
