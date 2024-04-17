package UD09_EjerciciosD;

import java.util.ArrayList;
import java.util.HashMap;

public class SistemaSolar {

	public static void main(String[] args) {
		
		String sistema = "Sistema Solar", planeta, luna;
		
		HashMap<String, ArrayList<Planeta>>sistemas = new HashMap<String, ArrayList<Planeta>>();
		HashMap<String, ArrayList<Satelite>>planetas = new HashMap<String, ArrayList<Satelite>>();
		
//		Creamos un array por cada sistema:
		ArrayList<Planeta>sistemaSolar = new ArrayList<Planeta>();
		sistemas.put(sistema, sistemaSolar);
		
//		Creamos planeta:
		Planeta Jupiter = new Planeta("Jupiter", "1,899×10^27Kg", -121.15, 588000000);
		planeta = "jupiter";
		
//		Añadimos 'jupiter' al HashMap:
		sistemaSolar.add(Jupiter);
		
//		Creamos un Array de Jupiter para las lunas:
		ArrayList<Satelite> jupiter = new ArrayList<Satelite>();
		planetas.put(planeta, jupiter);
		
//		Creamos una luna:
		Satelite titan = new Satelite("Titan", "Muchisima", -235, 1000000);
		jupiter.add(titan);
		
//		Creamos otro planeta:
		Planeta Saturno = new Planeta("Saturno", "5,688×10^26Kg", -130.15, 1195000000);
		planeta="saturno";
		
//		Creamos el ArrayList de sus lunas:
		ArrayList<Satelite> saturno = new ArrayList<Satelite>();
		sistemaSolar.add(Saturno);
		planetas.put(planeta, saturno);
		
		for(Planeta elemento : sistemaSolar) {
			System.out.println(elemento.toString());
		}
		for(Satelite elemento : jupiter) {
			System.out.println(elemento.toString());
		}
		for(Satelite elemento : saturno) {
			System.out.println(elemento.toString());
		}
	}

}

abstract class Astro{
	
	protected String nombre;
	protected String masa;
	protected double temperaturaMedia;
	
	public Astro(){
		
	}
	
	public Astro(String nombre, String masa, double temperaturaMedia) {
		
		this.nombre=nombre;
		this.masa=masa;
		this.temperaturaMedia=temperaturaMedia;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public abstract String toString();
	
}

class Planeta extends Astro{
	
	protected double distanciaSol;
//	Se puede hacer (y de hecho se debería) hacer Arrays en esta clase. (Pendiente)
	
	public Planeta () {
		
	}
	
	public Planeta(String nombre, String masa, double temperaturaMedia, double distanciaSol) {
		
		super(nombre, masa, temperaturaMedia);
		this.distanciaSol=distanciaSol;
		
	}
	
	@Override
	public final String toString() {
		
		return "Planeta de nombre " + nombre + " y masa " + masa + ". Tiene una temperatura media de " + temperaturaMedia + " y una distancia a su sol de " + distanciaSol;
	}
}

class Satelite extends Astro{
	
	protected double distanciaPlaneta;
	
	public Satelite() {
		
	}
	
	public Satelite(String nombre, String masa, double temperaturaMedia, double distanciaPlaneta) {
		
		super(nombre, masa, temperaturaMedia);
		this.distanciaPlaneta=distanciaPlaneta;
		
	}
	
	@Override
	public final String toString() {
		
		return "Satélite de nombre " + nombre + " y masa " + masa + ". Tiene una temperatura media de " + temperaturaMedia + " y una distancia a su planeta de " + distanciaPlaneta;
	}
}
