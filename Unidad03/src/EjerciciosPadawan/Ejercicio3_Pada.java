package EjerciciosPadawan;

import java.util.Scanner;

public class Ejercicio3_Pada {

	public static void main(String[] args) {
		//Declaro variables.
		int d, m, a;
		boolean fecha_valida = false; //Porque así compruebo si la fecha es válida cuando salgo del switch. Hemos de iniciarla a false.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el día: "); //Si escribimos "sysout" y pulsamos control+espacio y enter aparece directamente el System.out.println() 
		d = sc.nextInt();
		
		System.out.println("Introduzca mes: ");
		m = sc.nextInt();
		
		System.out.println("Introduzca año: ");
		a = sc.nextInt();
		
		switch(m) {
		case 1: //No vamos a colocar "break" porque queremos que llegue al "if" the abajo para comprobar.
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (d>=1 && d<=31) //El "if" no lleva {} cuando es una sola instrucción porque Java nos lo permite.
				fecha_valida = true;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (d>=1 && d<=30)
				fecha_valida = true;
			break;
		case 2: 
			if (d>=1 && d<=28)
				fecha_valida = true;
		} //El "break" lleva aquí
		if (fecha_valida) {
			System.out.println("Fecha Válida.");
		}
		else {
			System.out.println("Fecha no Vaĺida.");
		}
	
	}
	

}
