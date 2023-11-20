package Fund_Prog_S2.Recursão;

import java.util.Scanner;
public class recursao {
public static void main (String args[]) {
    Scanner input = new Scanner(System.in);
    int var, resultado;

    System.out.println("Exemplo de Recursão: ");
    System.out.println("Vamos fazer um somatório, digite um número inteiro: ");
    var = input.nextInt();
    resultado = recursao(var);
    System.out.println("Somatório:" + resultado);
}
    public static int recursao(int var) {
        if (var < 1) return 1;
        return var + recursao(var -1);
}
}
