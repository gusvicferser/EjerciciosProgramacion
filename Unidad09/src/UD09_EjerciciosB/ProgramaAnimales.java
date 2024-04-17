package UD09_EjerciciosB;

import java.util.ArrayList;

public class ProgramaAnimales {

	public static void main(String[] args) {
	
		ArrayList<Animal> animales = new ArrayList<Animal>();
		
		animales.add(new Animal());
		animales.add(new Pajaro());
		animales.add(new Carpintero());
		animales.add(new Gallo());
		animales.add(new Pez());
		animales.add(new Payaso());
		animales.add(new Espada());
		
		for (Animal a : animales) {
			System.out.println(a.getCanto());
		}
	}

}

class Animal{
	
	protected String canto;
	
	public Animal() {
		canto = this.getClass().getSimpleName();
	}
	
	public Animal(String canto) {
		this.canto= this.canto.concat(canto);
	}

	public String getCanto() {
		return canto;
	}

	public void setCanto(String canto) {
		this.canto = canto;
	}
}

class Pajaro extends Animal{
	
	public Pajaro() {
		super();
		canto = super.canto + " pio pio";
	}
}

class Carpintero extends Pajaro{
	
	public Carpintero() {
		super();
		canto = super.canto + " picomadera";
	}
}

class Gallo extends Pajaro{
	
	public Gallo() {
		super();
		canto = this.canto + " quiquiriqui";
	}
}

class Pez extends Animal{
	
	public Pez() {
		super();
		canto = super.canto + " glu glu";
	}
}

class Payaso extends Pez{
	
	public Payaso() {
		super();
		canto = super.canto + " chorprecha";
	}

}

class Espada extends Pez{
	
	public Espada() {
		super();
		canto = super.canto + " ... tú mataste a mi padre... ¡prepárate a morir!";
		
	}
}


