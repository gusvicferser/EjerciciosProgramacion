package EjerciciosMaestroJedi;

public class Ejercicio7_Maes {

	public static void main(String[] args) {
		//Definimos las variables como enteros:
		int seg, hora, min;
		
		//Comenzamos el bucle con el "pack" de horas:
		for (hora = 0; hora<=23; hora++) {
			
			//Ahora el bucle de minutos. Por cada hora habra 59 minutos, hasta que llegue a las 23 horas:
			for (min = 0; min <= 59; min++) {
				
				//Ahora el bucle para segundos. Habra 59 segundos por cada minuto:
				for (seg = 0; seg<=59; seg++) {
					System.out.printf("%02d:%02d:%02d\n", hora, min, seg);
				}
				
			}
		}

	}

}
