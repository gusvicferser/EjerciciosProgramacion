package Cafetera;

public class Principal {

	public static void main(String[] args) {
		
		Cafetera cafetera1 = new Cafetera(1000);
		cafetera1.llenar_cafetera();
		cafetera1.servir_taza(90);
		cafetera1.servir_taza(10);
		cafetera1.agregar_cafe(50);
		cafetera1.servir_taza(960);
		cafetera1.servir_taza(1);
		cafetera1.agregar_cafe(1200);
		cafetera1.agregar_cafe(50);
		cafetera1.vaciar_cafetera();
		cafetera1.llenar_cafetera();
	}

}
