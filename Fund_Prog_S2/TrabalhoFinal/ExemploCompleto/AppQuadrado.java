package Fund_Prog_S2.TrabalhoFinal.ExemploCompleto;

import java.util.Scanner;
public class AppQuadrado {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double lado;
        String cor;

        Quadrado quad1 = new Quadrado();
        
        System.out.println("Lado do quadrado: "+quad1.getLado());
        System.out.println("Digite um novo lado: ");
        lado = input.nextDouble();
        quad1.setLado(lado);
        System.out.println("Agora, o lado do quadrado é: " + quad1.getLado());
        System.out.println("Agora digite uma cor: ");
        cor = input.nextLine();
        cor = input.nextLine();
        quad1.setCor(cor);
        System.out.println("A cor do quadrado é: " + quad1.getCor());
        System.out.println("A área do quadrado é: "+quad1.calculaArea());
        System.out.println("O perímetro do quadrado é: " + quad1.calculaPerimetro());
        
        System.out.println("Faça um novo quadrado: ");

        Quadrado quad2 = new Quadrado();
        System.out.println("Digite um lado, para o novo quadrado: ");
        lado = input.nextDouble();
        quad2.setLado(lado);
        System.out.println("Agora, o lado do 2° quadrado é: ");
        System.out.println("Digite uma cor para o 2° quadrado: ");
        cor = input.nextLine();
        cor = input.nextLine();
        quad2.setCor(cor);
        System.out.println("A cor do novo quadrado é: " + quad2.getCor());
        System.out.println("A área do novo quadrado é: "+quad2.calculaArea());
        System.out.println("O perímetro do novo quadrado é: " + quad2.calculaPerimetro());
        System.out.println("TESTE TOSTRING: "+quad2.toString());
    }
}
