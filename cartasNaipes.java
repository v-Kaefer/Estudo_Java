// 6° Semana - Exercício Avaliativo
import java.util.Scanner;
public class cartasNaipes {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);                
        // Input de 2 cartas
        // 1° Carta
        System.out.println("Insira o valor da 1° carta.\nDe 1 a 5: ");
        int valor1 = input.nextInt();
        if (valor1 < 1 || valor1 >5) {
            System.out.print("Dado inválido!\nEncerrando Programa.");
            System.exit(1);
        }

        // Seleção do Naipe da 1° Carta
        // qualquer coisa
        System.out.println("Insira o naipe da 1° carta. Sendo:\n6 = PAUS, 7 = OUROS, 8 = COPAS & 9 = ESPADAS\n");
        int naipeA = input.nextInt(); 
        String naipeASel ="";
        switch (naipeA) {
            case 6:
                naipeASel = "P";
                break;
            case 7:
                naipeASel = "O";
                break;
            case 8:
                naipeASel = "C";
                break;
            case 9:
                naipeASel = "E";
                break;
            default:
                System.out.print("Dado inválido!\nEncerrando Programa.");
                System.exit(1);
        }
        //2° Carta
        System.out.println("Insira o valor da 2° carta.\nDe 1 a 5: ");
        int valor2 = input.nextInt();
        if (valor2 < 1 || valor2 >5) {
            System.out.print("Dado inválido!\nEncerrando Programa.");
            System.exit(1);
        }
        System.out.println("Insira o naipe da 2° carta. Sendo:\n 6 = PAUS, 7 = OUROS, 8 = COPAS & 9 = ESPADAS\n");
        int naipeB = input.nextInt();
        String naipeBSel = "";
        switch (naipeB) {
            case 6:
                naipeBSel = "P" ;
                break;
            case 7:
                naipeBSel = "O" ;
                break;
            case 8:
                naipeBSel = "C" ;
                break;
            case 9:
                naipeBSel = "E" ;
                break;
            default:
                System.out.print("Dado inválido!\n Encerrando Programa.");
                System.exit(1);
        }
        
        // Display/Print das cartas
        System.out.println("Sendo as cartas "+valor1+naipeASel+" & "+valor2+naipeBSel+".");
        System.out.println("Temos, que:");
        
        // a) Se são do mesmo naipe:
        if (naipeASel == naipeBSel) {
        System.out.print("As cartas são do mesmo naipe ");
        }
        else {
            System.out.print("As cartas NÃO são do mesmo naipe ");
        }
        // b) Se formam dupla:
        if (valor1 == valor2 && naipeASel != naipeBSel) {
            System.out.println("e formam dupla!");
        }
        else if (valor1 == valor2 && naipeASel == naipeBSel) {
            System.out.println("e NÃO formam dupla!");
        }
        else if (valor1 != valor2 && naipeASel == naipeBSel) {
            System.out.println("e NÃO formam dupla!");
        }
        else if (valor1 != valor2 && naipeASel != naipeBSel) {
            System.out.println("e NÃO formam dupla!");
        }
        // c) Se formam sequencia (independente do naipe)
        if (valor1 == 1 && valor2 == 2) {
            System.out.print("As cartas formam uma Sequência Simples ");
        }
        else if (valor1 == 2 && valor2 == 3) {
            System.out.print("As cartas formam uma Sequência Simples ");
        }
        else if (valor1 == 3 && valor2 == 4) {
            System.out.print("As cartas formam uma Sequência Simples ");
        }
        else if (valor1 == 4 && valor2 == 5) {
            System.out.print("As cartas formam uma Sequência Simples ");
        }
        else {
            System.out.print("As cartas NÃO formam uma Sequência Simples ");
        }
        
        
        if (naipeASel == naipeBSel) {
            System.out.println("e, formam uma Sequência Premium!");
        }
        else {
            System.out.println("mas, NÃO formam uma Sequência Premium!");
        }
    }
}