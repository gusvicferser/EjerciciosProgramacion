package UD04;

public class Arrays1 {

	public static void main(String[] args) {
		
		//Inicializamos el array o vector:
		int [] numeros; 
		
		//Creación aportando el tamaño una vez lo conozco:
		numeros = new int[5];
		
		//Declaración, creación e inicialización:
		double[] decimales = {0.0 , 1.5 , 9.5 , 4 , 5};
		
		//Para un recorrido inicializamos las variables. ¡¡Ha de ser el primer valor que hay en el array!!
		double max = decimales [0];
		double min = decimales [0];
		
		
		//Recordar poner menor estricto a la longitud y así siempre será uno menos)
		for (int posicion = 0; posicion < decimales.length; posicion++ ) {
			
			//Para un recorrido donde queremos cambiar los máximos y mínimos:
			if (decimales[posicion] < min) min = decimales [posicion];
			if (decimales[posicion] > max) max = decimales [posicion];
		}
			System.out.println("El min es: " + min + ". El max es: " + max);
			
			//Para encontrar un elemento concreto dentro del array:
			//if (decimales[posicion] == 9.5) System.out.println("Sí hay un 9,5 en el array");
			
			/*Para cambiar un valor dentro del array:
			decimales [posicion] = 1.7;
			System.out.println("La posición " + posicion + " contiene " + decimales[posicion]);
			 */
		}

	}


