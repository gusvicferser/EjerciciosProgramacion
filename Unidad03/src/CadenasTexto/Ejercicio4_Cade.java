package CadenasTexto;
import java.util.*;
import java.util.jar.Attributes.Name;
public class Ejercicio4_Cade {

	public static void main(String[] args) {
		
		//Definimos Scanner y variables String:
		Scanner sc= new Scanner(System.in);
		String nombre, apellido1, apellido2, usuario, concat;
		
		//Pedimos las variables y las introducimos en sus respectivas variables:
		System.out.println("Introduzca su nombre: ");
		nombre=sc.nextLine();
		
		System.out.println("Introduzca su primer apellido: ");
		apellido1=sc.nextLine();
		
		System.out.println("Introduzca su segundo apellido: ");
		apellido2=sc.nextLine();

		//Concatenamos las 3 primeras letras con ".substring(primer caracter, ultimo caracter) + .substring2 + .substring3":
		concat = nombre.substring(0,3) + apellido1.substring(0,3) + apellido2.substring(0,3);
		
		//Ahora las elevamos a Mayúsculas e imprimimos por pantalla el resultado:
		usuario = concat.toUpperCase();
		
		System.out.println(usuario);
		
	}

}
