package Fund_Prog_S2.TrabalhoFinal;

import java.util.Scanner;
/** A seguir, implemente uma Lista de Pacientes. Defina as operações necessárias para manipular essa lista. 

- método que consulta um paciente por nome;
- método que consulta um paciente por codigo;
- método que mostra uma lista de todos os pacientes com idade acima de um valor informado pelo parâmetro;
- método que lista todos os pacientes;
- método que cadastra pacientes na lista. O método deve garantir que nenhum paciente de mesmo nome e codigo sejam adicionados a lista de pacientes.
- método que altera o peso de um determinado paciente, informando o seu código;
- método que altera a altura de um determinado paciente, informando o seu código;
- método que altera o sexo de um determinado paciente, informando seu código;
- método que mostra o IMC de um determinado paciente.


Implemente ainda uma classe Aplicação com um menu de opções (com as operações da lista).
*/
public class AppTF {
    Scanner input = new Scanner(System.in);
    private String nome, sexo;
    private int codigo, idade;
    private double altura, peso;
    private double imc;
    private int nPacientes;

    public void main (String args[]) {
        //ListaPacientes listaPacientes = new ListaPacientes(2);        
        
        int option;

        do {
            menuOptions();
            option = input.nextInt();
            menuSelect(option);
        } while (option != 0);
    }

    public void menuOptions () {
        System.out.println("LISTA DE PACIENTES\n");
        System.out.println("1 - Consultar paciente por nome.");
        System.out.println("2 - Consultar paciente por código.");
        System.out.println("3 - Listar todos os pacientes, a partir da idade informada.");
        System.out.println("4 - Listar todos os pacientes.");
        System.out.println("5 - Cadastrar paciente.");
        System.out.println("6 - Alterar o peso de um paciente, informando seu código.");
        System.out.println("7 - Alterar a altura de um paciente, informando seu código.");
        System.out.println("8 - Alterar o sexo de um paciente, informando seu código.");
        System.out.println("9 - Mostra o IMC de um paciente.");
        System.out.println("0 - Sair");
    }

    public void menuSelect(int option) {
        
        switch (option) {
            case 1: 
                System.out.println("Insira o nome do Paciente desejado:");
                nome = input.nextLine();
                ListaPacientes.consultarPorNome(nome);
                if (paciente != null) {
                    System.out.println("Paciente encontrado: " + paciente);
                } else {
                    System.out.println("Paciente não encontrado.");
                }
                break;
            case 2: 
                System.out.println("Consulta por código: ");
                break;
            case 3:
                System.out.println("Pacientes a partir da idade: ");
                break;
            case 4:
                System.out.println("Todos os Pacientes :");
                break;
            case 5:
                
                break;
            case 6:
                System.out.println("Alterando peso do paciente: ");
                break;
            case 7:
                System.out.println("Alterando altura do paciente: ");
                break;
            case 8:
                System.out.println("Alterando sexo do paciente: ");
                break;
            case 9:
                System.out.println("Mostrando IMC do paciente: ");
                break;
            case 0:
                System.out.println("Saindo");
                System.exit(1);
                break;
                default:
                    System.out.println("Opção Inválida!\n");
                    break;
        }
    }
}