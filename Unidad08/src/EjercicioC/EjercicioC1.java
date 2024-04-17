package EjercicioC;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjercicioC1 {
    public static void main(String[] args) throws Exception {

        int num, cont=0;
        Scanner sc = new Scanner(System.in);

        do {
            if (cont<0){
                System.out.println("Está usted en el intento inicial.");
            } else {
                System.out.println("Está usted en el intento " + cont);
            }
            try {
                System.out.println("Introduzca un valor positivo:");
                num = sc.nextInt();
                imprimePositivo(num);

                System.out.println("Introduzca un valor negativo:");
                num = sc.nextInt();
                imprimeNegativo(num);

                cont++;

            } catch (InputMismatchException miss) {
                System.out.println("No ha introducido un valor correcto, pruebe otra vez:");
                sc.nextLine();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (cont<=5);

        }

    public static void imprimePositivo(int p) throws Exception {
            if (p<0) {
                throw new Exception ("Error: El número es menor de cero.");
            }
            System.out.println("El número positivo es: " + p);
    }

    public static void imprimeNegativo(int n) throws Exception {
            if (n>=0) {
                throw new Exception ("Error: El número es mayor o igual a cero");
            }
            System.out.println("El número negativo es:" + n);
    }
}

