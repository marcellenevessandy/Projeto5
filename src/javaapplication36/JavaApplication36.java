// jeito de xiru 
package javaapplication36;

import java.util.Scanner;

public class JavaApplication36 {

    public static void main(String[] args) {
        int num;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um núemro inteiro: ");
        num = ler.nextInt();

        if (num == 0) {
            System.out.println("Nulo!");
        }
        if (num > 0) {
            System.out.println("Positivo!");
        }
        if (num < 0) {
            System.out.println("Negativo!");
        }
    }
00000
}
