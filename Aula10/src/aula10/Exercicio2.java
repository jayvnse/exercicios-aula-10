
package aula10;
import java.util.Scanner;

public class Exercicio2 {
    
    
    public static void main(String[] args) {
    //Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo
       Scanner scan = new Scanner(System.in);
       System.out.println("Entre com um número: ");
       int num = scan.nextInt();
       
       if(num >= 0) {
            System.out.println("O número " + num + " é positivo.");
       }
       else
            System.out.println("O número " + num + " é negativo.");
    }
    
}
