package UD09_EjerciciosB;

public class ProgramaCuentasBancarias {

	public static void main(String[] args) {
		
		

	}

}

class CuentaCorriente {
	
	protected String titular;
	protected double saldo;
	protected final double comisionOperacion;
	protected final double comisionMensual;
	protected final double interesMensual;
	
//	 public CuentaCorriente() {     }
	
	public CuentaCorriente(String titular, double saldo, double comisionOperacion, double comisionMensual, double interesMensual) {
		
		this.titular=titular;
		this.saldo=saldo;
		this.comisionOperacion=comisionOperacion;
		this.comisionMensual=comisionMensual;
		this.interesMensual=interesMensual;
		
		
	}
	
	protected boolean ingresar(double dinero) {
		
		return true;
		
	}
	
	protected void actualizarMensualidad() {
		
	}
}

class CuentaAhorro extends CuentaCorriente {
	
	public CuentaAhorro (String titular, double saldo, double comisionOperacion, double comisionMensual, double interesMensual){
		super(titular, saldo, comisionOperacion, comisionMensual, interesMensual);
	}
	
}

class CuentaPro extends CuentaCorriente {
	
	public CuentaPro(String titular, double saldo, double comisionOperacion, double comisionMensual, double interesMensual){
		super(titular, saldo, comisionOperacion, comisionMensual, interesMensual);
	}
}
