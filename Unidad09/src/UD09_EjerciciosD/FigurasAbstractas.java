package UD09_EjerciciosD;

import java.util.ArrayList;

public class FigurasAbstractas {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<Figura>();

		figuras.add(new Circulo(10)); // Radio=10
		figuras.add(new Cuadrado(10)); // Lado=10
		figuras.add(new Triangulo(10, 5)); // Base=10, Altura=5;
		figuras.add(new Rectangulo(10, 5)); // Base=10, Altura=5;

		for (Figura f : figuras)
			System.out.println("Área: " + f.area());
	}
}

abstract class Figura { // En este ejercicio vamos a implementar una clase abstracta a través de un método que se tendrá que sobreescribir

	protected double area;

//		Haremos el constructor de la clase figura para el área:
	public Figura(double area) {
		this.area = area;
	}

	public Figura() {

	}

	protected abstract double area(); // Los métodos abstractos no tienen cuerpo "{ }", se pone ';' al acabar de definir la cabecera.
}

class Circulo extends Figura {

	protected int radio;

	public Circulo() {
		super();
	}

	public Circulo(int radio) {
		super();
		this.radio = radio;
		area();
	}

	@Override // Se pone Override en todas las funciones que se sobreescriben
	protected double area() {		
		return (Math.PI * (Math.pow(radio, 2)));
	}

}

class Cuadrado extends Figura {

	protected int lado;

	public Cuadrado() {
		super();
	}

	public Cuadrado(int lado) {
		super();
		this.lado = lado;
		area();
	}

	@Override // Se pone Override en todas las funciones que se sobreescriben
	protected double area() {
		return Math.pow(lado, 2);
	}

}

class Triangulo extends Figura {

	protected int base;
	protected int altura;

	public Triangulo() {
		super();
	}

	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
		area();
	}

	@Override // Se pone Override en todas las funciones que se sobreescriben
	protected double area() {
		return ((base * altura) / 2);
	}
}

class Rectangulo extends Figura {

	protected int base;
	protected int altura;

	public Rectangulo() {
		super();
	}

	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
		area();
	}

	@Override // Se pone Override en todas las funciones que se sobreescriben
	protected double area() {
		return (base*altura);
	}
}
