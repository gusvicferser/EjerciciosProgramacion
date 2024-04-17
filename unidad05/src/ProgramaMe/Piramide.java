package ProgramaMe;

import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, bloquesTotales, bloques, piso=0, n=1;
		num = sc.nextInt();
		bloques=num;
		
		while (num!=0) {
			
			while (bloques>0) {
				bloquesTotales = n*n;
				bloques-=bloquesTotales;
				piso++;
				n+=2;
			}
			System.out.println(piso);
			bloques=0; bloquesTotales=0; piso=0; n=1;
			num=sc.nextInt();
			bloques=num;
			
	}

}
}