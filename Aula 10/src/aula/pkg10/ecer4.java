
package aula.pkg10;

import java.util.Scanner;

public class ecer4 {
    public static void main(String[] args) {
        /* Faça um Programa que verifique se uma letra digitada é vogal ou consoante.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com uma letra:");
        String letra = scan.next();
        
        /*if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("vogal");
        } else {
            System.out.println("consoante");
        }*/
        
        if (letra.length()>1){
            System.out.println("Não é uma letra");
        }   else {
                switch(letra){
                    case "a": 
                    case "e": 
                    case "i": 
                    case "o": 
                    case "u": 
                    case "A":
                    case "E":
                    case "I":
                    case "O":
                    case "U": System.out.println("vogal"); break;
                    default: System.out.println("consoante");
        
                }
            }    
        scan.close();
    }
}
