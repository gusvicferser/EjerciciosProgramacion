package UD09_EjerciciosB;

import java.util.ArrayList;

public class ProgramaFiguras {
	
	public static void main(String[] args) {
			ArrayList<Figura> figuras = new ArrayList<Figura>();
			
			figuras.add(new Circulo(10)); // Radio=10
			figuras.add(new Cuadrado(10)); // Lado=10
			figuras.add(new Triangulo(10,5)); // Base=10, Altura=5;
			
			for (Figura f: figuras)
				System.out.println("Área: " + f.area());
			}
}

class Figura {
	
	protected double area;
	
//	Haremos el constructor de la clase figura para el área:
	public Figura(double area){
		this.area=area;
	}
	
	public Figura() {
		
	}
	
	protected double area() { // Tiene más sentido que sea protected para que nadie de fuera pueda acceder a esta función.
		return area;
	}
}

class Circulo extends Figura {
	
	protected int radio;
	
	public Circulo () {
		super();
	}
	
	public Circulo (int radio) {
		super();
		this.radio=radio;
		calcularArea();
	}
	
	private void calcularArea() {
		area = Math.PI*(Math.pow(radio, 2)); // Aunque las variables se pasen por copia, aquí estamos trabajando con la variable área de la figura
	}
	
}

class Cuadrado extends Figura {
	
	protected int lado;
	
	public Cuadrado() {
		super();
	}
	
	public Cuadrado(int lado) {
		super();
		this.lado=lado;
		calcularArea();
	}
	
	private void calcularArea() {
		area = Math.pow(lado, 2);
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
		this.base=base;
		this.altura=altura;
		calcularArea();
	}
	
	private void calcularArea() {
		area = (base*altura)/2;
	}
}

