package EjerciciosMaestroJedi;

public class Ejercicio3_Maes {

	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		
		for (x = 1; x <= 9; x++) {
			for (y = 1; y <= x-1; y++) {
				System.out.print(x);
			}
			System.out.println(x);
		}
	}
}