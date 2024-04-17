package Pizzeria;

public class Pizza {

	//Iniciamos las variables privadas:
	private String status;
	private String envergadura;
	private String tipo;
	/*
	 * Aquí las variables numéricas al pasarse por copia
	 * y no por referencia, han de ser static:
	 */
	static int pedidas =0;
	static int servidas =0;
	
	//Creamos la clase constructora:
	public Pizza(String tipo, String envergadura) {
		
		this.tipo = tipo;
		this.envergadura = envergadura;
		setStatus("pedida");
		pedidas +=1;
		
	}
	//Creamos los getters y setters de los Strings:
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEnvergadura() {
		return envergadura;
	}
	public void setEnvergadura(String envergadura) {
		this.envergadura = envergadura;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	//Función para averiguar el estado de la pizza:
	public String estado_pizza() {
		return "Pizza de tipo " + tipo + " y tamaño " + envergadura + ". Estado = " + status;
	}
	//Función para servir pizzas (Sólo si no han sido entregadas):
	public void servir() {
		
		if (status.equals("servida")) System.out.println("Esta pizza ya se ha servido");
		else {
			setStatus("servida");
			pedidas-=1;
			servidas+=1;
		}
	}
	/*
	 * Función para mostrar cuántas pizzas han sido pedidas
	 * (que al ser número y para devolver número ha de ser static
	 * tanto la función que lo proporciona por ir por copia y no
	 * por referencia como la de devolución):
	 */
	public static int totalpedidas(){
		return pedidas;
	}
	//Función para mostrar las ya servidas (mismo problema que con las pedidas):
	public static int totalservidas() {
		return servidas;
	}
}
