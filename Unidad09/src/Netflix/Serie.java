package Netflix;

public class Serie extends Contenido{

	protected int temporadas;
	protected boolean finalizada;
	
	public Serie() {
		
	}
	
	public Serie(String titulo, String productora, int anhoPublicacion, int temporadas, boolean finalizada) {
		super(titulo, productora, anhoPublicacion);
		this.temporadas=temporadas;
		this.finalizada=finalizada;
		
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public boolean isFinalizada() {
		return finalizada;
	}

	public void setFinalizada(boolean finalizada) {
		this.finalizada = finalizada;
	}
	
	@Override
	public final String toString(){
		
		return this.titulo + " | " + this.productora + " | " + this.anhoPublicacion + " | " + this.temporadas + " | " + (this.finalizada? "Finalizada":"En proceso") + " | " + (this.visto? "Vista":"No vista");
		
	}
	
}
