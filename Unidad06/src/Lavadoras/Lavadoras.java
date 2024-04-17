package Lavadoras;

public class Lavadoras {
	
	private String marca;
	private String modelo;
	private String dimensiones;
	private int rpm;
	private double precio;
	private int temperatura;
	
	public Lavadoras (String marca, String modelo, String dimensiones, int rpm, double precio) {
		/*
		 * Para distinguir entre la marca como argumento y la marca como atributo,
		 * utilizamos la palabra reservada "this" que le indica que te refieres al 
		 * atributo que tiene la clase. Para verlo pulsa sobre "marca": 
		 */
		this.marca = marca;
		this.modelo = modelo;
		this.dimensiones = dimensiones;
		this.rpm = rpm;
		this.precio = precio;
	}

	public String get_Marca() {
		return marca;
	}

	public void set_Marca(String marca) {
		this.marca = marca;
	}

	public String get_Modelo() {
		return modelo;
	}

	public void set_Modelo(String modelo) {
		this.modelo = modelo;
	}

	public String get_Dimensiones() {
		return dimensiones;
	}

	public void set_Dimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public int get_Rpm() {
		return rpm;
	}

	public void set_Rpm(int rpm) {
		this.rpm = rpm;
	}

	public double get_Precio() {
		return precio;
	}

	public void set_Precio(double precio) {
		this.precio = precio;
	}

	public void centrifugar() {
		System.out.println("La lavadora de modelo " + modelo + " y marca " + marca + " está centrifugando.");
	}
	
	public void vaciar() {
		System.out.println("La lavadora de modelo " + modelo + "y marca " + marca + " está vaciándose.");
		
	}
	
	public void set_temperatura(int temperatura) {
		this.temperatura = temperatura;
		System.out.println("La temperatura ha sido ajustada.");
	}
	
	
	
}
