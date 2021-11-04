
package aula.pkg10;

import java.util.Scanner;
public class exer16 {
    public static void main (String[] args){
        /*Faça um Programa que leia 2 números e em seguida pergunte ao
        usuário qual operação ele deseja realizar. O resultado da operação
        deve ser acompanhado de uma frase que diga se o número é:
        ● par ou ímpar;
        ● positivo ou negativo;
        ● inteiro ou decimal;*/
        
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        String op1 = "1"; //par ou impar
        String op2 = "2"; //positivo ou negativo
        String op3 = "3"; //inteiro ou decimal
        
        System.out.println("Informe o primeiro número: ");
        num1 = scan.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = scan.nextInt();
        
        
        scan.close();
    }
}
