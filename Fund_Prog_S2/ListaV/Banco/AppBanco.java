import java.util.Scanner;
/**
 * Escreva uma descrição da classe AppBanco aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AppBanco
{
    public static void main(String args[]){
        String proprietario, nome;
        double valor;
        int numero, tamanho, opcao=0;
        Conta auxiliar;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o nome da agência:");
        nome = in.nextLine();
        System.out.print("Digite o tamanho da lista de contas:");
        tamanho = in.nextInt();
        Agencia ag = new Agencia(nome, tamanho);       
        
        do{
            menu();
            System.out.println("Digite a opção desejada: ");
            opcao = in.nextInt();
            switch(opcao){
                case 1: System.out.println("Digite o nome do proprietario:");
                        proprietario = in.next();
                        System.out.println("Digite o numero:");
                        numero = in.nextInt();
                        System.out.println("Digite o saldo inicial:");
                        valor = in.nextDouble();
                        Conta c1 = new Conta(numero,valor,proprietario);
                        if(ag.cadastraConta(c1))
                            System.out.println("Conta cadastrada na agência");
                        else
                            System.out.println("Conta não foi cadastrada na agência");
                        break;
                case 2: System.out.println("Digite o numero:");
                        numero = in.nextInt();
                        auxiliar = ag.consultaContaPorNumero(numero);
                        if(auxiliar==null)
                            System.out.println("conta não encontrada com este número");
                        else
                            System.out.println(auxiliar.toString());
                        break;
                case 3: System.out.println("Digite o nome do proprietario:");
                        proprietario = in.next();
                        auxiliar = ag.consultaContaPorNome(proprietario);
                        if(auxiliar==null)
                            System.out.println("conta não encontrada com este número");
                        else
                            System.out.println(auxiliar.toString());
                        break;
                case 4: System.out.println("Digite o valor a ser depositado:");
                        valor = in.nextDouble();
                        System.out.println("Digite o numero da conta:");
                        numero = in.nextInt();
                        if(ag.depositar(numero,valor))
                            System.out.println("Deposito feito");
                        else
                            System.out.println("Deposito não feito");
                        break;
                case 5: System.out.println("Digite o valor a ser sacado:");
                        valor = in.nextDouble();
                        System.out.println("Digite o numero da conta:");
                        numero = in.nextInt();
                        if(ag.sacar(numero,valor))
                            System.out.println("Saque feito");
                        else
                            System.out.println("Saque não feito");
                        break;
                case 6: System.out.println("Digite o valor a ser transferido:");
                        valor = in.nextDouble();
                        System.out.println("Digite o numero da conta de origem:");
                        numero = in.nextInt();
                        System.out.println("Digite o numero da conta de destino:");
                        int numeroOutra = in.nextInt();
                        if(ag.transferir(numero, numeroOutra, valor))
                            System.out.println("Transferência feita");
                        else
                            System.out.println("Transferência não feita");
                        break;
                case 7: System.out.println(ag.toString());
                        break;
                case 8: System.out.println("Digite o valor do saldo a ser consultado");
                        valor = in.nextDouble();
                        Conta[] listaAuxiliar = ag.mostraContasSaldo(valor);
                        System.out.println("As contas da agência que possuem saldo acima de "+ valor+ " são:\n");
                        for(int i = 0;i<ag.getProximoIndice();i++){
                            System.out.println("\n"+listaAuxiliar[i].toString());
                        }
                        break;                        
                default: System.out.println("Opção invalida");
                        break;
            }
        }while(opcao!=9);
        System.out.println("Saindo do programa");                
    }
    
    
    
    
    public static void menu(){
        System.out.println("1 - cadastrar conta: ");
        System.out.println("2 - consultar conta por numero: ");
        System.out.println("3 - consultar conta por nome: ");
        System.out.println("4 - depositar $ numa conta: ");
        System.out.println("5 - sacar $ numa conta: ");
        System.out.println("6 - transferir $ entre contas: ");
        System.out.println("7 - listar contas da agência: ");  
        System.out.println("8 - lista contas por saldo");
        System.out.println("9 - sair");
    }
}
