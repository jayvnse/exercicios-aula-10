
package aula10;

import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
    //Faça um programa que verifique se uma letra digitada é vogal ou consoante.
       Scanner scan = new Scanner(System.in);
       System.out.println("Digite uma letra: ");
       String letra = scan.next();
       
       if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("A letra " + letra + " é uma vogal.");
       } else {
            System.out.println("A letra " + letra + " é uma consoante.");
    }   
    }
}
