import java.util.Scanner;
/** A seguir, implemente uma Lista de Pacientes. Defina as operações necessárias para manipular essa lista. 
 * @author Vitor K Guttler
 * @version 191090-24
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

    public static void menu () { //OK
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

    public static void main (String args[]) { //Verificar variáveis
        String nome, sexo;
        int codigo, idade, tamanho;
        int nPacientes=0; // Controle de Pacientes cadastrados
        int option;

        Scanner input = new Scanner(System.in);
        System.out.println("Endocrinologia TF");
        System.out.println("Defina o tamanho da Lista de Pacientes desejada:");
        tamanho = input.nextInt();

        ListaDePacientes listaPacientes = new ListaDePacientes(tamanho);

        do {
            menu();
            System.out.println("Digite a opção desejada: ");
            option = input.nextInt();
            switch (option) {
                case 1: // método que consulta um paciente por nome;
                    System.out.println("Insira o nome do Paciente desejado:");
                    nome = input.next();
                    Paciente nomeAuxiliar = listaPacientes.consultarPorNome(nome);
                    if (nomeAuxiliar == null) {
                        System.out.println("Paciente não encontrado.");
                    } else {
                        System.out.println("Paciente encontrado:\n"+nomeAuxiliar.toString());
                    }
                    break;
                case 2: // método que consulta um paciente por codigo;
                        System.out.println("Insira o código do Paciente desejado: ");
                        codigo = input.nextInt();
                        Paciente auxCodigo = listaPacientes.consultarPorCodigo(codigo);
                        if(auxCodigo!=null) {
                            System.out.println(auxCodigo.toString());
                        } else {
                            System.out.println("conta não encontrada com este número");
                        }
                    break;
                case 3: // método que mostra uma lista de todos os pacientes com idade acima de um valor informado pelo parâmetro;
                        System.out.println("Insira a idade definida, para busca dos Pacientes: ");
                        idade = input.nextInt();
                        Paciente[] listaAuxiliar = listaPacientes.listarPacientesAcimaIdade(idade);
                        System.out.println("Pacientes encontrados com a idade acima de "+idade+":");
                        for ( int i = 0; i < listaPacientes.getProximoIndice();i++) {
                            System.out.print("\n"+listaAuxiliar[i].toString());
                        }
                    break;
                case 4: // método que lista todos os pacientes;
                        listaPacientes.listarTodosPacientes();
                    break;
                case 5: // método que cadastra pacientes na lista.
                // Tanto o nome quanto o sexo devem ser definidos logo que o objeto é instanciado. OK
                        System.out.println("Cadastrando Paciente\nDigite o nome do Paciente:");
                        String nomeAux = input.next();
                        if (nomeAux == null) { // O nome não pode ser nulo. OK
                            System.out.println("Nome inválido!");
                            nomeAux = input.next();
                        }
                        
                        System.out.println("Insira o Sexo do Paciente.\nUtilize (M) ou (F):");
                        sexo = input.next();
                        if (sexo == null) { // O sexo deve ser F ou M.
                            System.out.println("Sexo inválido!\nUtilize (M) ou (F).");
                            sexo = input.next();
                        }
                        nPacientes++;
                        Paciente paciente = new Paciente(nPacientes, nomeAux, sexo, 0.0, 0.00, 0);
                        System.out.println("Defina o Peso do paciente:");
                        
                        paciente.setPeso();
                        paciente.setAltura();
                        paciente.setIdade();



                        if(listaPacientes.cadastraNovoPaciente(paciente)) {
                            System.out.println("Paciente Cadastrado!");
                        } else {
                            System.out.println("Paciente Não Cadastrado!");
                        }
                    break;
                case 6: // método que altera o peso de um determinado paciente, informando o seu código;
                    System.out.println("Insira o código do paciente: ");
                    codigo = input.nextInt();
                    listaPacientes.alterarPeso(codigo);
                    break;
                case 7: // método que altera a altura de um determinado paciente, informando o seu código;
                    System.out.println("Insira o código do paciente: ");
                    codigo = input.nextInt();
                    listaPacientes.alterarAltura(codigo);
                    break;
                case 8: // método que altera o sexo de um determinado paciente, informando seu código;
                    System.out.println("Insira o código do paciente: ");
                    codigo = input.nextInt();
                    listaPacientes.alterarSexo(codigo);
                    break;
                case 9: // método que mostra o IMC de um determinado paciente.
                    System.out.println("Mostrando IMC do paciente: ");
                    System.out.println("Insira o código do paciente: ");
                    codigo = input.nextInt();
                    listaPacientes.mostrarIMC(codigo);
                    break;
                default: System.out.println("Opção Inválida!");
                    break;
            }
        } while (option != 0);
        System.out.println("Encerrando Programa");
    }
}