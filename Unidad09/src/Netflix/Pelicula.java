package Netflix;

public class Pelicula extends Contenido{

	protected int nominaciones;
	protected int oscars;
	
	public Pelicula() {
		
	}
	
	public Pelicula(String titulo, String productora, int anhoPublicacion, int nominaciones, int oscars) {
		
		super(titulo, productora, anhoPublicacion);
		this.nominaciones=nominaciones;
		this.oscars=oscars;
	}
	
	@Override
	public final String toString() {
		
		return this.titulo + " | " + this.productora + " | " + this.anhoPublicacion + " | " + this.oscars + " oscars | " + (this.visto? "Vista":"No vista");
	}
}
