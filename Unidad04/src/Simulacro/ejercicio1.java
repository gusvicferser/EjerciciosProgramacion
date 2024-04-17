package Simulacro;
import java.util.*;
public class ejercicio1 {

	public static void main(String[] args) {
		
		//Iniciamos scanner:
		Scanner sc= new Scanner(System.in);
		
		//Iniciamos variables;
		String nia ="", nombreCompleto, fechaNacimiento, modulo, cadena;
		int modulos, pos=0, pos1, pos2, aprobados =0, suspendidos =0, suma=0;
		boolean diez=false, cero=false;
		
		//Le pedimos al usuario el nombre completo:
		System.out.println("Bienvenido a Sistemas Gustavo. Estamos aquí para ayudarle. Introduzca el nombre del alumno o alumna y pulse 'enter': ");
		nombreCompleto=sc.nextLine();
		
		//Ahora la fecha de nacimiento:
		System.out.println("Introduzca ahora la fecha de nacimiento del alumno y pulse 'enter': ");
		fechaNacimiento = sc.nextLine();
		
		//Pedimos el número de asignaturas:
		System.out.println("Por favor, introduzca el número de módulos al que está inscrito el alumno y pulse 'enter':");
		modulos = sc.nextInt();
		sc.nextLine();
		
		
		
		nombreCompleto= nombreCompleto.toUpperCase();
		
		pos1= nombreCompleto.indexOf(" ");
		pos2= nombreCompleto.indexOf(" ", (pos1+1));
		nia+=nombreCompleto.substring(0, 3);
		nia+=nombreCompleto.substring((pos1+1), (pos1+4));
		nia+=nombreCompleto.substring((pos2+1), (pos2+4));
		nia+=fechaNacimiento.substring(fechaNacimiento.length()-4, fechaNacimiento.length());
		
		
		//Iniciamos dos arrays. Uno para los nombres y otro para las notas:
		String asignaturas[] = new String[modulos];
		int notas[] = new int[modulos];
		
		//Creamos un bucle for para introducir los módulos y las notas en sus arrays:
		for (int i=0; i < asignaturas.length; i++) {
			System.out.println("Introduzca el módulo y pulse 'enter': ");
			asignaturas[i] = sc.nextLine();
			
			System.out.println("Introduzca ahora la nota de esa asignatura y pulse 'enter'");
			notas[i] = sc.nextInt();
			sc.nextLine();
			
			suma+=notas[i];
			if (notas[i]<5)suspendidos++;
			if (notas[i]>=5)aprobados++;
			if (notas[i]==10)diez=true;
			if (notas[i]==0)cero=true;
			
			
			//Primera traza:
			//System.out.println("Modulo: " + asignaturas[i] + ". Nota: " + notas[i]);
		}
		System.out.println("BOLETIN DE NOTAS: ");
		System.out.println("Alumno/a: " + nia);
		System.out.println("-----------------------");
		for (int i =0; i<modulos; i++) {
			System.out.printf("%s \t %d \n", asignaturas[i], notas[i]);
			
		}
		System.out.println("-----------------------");
		System.out.printf("Nota media: \t %d \n", suma/modulos);
		System.out.printf("Aprobados: \t %d \n", aprobados);
		System.out.printf("Suspendidos: \t %d \n", suspendidos);
		
		if (cero) {System.out.println("¿Algún 0?: \t Sí");}
		else {System.out.println("¿Algún 0?: \t No");}
		if (diez) {System.out.println("¿Algún 10?: \t Sí");}
		else {System.out.println("¿Algún 10?: \t No");
		
		
		
		
		

	}

}
}
