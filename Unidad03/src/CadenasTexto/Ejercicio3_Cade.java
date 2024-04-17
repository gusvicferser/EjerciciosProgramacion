package CadenasTexto;
import java.util.Scanner;
public class Ejercicio3_Cade {

	public static void main(String[] args) {
		
		//Inicializamos el scanner y definimos variables de String:
		Scanner sc= new Scanner(System.in);
		String cad1, cad2;
		
		//Pedimos al usuario las cadenas de strings y las almacenamos en variables que ya hemos definido:
		System.out.println("Escriba la primera fase: ");
		cad1=sc.nextLine();
		
		System.out.println("Escriba la segunda frase: ");
		cad2=sc.nextLine();
		
		/*Establecemos un condicional. Si la frase 1 va antes que la frase 2 dará -1. 
		*Si son iguales dará 0 y si es la segunda mayor que la primera lexicográficamente, dará +1,
		*por lo que necesitamos 3 condiciones:
		*/
		if (cad1.compareTo(cad2) < 0) {
			System.out.print(cad1 +"\n" + cad2);
		}
		else if (cad1.compareTo(cad2) > 0) {
			System.out.println(cad2+ "\n" +cad1);
		}
		else {
			System.out.println(cad1 + "\n" + cad2);
		}

	}

}
