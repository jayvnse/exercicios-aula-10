
package aula10;
import java.util.Scanner;

public class Aula10 {

    
    public static void main(String[] args) {
       //Faça um programa que peça dois números e imprima o maior deles
       Scanner scan = new Scanner(System.in);
       System.out.println("Entre com o primeiro número: ");
       int num1 = scan.nextInt();
       System.out.println("Entre com o segundo número: ");
       int num2 = scan.nextInt();
       
       if(num1 > num2){
           System.out.println("O número " + num1 + " é maior.");
       }
       else
           System.out.println("O número " + num2 + " é maior.");
    }
    
}
