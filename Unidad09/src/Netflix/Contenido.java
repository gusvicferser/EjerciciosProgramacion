package Netflix;

// Clase con función abstracta ha de ser abstracta también
abstract public class Contenido {

	protected String titulo;
	protected String productora;
	protected int anhoPublicacion;
	protected boolean visto;
	
	public Contenido(){
		
	}
	
//	Constructor:
	public Contenido(String titulo, String productora, int anhoPublicacion) {
		this.titulo=titulo;
		this.productora=productora;
		this.anhoPublicacion=anhoPublicacion;
		this.visto=false;
	}

//	Getters y Setters:
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isVisto() {
		return visto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	
//	Hacemos función abstracta para obligar a las subclases a tener un .toString():
	@Override
	public abstract String toString();
	
}
