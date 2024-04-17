package EjerciciosMaestroJedi;

public class Ejercicio8_Maes {

	public static void main(String[] args) {
		//Definimos las variables dia y mes como enteros
		int dia, mes;
		
		//Comenzamos nuestro bucle por meses que es el "pack" donde van a ir los días:
		for (mes = 1; mes <=12; mes++) {
			
			//Como tenemos meses que tienen 31 días, otro que tiene 28 y otros que tienen 30, necesitamos un switch que pivote sobre la variable "mes"
			switch (mes) {
				
			//Casos en los cuales el mes tiene 31 días:
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					
					//Creamos un bucle para reflejar los meses de 31 días:
					for (dia = 1; dia <= 31; dia++) {
						System.out.printf("%02d/%02d\n", dia, mes);
					}
					
					//Super importante poner tras el bucle for una salida o break para que no siga ejecutando:
					break;
					
				//Caso para el mes de 28 días:
				case 2:
					
					//Bucle para el mes de 28 días:
					for (dia = 1; dia <= 28; dia++) {
						System.out.printf("%02d/%02d\n", dia, mes);
					}
					
					//Break nuevamente:
					break;
				
				//Casos en los que el mes es de 30 días:	
				case 4:
				case 6: 
				case 9:
				case 11:
					
					//Bucle para imprimirlo por pantalla:
					for (dia = 1; dia <=30; dia++) {
						System.out.printf("%02d/%02d\n", dia, mes);
					}
				//break ;)
				break;
				
			}
			
		}

	}

}
