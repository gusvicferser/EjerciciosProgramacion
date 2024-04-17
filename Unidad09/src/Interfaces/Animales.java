package Interfaces;

public class Animales {

	public static void main(String[] args) {
		
		Animal canela = new Husky(); // Esto entra dentro de la categoría animal y luego definimos que tiene las características de perro. 
		canela.hablar();
		canela.sit();
		
		Animal pepe = new Chiguagua();
		pepe.hablar();
		pepe.sit();
	}

}

interface Animal{ // Igual que una clase heredada, una clase interfaz es abstracta y ha de definirse luego.
	
	void hablar(); // Todos los métodos que implementemos en la interfaz son publicos de base
	void sit(); // Cualquier método que queramos implementar en la clase que instanciamos, debe estar al menos, requerida en la interfaz.
}

abstract class Perro implements Animal {
	
	public abstract void sit();
	
	@Override // Estamos sobreescribiendo el método que hemos de definir obligatoriamente.
	public void hablar() { // Debemos poner public ya que por defecto es protected.
		System.out.println("WOOF, WOOF");
	}
}

final class Husky extends Perro{
	
	protected boolean sentado;
	
	@Override
	public void sit() {
		sentado=true;
	}
}

final class Chiguagua extends Perro{
	
	
	
	@Override
	public void sit() {
		System.out.println("Soy un chiguagua y eso no me es posible.");
	}
}