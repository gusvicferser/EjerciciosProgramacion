package Netflix;

abstract public class Contenido {

	protected String titulo;
	protected String productora;
	protected int anhoPublicacion;
	protected boolean visto;
	
	public Contenido(){
		
	}
	
	public Contenido(String titulo, String productora, int anhoPublicacion) {
		this.titulo=titulo;
		this.productora=productora;
		this.anhoPublicacion=anhoPublicacion;
		this.visto=false;
	}

	public boolean isVisto() {
		return visto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	
	@Override
	public abstract String toString();
	
}
