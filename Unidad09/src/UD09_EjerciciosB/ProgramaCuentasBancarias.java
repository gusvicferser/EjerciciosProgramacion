package UD09_EjerciciosB;

import java.util.ArrayList;

public class ProgramaCuentasBancarias {

	public static void main(String[] args) {
		
		ArrayList<CuentaCorriente> banco = new ArrayList<CuentaCorriente>();
		
		

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
		
		this.saldo+=dinero;
		
		return true;
		
	}
	
	protected boolean retirar(double dinero) {
		
		if (saldo-dinero<0) {
			return false;
		} else {
			saldo-=dinero;
			return true;
		}
	}
	
	protected void actualizarMensualidad() {
		
		saldo-=comisionMensual;
		
	}
}

class CuentaAhorro extends CuentaCorriente {
	
	protected int MAX_OPERACIONES = 3;
	protected int contadorOperaciones;
	
	public CuentaAhorro (String titular, double saldo, double comisionOperacion, double comisionMensual, double interesMensual){
		super(titular, saldo, comisionOperacion, comisionMensual, interesMensual);
	}
	
	
	
	
}

class CuentaPro extends CuentaCorriente {
	
	public CuentaPro(String titular, double saldo, double comisionOperacion, double comisionMensual, double interesMensual){
		super(titular, saldo, comisionOperacion, comisionMensual, interesMensual);
	}
}
