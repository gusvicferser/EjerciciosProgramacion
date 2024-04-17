package unidad05;

import java.util.Arrays;
import java.util.Scanner;

public class Agenda {
	static Scanner sc = new Scanner(System.in);
			
	public static void main(String[] args) {
		System.out.println("Bienvenido a la Agenda Gustavo Víctor. Su agenda favorita:");
		menu();
	}
	//Función externa para el menú y el switch para ejecutar cada caso:
	public static void menu() {
		
		int opcion, bus, contactosTotal =0, Total =100, resultado =0;
		//String de referencia es para la búsqueda que hacemos:
		String referencia;
		
		String[] nombres = new String[Total];
		String[] numeros = new String[Total];
		String[] emails = new String[Total];
		int[] posiciones = new int[Total];
		
		do {
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println("Por favor, escoja una opción de las posibles: ");
		System.out.println("----------------------------------------------");
		System.out.println("1 - Ver contactos      ");
		System.out.println("2 - Agregar contacto   ");
		System.out.println("3 - Eliminar contacto  ");
		System.out.println("4 - Buscar por nombre  ");
		System.out.println("5 - Buscar por teléfono");
		System.out.println("6 - Buscar por correo  ");
		System.out.println("7 - Búsqueda global    ");
		System.out.println("8 - Salir de su agenda ");
		System.out.println("----------------------------------------------");
		
		opcion = sc.nextInt();
		sc.nextLine();
		
		/*
		 * Aquí pongo un mensaje de apoyo en el cual si la opción no es uno de los números, 
		 * diga algo antes de iniciarse de nuevo el menú:
		 */
		if (opcion>8 || opcion<1) System.out.println("Opción escogida inválida. Escoja una opción válida.\n");
		
		/*
		 * Aquí quiero dar la opción al usuario de que no salga o se perderá toda la información guardada
		 * lo cual pueden haber sido bastantes minutos:
		 */
		if (opcion==8) {
			System.out.println("¿Está seguro de que quiere salir? Se perderá toda la información guardada: y/n");
			String salida = "y";
			if (sc.nextLine().equalsIgnoreCase(salida)) opcion=8;
			else opcion=0;
		} 
		
		switch (opcion) {
			//Opción 1: Mostrar contactos.
			case 1:
				ver(nombres, numeros, emails, contactosTotal);
				break; 
			//Opción 2: Agregar contactos.
			case 2:
				contactosTotal = agregar(nombres, numeros, emails, posiciones, contactosTotal);
				//Traza:
				//System.out.println(nombres[contactosTotal-1] + "//" + numeros[contactosTotal-1] + "//" + emails[contactosTotal-1]);
				break;
			//Opción 3: Eliminar contactos.
			case 3:
				contactosTotal = eliminar(nombres, numeros, emails, contactosTotal, posiciones);
				break;
			//Opción 4: Buscar por nombre.
			case 4:
				if (contactosTotal!=0) {
					System.out.println("Escriba el nombre que quiere buscar en la agenda: ");
					referencia = sc.nextLine();
					resultado = busqueda(nombres, numeros, emails, contactosTotal, posiciones, 4, referencia);
					if (resultado>=-1) {
						ver(nombres, numeros, emails, resultado, posiciones);
						resultado =0;
					} else {
						System.out.println("¡No existe un contacto con ese nombre!");
					}
				} else System.out.println("No existen contactos aún para buscar");
				break;
			//Opción 5: Buscar por número.	
			case 5:
				if (contactosTotal!=0) {
					System.out.println("Escriba el número que quiere buscar en la agenda: ");
					referencia = sc.nextLine();
					resultado = busqueda(nombres, numeros, emails, contactosTotal, posiciones, 5, referencia);
					if (resultado>=-1) {
						ver(nombres, numeros, emails, resultado, posiciones);
						resultado =0;
					} else {
						System.out.println("¡No existe un contacto con ese número!");
					}
				} else System.out.println("No existen contactos aún para buscar");
				break;
			//Opción 6: Buscar por email.
			case 6:
				if (contactosTotal!=0) {
					System.out.println("Escriba el nombre que quiere buscar en la agenda: ");
					referencia = sc.nextLine();
					resultado = busqueda(nombres, numeros, emails, contactosTotal, posiciones, 6, referencia);
					if (resultado>=-1) {
						ver(nombres, numeros, emails, resultado, posiciones);
						resultado =0;
					} else {
						System.out.println("¡No existe un contacto con ese email!");
					}
				} else System.out.println("No existen contactos aún para buscar");
				break;
			//Opción 7: Búsqueda global.
			case 7:
				if (contactosTotal!=0) {
					System.out.println("Escriba su búsqueda en la agenda: ");
					referencia = sc.nextLine();
					resultado = busqueda(nombres, numeros, emails, contactosTotal, posiciones, referencia);
					if (resultado>-1) {
						ver(nombres, numeros, emails, resultado, posiciones);
						resultado =0;
					} else {
						System.out.println("¡No existe ese contacto en la agenda!");
					}
				} else System.out.println("No existen contactos aún para buscar");
				break;
			//Opción 8: Salida del sistema.
			case 8: 
				System.out.println("Gracias por haber acudido a la Agenda Gustavo Víctor para almacenar sus contactos.\n\nTenga en cuenta que la Agenda Gustavo Víctor\nNO guarda ninguna información una vez salga de ella.\n\nTenga un fantástico día ;)");
				break;
		}
		} while(opcion!=8);
		
	}
	
