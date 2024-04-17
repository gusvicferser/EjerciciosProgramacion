package Fracciones;

public class Fraccion {

	private int numerador;
	private int denominador;
	
	
	public Fraccion(int numerador, int denominador) {
		
		this.numerador = numerador;
		this.denominador = denominador;
		
	}
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	//Se puede invocar una clase desde la propia clase con 'restante':
	public Fraccion invertir() {
		
		Fraccion restante = new Fraccion(0, 0);
		
		restante.numerador = this.denominador;
		restante.denominador = this.numerador;
		return restante;
		
	}
	
	public Fraccion multiplicar(Fraccion f) {
		
		Fraccion multi = new Fraccion(0, 0);
		
		multi.numerador = (this.numerador*f.numerador);
		multi.denominador = (this.denominador*f.denominador);
		
		return multi;
	}
	
	public Fraccion dividir(Fraccion f) {
		
		Fraccion divi = new Fraccion(0,0);
		
		divi=f.invertir();
		divi.numerador *= this.numerador;
		divi.denominador *= this.denominador;
		
		return divi;
	}
	
	public void mostrar() {
		System.out.println(this.numerador + "/" + this.denominador);
	}
	
}
