
package aula.pkg10;

import java.util.Scanner;


public class exer2 {
    public static void main(String[] args) {
        // Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número");
        int num = scan.nextInt();
        
        if (num >= 0){
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
        scan.close();
    }
}
