package Netflix;

public class Serie extends Contenido{

	protected int temporadas;
	protected boolean finalizada;
	
	public Serie() {
		
	}
	
//	Constructor
	public Serie(String titulo, String productora, int anhoPublicacion, int temporadas, boolean finalizada) {
		super(titulo, productora, anhoPublicacion);
		this.temporadas=temporadas;
		this.finalizada=finalizada;
		
	}
	
//	.toString() heredada y final:
	@Override
	public final String toString(){
		
		return this.titulo + " | " + this.productora + " | " + this.anhoPublicacion + " | Temporadas " + this.temporadas + " | " + (this.finalizada? "Finalizada":"En proceso") + " | " + (this.visto? "Vista":"No vista");
		
	}
	
}
