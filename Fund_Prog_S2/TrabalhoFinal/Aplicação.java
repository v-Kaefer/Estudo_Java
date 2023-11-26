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
public class Aplicação {

    
    public static void main (String args[]) {
        // Declaração do array, [x][y], x = 6 vars && y = total pacientes
        double [] listaPacientes = new double[2];


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
        
        int option;
        
        switch (option) {
            case 1: 
                System.out.println("Paciente: " + getPacienteNome());
                break;
            case 2: 
                System.out.println("Consulta por código: " + getPacienteCodigo());
                break;
            case 3:
                System.out.println("Pacientes a partir da idade: "+ getPacienteIdade());
                break;
            case 4:
                System.out.println("Todos os Pacientes :" + getPacienteTodos());
                break;
            case 5:
                Clinica.adicionarNovoPaciente();
                break;
            case 6:
                System.out.println("Alterando peso do paciente: "+getPacienteCodigo());
                break;
            case 7:
                System.out.println("Alterando altura do paciente: "+getPacienteCodigo());
                break;
            case 8:
                System.out.println("Alterando sexo do paciente: "+getPacienteCodigo());
                break;
            case 9:
                System.out.println("Mostrando IMC do paciente: "+getPacienteIMC());
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

