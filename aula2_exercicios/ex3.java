package aula2_exercicios;

import java.util.Scanner;


public class ex3 {

    public static void main(String[] args) {
     
        try (Scanner input = new Scanner(System.in)) {
            double sum = 0;
            double leitura;

            for( int i = 0; i != 10; i++){
                System.out.print("Digite um valor: ");
                leitura = input.nextDouble();
                sum += leitura;
            }

            System.out.printf("Media: %.2f\n\n", sum / 10);
        }
    }
}
