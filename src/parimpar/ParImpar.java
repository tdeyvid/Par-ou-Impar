
package parimpar;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        int vetor [] = new int [5];
        
        for (int i = 0; i<5; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = teclado.nextInt();
        }
        for (int i = 0; i<5; i++){
            if (vetor[i]%2 ==0){
                System.out.println(vetor[i]+" E numero e par");
            
            }else 
                System.out.println(vetor[i]+" E numero e impar");
            
        }
        int i = 0;
        if (vetor[i]%2 ==0){
                int soma = vetor [i] + vetor [i];
                System.out.println("A soma dos pares: " + soma);
        }
        
    }
    
}
