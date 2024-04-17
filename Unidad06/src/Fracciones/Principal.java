package Fracciones;

public class Principal {

	public static void main(String[] args) {
		
		Fraccion f1 = new Fraccion(2, 3);
		Fraccion f2 = new Fraccion(2, 3);
		Fraccion fmul=f1.multiplicar(f2);
		fmul.mostrar();
		fmul = fmul.invertir();
		fmul.mostrar();
		Fraccion fdiv = f1.dividir(f2);
		fdiv.mostrar();
	}

}
