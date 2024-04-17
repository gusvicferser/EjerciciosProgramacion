package StreetFigther;

public class Luchador {

	private String nombre;
	private int vida;
	private int rondasGanadas;
	private static int anterior;
	
	public Luchador() {
		
	}
	
	public Luchador(String nombre) {
		this.nombre=nombre;
		vida=100;
		rondasGanadas=0;
	}

	public int getVida() {
		return this.vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRondasGanadas() {
		return rondasGanadas;
	}

	public void setRondasGanadas(int rondasGanadas) {
		this.rondasGanadas = rondasGanadas;
	}

	public static int getAnterior() {
		return anterior;
	}

	public static void setAnterior(int anterior) {
		Luchador.anterior = anterior;
	}

	//Función para reducir la vida del luchador golpeado. Ha de ir acompañado de la intensidad:
	public static int intensidadGolpe() {
		int intensidad = (int)(Math.random()*50+1);
		return intensidad;
	}
	
	public void reducirVida(int intensidad) {
		setVida(vida-intensidad);
	}
	
	//Función de MrBison, el luchador final:
	public static Luchador mrBison() {
		Luchador mrBison = new Luchador("Mr.Bison");
		return mrBison;
	}
	//Con esta función se genera un nombre aleatorio de escenario entre 10 opciones.
	public String generarFrasecilla() { 
			
			int num;
			//Hago un "do while" con el número aleatorio para que no se repita la misma frase dos veces inmediatamente seguidas.
			do {
				num = (int) (Math.random()*10+1); 
			} while (anterior==num);
			anterior=num; //Al poner esta variable al salir del bucle, la cambiará si ha sido la última en decirse.
			
			switch(num) {
				case 1: 
					return ("'Pensaba que esta vez iba a ser un reto...'"); 
				case 2: 
					return ("'¡Si volvemos a vernos espero que estés mejor preparado!'"); 
				case 3: 
					return ("'Una decepción. Como tu vida en general.'");
				case 4: 
					return ("'Si quisiera el modo fácil me habría ido a pelear al Smash Brothers.'");
				case 5: 
					return ("'¿De verdad creías que tenías alguna posibilidad?'");
				case 6: 
					return ("'¡Vamos! ¡Levántate! ¡Aún no he acabado contigo!'");
				case 7: 
					return ("'SORRY-U-KEN'");
				case 8: 
					return ("'Al final sólo eran palabras, ni siquiera hechos...'");
				case 9: 
					return ("'No recuerdo tu nombre, ¿era... perdedor?'");
				case 10: 
					return ("'¡Ni toda la suerte del mundo podía haberte salvado de mí!'");
			} return "";
		}
}