	//Función sobrecargada para mostrar las búsquedas:
	public static void ver(String[] nombres, String[] numeros, String[] emails, int resultado, int[] posiciones) {
		for (int i=0; i<resultado; i++) {
			System.out.printf("%d. Nombre: %s // Teléfono: %s // Mail: %s.\n", (i+1), nombres[posiciones[i]], numeros[posiciones[i]], emails[posiciones[i]]);
		}
	}
	
	//Función para mostrar los contactos en general:
		public static void ver(String[] nombres, String[] numeros, String[] emails, int contactosTotales) {
			//Aquí un pequeño if por si no hubiera contactos en la agenda:
			if (contactosTotales!=0) {
				for (int i=0; i<contactosTotales; i++) {
					System.out.printf("%d. Nombre: %s // Teléfono: %s // Mail: %s\n", (i+1), nombres[i], numeros[i], emails[i]);
				}		
			}
			else {
				System.out.println("No existen contactos en la agenda.\n");
			}
		}
		
	//Función para agregar contactos:
	public static int agregar(String[] nombres, String[] numeros, String[] emails, int[] posiciones, int contactosTotal) {
		//Hacemos un if para el total de contactos. Si se pasa del máximo, recibirá un mensaje:
		if (contactosTotal<nombres.length) {
			boolean verificado= true;
			int resultado =0;
			while (verificado) {
				System.out.println("Introduzca, por favor, el nombre a agregar: ");
				String nombre = sc.nextLine();
				if (contactosTotal!=0) {
					resultado = busqueda(nombres, numeros, emails, contactosTotal, posiciones, 4, nombre);
					}
				//Aquí según lo que nos devuelva agregamos o no. Hay que volver a pedir el nombre:
				if (resultado==0) {
					nombres[contactosTotal] = nombre;
					System.out.println("Introduzca el número de este contacto: ");
					numeros[contactosTotal] = sc.nextLine();
					System.out.println("Introduzca ahora el email: ");
					emails[contactosTotal] = sc.nextLine();
					verificado=false;
					contactosTotal++;
					return contactosTotal;
				} else {
					System.out.println("¡El nombre que intenta introducir ya existe!");
					verificado=true;
				}
			}
		} else System.out.println("¡Su agenda está llena! ¡Elimine algún contacto antes!");
		return contactosTotal;
	}
	
	//Realizamos la función para eliminar un contacto: 
	public static int eliminar(String[] nombres, String[] numeros, String[] emails, int contactosTotal, int[] posiciones) {
		String eliminar;
		int resultado =0;
		if (contactosTotal!=0) {
			
			System.out.println("Escriba el nombre que quiere eliminar: ");
			String referencia = sc.nextLine();
			resultado = busqueda(nombres, numeros, emails, contactosTotal, posiciones, 4, referencia);
			
				if (resultado>=-1) {
					
					System.out.println("¿Quiere eliminar el contacto " + nombres[posiciones[0]] + " realmente? Y/N");
					eliminar = sc.nextLine();
					
					if(eliminar.equalsIgnoreCase("y")) {
						
						//Como eliminamos el contacto, es imprescindible que se elimine el contacto del total lo primero:
						contactosTotal--;
						for (int i =posiciones[0]; i<contactosTotal; i++) {
							nombres[i] = nombres[(i+1)];
							numeros[i] = numeros[(i+1)];
							emails[i] = emails[(i+1)];	
						}
					
					System.out.println("Contacto eliminado correctamente");
					return contactosTotal;
				}
			} else System.out.println("¡No existe el contacto a eliminar!");
		} else {
			System.out.println("¡No existen contactos a eliminar!... Pero... vanpiro esisten");
		}
		return contactosTotal;
	}
	//Función para buscar por nombre, numero o email(por separado de momento):
	public static int busqueda(String[] nombres, String[] numeros, String[] emails, int contactosTotal, int[] posiciones, int bus, String referencia) {
		
		//El contador lo usamos sólo para, en el caso de que no haya nombres, se diga por pantalla:
		int cont=0;
		
		switch (bus) {
			//Caso para la opción 4 (Búsqueda por nombre):
			case 4:
				for (int i =0; i<contactosTotal; i++) {
					if (nombres[i].toLowerCase().indexOf(referencia.toLowerCase())>-1) {
						posiciones[cont] = i;
						cont++;
					}
				}
				//En caso de que no haya nada, se devolverá el contador sin más:
				return cont; 
			//Caso para la opción 5 (Búsqueda por número):
			case 5:
				for (int i =0; i<contactosTotal; i++) {
					if (numeros[i].toLowerCase().indexOf(referencia.toLowerCase())>-1) {
						posiciones[cont] = i;
						cont++;
					}
				}
				//Lo mismo que en el caso anterior, cuando no hay se devuelve el contador:
				return cont;
			//Caso para la opción 6 (Búsqueda por email):
			case 6:
				for (int i =0; i<contactosTotal; i++) {
					if (emails[i].toLowerCase().indexOf(referencia.toLowerCase())>-1) {
						posiciones[cont] =i;
						cont++;
					} 
				}
				//Los mismo que en los casos anteriores, cuando no hay, se devuelve el contador:
				return cont;
			} return cont;
	}
	//Función para búsqueda global:
	public static int busqueda(String[] nombres, String[] numeros, String[] emails, int contactosTotal, int[] posiciones, String referencia) {
		
		int cont =0;
		for (int i =0; i<contactosTotal; i++) {
			if (nombres[i].toLowerCase().indexOf(referencia.toLowerCase())>-1 || numeros[i].toLowerCase().indexOf(referencia.toLowerCase())>-1 || emails[i].toLowerCase().indexOf(referencia.toLowerCase())>-1) {
				posiciones[cont] = i;
				cont++;
			}
		} return cont;
		
	}
}