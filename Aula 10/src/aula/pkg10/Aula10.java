
package aula.pkg10;

import java.util.Scanner;

public class Aula10 {

    public static void main(String[] args) {
        // Faça um programa que peça dois números e imprima o maior deles
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        
        
        System.out.println("Entre com o primeiro número:");
        num1 = scan.nextInt();
        System.out.println("Entre com o segundo número:");
        num2 = scan.nextInt();
        
        if (num1==num2){
            System.out.println("Os números são iguais");
        } else if (num1>num2){
            System.out.println("O primeiro número é maior " + num1);
        } else {
            System.out.println("O segundo número é maior " + num2);
        }
        
    }
    
}
