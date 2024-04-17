package Cafetera;

public class Cafetera {

	private int cap_max;
	private int cant_actual=0;
	
	public Cafetera (int cap_max){
		
		this.cap_max = cap_max;
	}
	
	public int get_cap_max() {
		return cap_max;
	}

	public void set_cap_max(int cap_max) {
		this.cap_max = cap_max;
	}

	public int get_cant_actual() {
		return cant_actual;
	}

	public void set_cant_actual(int cant_actual) {
		this.cant_actual = cant_actual;
	}

	public void llenar_cafetera () {
		
		cant_actual = cap_max;
		System.out.println("Su cafetera está ahora llena con " + cap_max + "cl.");
	}
	
	public void servir_taza (int cant_solicitada) {
		
		if (cant_actual==0) System.out.println("La cafetera está vacía, por favor rellénela primero.");
		else if (cant_actual<cant_solicitada) {
			System.out.println("No se ha podido servir la cantidad solicitada de " + cant_solicitada + "cl se ha servido la taza con " + cant_actual + "cl.");
			cant_actual =0; 
		}
		else {
			cant_actual -= cant_solicitada;
			System.out.println("Se ha servido una taza con " + cant_solicitada + "cl. Quedan " + cant_actual + "cl.");
		}
	}
	
	public void vaciar_cafetera () {
		
		cant_actual =0;
		System.out.println("Se ha vaciado su cafetera con éxito.");
	}
	
	public void agregar_cafe (int cafe) {
		
		if (cant_actual + cafe > cap_max) System.out.println("No se puede agregar " + cafe + "cl de café en una cafetera de " + cap_max + "cl puesto que rebosaría.");
		else { 
			cant_actual+=cafe;
			System.out.println("Se han añadido " + cafe + "cl a la cafetera, quedan " + cant_actual + "cl.");
		}
	}
	
	
}
