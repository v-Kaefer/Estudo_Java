package Fund_Prog_S2.TrabalhoAvaliativo;
/** Alunos: Vitor K. Guttler & Gustavo Basso

1) O que é um algoritmo de recursão?

É quando um algoritmo invoca ele mesmo, para diferentes condições, como por exemplo, um "if", que invoca o próprio algoritmo, de forma direta ou indireta.

2) Quando pode ser útil um algoritmo de recursão?
Quando se tem a necessidade de realizar diversas vezes o mesmo processo, com diferentes variáveis.

3) Quais os problemas existentes pelo mal uso da recursão?

Repetição de código, função e mal uso da memória/processamento do código.

4) Faça um programa no blueJ que resolva um problema, utilizando recursão.
*/

import java.util.Scanner;

public class recursao {

    public static void main (String args[]) {

        Scanner input = new Scanner(System.in);
        int var, somatorio, repetiSomatorio;

        System.out.println("Exemplo de Recursão: ");
        System.out.println("Vamos fazer um somatório, digite um número inteiro: ");
        var = input.nextInt();

        System.out.println("Quantos números deseja mostrar nesse somatório?: ");
        repetiSomatorio = input.nextInt();

        while (repetiSomatorio > 0) {

            somatorio = recursao(var);
            //System.out.println(somatorio);
            var = var + 1;
            repetiSomatorio = repetiSomatorio - 1;
            System.out.println("Esse é o var: " + var);
        }
    }    

    public static int recursao(int var) {
        if (var < 1) return 1;
        return var + recursao(var -1);
    }
}
