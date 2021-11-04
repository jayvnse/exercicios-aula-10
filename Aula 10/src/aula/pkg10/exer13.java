
package aula.pkg10;

import java.util.Scanner;

public class exer13 {
    public static void main(String[] args) {
        /* Faça um Programa que peça os 3 lados de um triângulo.
        O programa deverá informar se os valores podem ser
        um triângulo. Indique, caso os lados formem um triângulo,
        se o mesmo é: equilátero, isósceles ou escaleno. */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o primeiro lado");
        int lado1 = scan.nextInt();
        System.out.println("Entre com o segundo lado");
        int lado2 = scan.nextInt();
        System.out.println("Entre com o terceiro lado");
        int lado3 = scan.nextInt();
        
        if ((lado1+lado2 > lado3) || (lado2 + lado3 > lado1) || (lado1 + lado3 > lado2)){
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
                System.out.println("Esse triangulo é equilátero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
                System.out.println("Esse triangulo é escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Esse triangulo é isóceles");
            }
        } else {
            System.out.println("Não é um triangulo!");
        }
    }
}
