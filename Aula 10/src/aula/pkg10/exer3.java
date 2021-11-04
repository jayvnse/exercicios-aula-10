
package aula.pkg10;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        /* Faça um Programa que verifique se uma letra digitada é "F" ou "M".
        Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com uma oção (f ou m):");
        String letra = scan.next();
        
        if (letra.equalsIgnoreCase("f")){
            System.out.println("feminino");
        } else if (letra.equalsIgnoreCase("m")){
            System.out.println("masculino");
        } else {
            System.out.println("opção inválida");
        }
        scan.close();
    }
}
