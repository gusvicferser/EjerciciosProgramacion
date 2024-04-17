package CadenasTexto;
import java.util.*;
public class Ejercicio2_Cade {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String cad1, cad2;
		
		System.out.println("Introduzca la primera frase: ");
		cad1 = sc.nextLine();
		
		System.out.println("Introduzca la segunda frase: ");
		cad2=sc.nextLine();
		
		if (cad1.equals(cad2)==true) {
			System.out.println("Son iguales.");
			
		}
		else if (cad1.equalsIgnoreCase(cad2)==true) {
			System.out.println("Son iguales pero sin contar con las mayúsculas.");
						
		}
		else {
			System.out.println("No son iguales.");
		}

	}

}
