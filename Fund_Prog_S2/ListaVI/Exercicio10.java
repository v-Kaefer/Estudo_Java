import java.util.Scanner;

/**
 10. Crie um programa que leia 2 vetores, A e B, ambos de 10 valores reais.
 O programa deve calcular e guardar em um vetor soma, a soma dos elementos de A com B.
 A leitura dos vetores, o cálculo e escrita do vetor soma devem ser feitos por métodos.
 */

public class Exercicio10 {

    public static void main (System args[]) {
        double [] vetorA = criaVetor();
        double [] vetorB = criaVetor();
    }

    

    public static double [] criaVetor() {        

        Scanner input = new Scanner(System.in);
        double valor = 0, controle = 0;
        double [] criaVetor = new double [10];


        for (int x=0; x<10; x++) {
            do {
                System.out.println("Insira um número inteiro e não negativo: ");
                valor = input.nextInt();
            } while (valor <= 0 );

            criaVetor[x] = valor;
        }
        return criaVetor();
    }

    public static int [] vetorSoma(int [] vetorA, int [] vetorB) {

        int i = 0;
        int [] vetorSoma = new int [10];
        while ( i < 10 ) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
            i++;
        }
        return vetorSoma;
    }
}
