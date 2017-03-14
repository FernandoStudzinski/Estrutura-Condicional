
package br.com.satc.atividades;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a primeira nota?");
        float nota1 = entrada.nextFloat();
        System.out.println("Informe a segunda nota?");
        float nota2 = entrada.nextFloat();
        System.out.println("Informe a terceira nota?");
        float nota3 = entrada.nextFloat();
        
        float media = ((nota1+nota2+nota3)/3);
        
        System.out.println("Qual a nota minima para a aprovação?");
        float aprovação = entrada.nextFloat();
        if (media >=aprovação) {
            System.out.println("Aprovado");
        }else {
        System.out.println("É permitido prova de recuperação?");
         String recup = entrada.next();
           
           
         
                 
        }
            }
        
            }
         
        
        
        
        
        
        
        
         
        
        
                
        
                
    
 } 
 }
