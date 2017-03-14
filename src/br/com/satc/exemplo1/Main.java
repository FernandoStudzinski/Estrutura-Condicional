package br.com.satc.exemplo1;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Main {

    public static void main(String[] args) {
        // IF
        //switch case

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();
        if (idade <= 13) {
            System.out.println("Criança");
        } else if ((idade >= 18) && (idade <= 26)){
        System.out.println("Jovem adulto");
        } if ((idade >26) && (idade < 65 )){
        System.out.println("Jovem adulto");
        } else
            System.out.println("Idoso");

    }

}
