
package aula10;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
    //Faça um programa que verifique se uma letra digitada é F ou M. De acordo com a letra, atribuir: F- Feminino, M - Masculino, Sexo Inválido
       Scanner scan = new Scanner(System.in);
       System.out.println("Informe o sexo (F ou M): ");
       String sexo = scan.next();
       
       if(sexo.equalsIgnoreCase("f")) {
           System.out.println("Feminino");
       } else if(sexo.equalsIgnoreCase("m"))
           System.out.println("Masculino");
           else{
           System.out.println("Opção inválida");         
           
       }
       scan.close();
    }
}
