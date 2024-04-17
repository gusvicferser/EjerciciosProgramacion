package EjerciciosMaestroJedi;

public class Ejercicio1_Maes {

	public static void main(String[] args) {
		//Definimos las variables:
		int x;
		int y;
		//Bucle anidado como nos pide el ejercicio:
		for (x = 0; x <= 9; x++) {
			//Aquí se imprimirá todo el bucle de 0 a 9 y saldrá:
			for (y = 0; y <= 9; y++) {
				System.out.print(y);
			}
			//Se imprime una línea y se vuelve a comenzar el bucle.
			System.out.print("\n");
		}
	}
}
