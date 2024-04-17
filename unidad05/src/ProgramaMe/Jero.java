package ProgramaMe;

import java.util.Scanner;

public class Jero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int copia = 1;
		int jero;

		do {
			jero = sc.nextInt();
			String resultado ="";			
			copia = jero;
			
			while (copia>=1000000) {
				copia-=1000000;
				resultado+="H";
			}
			
			while (copia>=100000) {
				copia-=100000;
				resultado+="R";	
			}
			
			while (copia>=10000) {
				copia-=10000;
				resultado+="D";
			}				
			
			while (copia>=1000) {
				copia-=1000;
				resultado+="F";
			}
			
			while (copia>=100) {
				copia-=100;
				resultado+="C";
			}
			
			while (copia>=10) {
				copia-=10;
				resultado+="G";
			}
			
			while (copia>=1) {
				copia-=1;
				resultado+="T";
			}
			if (jero!=0) {
				System.out.println(resultado);
			}
			
	} while (jero!=0);
	}
}
