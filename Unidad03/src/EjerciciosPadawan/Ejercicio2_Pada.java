package EjerciciosPadawan;
import java.util.*;

public class Ejercicio2_Pada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca su usuario: ");
		String usuario = sc.nextLine();
		String userOriginal = "alumno";
		System.out.println("Por favor, introduzca la contraseña: ");
		String contraseña = sc.nextLine();
		String contraseña2 = "1234567";

		if (usuario.equals(userOriginal)) {//Si devuelve true es que son iguales
			System.out.println("El usuario es correcto.");
		}
		else {
			System.out.println("El usuario no es correcto: ");
		}
		if (contraseña.equals(contraseña2)) {
			System.out.println("La contraseña es correcta.");
		}
		else {
			System.out.println("La contraseña es incorrecta. Debe repetir el proceso.");
		}
		
	}



}
