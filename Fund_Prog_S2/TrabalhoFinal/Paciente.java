package Fund_Prog_S2.TrabalhoFinal;

import java.util.Scanner;

public class Paciente {
//Implemente a classe Paciente: os objetos dessa classe representam os pacientes de um médico endocrinologista.
//De cada paciente, o médico mantém os seguintes dados: código, nome, sexo, peso, altura e idade. OK.
    private String nome, sexo;
    private int codigo, idade;
    private double altura, peso; 
    
    public Paciente (String nome, String sexo, int codigo, int idade, double altura, double peso) {
        
        this.nome = nome;
        this.sexo = sexo;
        this.codigo = codigo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        
        
        
        
        
        
        
        
    }
    
    public boolean setPacienteNovo () {
        Paciente paciente = new Paciente();
        
        if (nome == null) { // O nome do paciente não pode ser nulo e o sexo deve ser F ou M.
            System.out.println("Nome inválido");
            setNome();
        }
        
        if (sexo == null) {//Tanto o nome quanto o sexo devem ser definidos logo que o objeto é instanciado.
            System.out.println("Sexo não definido");
            setSexo();
        }
        
        
        
        
        //socios[qntSocios++] = socio;
        return true;
    }
    

    
    //um método que calcula o peso ideal do paciente de acordo com o seu sexo.
    //Para homens, usar 72.7 × altura − 58 e para mulheres, 62.1 × altura − 44.7. 
    
    public static double pesoIdeal (String sexo, double altura) {
        if (sexo == M) {
            pesoIdealM = (72.7 * altura) - 58;
        } else if (sexo == F) {
            pesoIdealF = (62.1 * altura) - 44.7;
        } else {System.out.println("Erro em 'pesoIdeal()' ");}
        System.out.println("O peso ideal para o paciente "+getPacienteNome()+" do sexo "+sexo+" é: "+pesoIdeal);
    }
    
    
    public static String getPacienteNome() {// método que consulta um paciente por nome;
        return nome;
    }
    public static int getPacienteCodigo() {// - método que consulta um paciente por codigo;
        return codigo;
    }
    public static int getPacienteIdade() {//mostra uma lista de todos os pacientes com idade acima de x valor pelo parâmetro;
        return idade;
    }
    
    public int setPacienteIdade() {
        this.idade = input.nextInt();
        if (idade  < 0 && idade > 120) {//  e a idade, [0; 120].
            System.out.println("Idade válida excedida!");
        }
    }
    
    
    public listaPaciente [] getPacienteLista() { // - método que lista todos os pacientes;
        (lista < listaPaciente) {}
    }
    
    public static double alteraPacientePeso () { // - método que altera o peso de um determinado paciente, informando o seu código;
        this.peso = input.nextDouble();
        if (peso < 0 && peso > 150) { //O peso deve pertencer ao intervalo (0; 150kg];
            System.out.println("Peso válida excedido!");
        }
        return peso;
    }
    public static double alteraPacienteAltura () { // - método que altera a altura de um determinado paciente, informando o seu código;
        this.altura = input.nextDouble();
        if (altura < 0 && altura > 2.5) { //a altura deve respeitar o intervalo (0; 2,5m]
            System.out.println("Altura válida excedida!");
            this.altura = input.nextDouble();
        }
        return this.altura;
    }
    public static String alteraPacienteSexo () { // - método que altera o sexo de um determinado paciente, informando seu código;
        this.sexo = input.nextLine();
    }
    
    
    
    public static double mostraIMC(double peso, double altura) { //- método que mostra o IMC de um determinado paciente.
        
    }
    
    public static double imc (double peso, double altura) { //Cálculo IMC = peso / altura2;
        double imcCalculado = peso / (altura * 2);
        return imcCalculado;
    }

    public static xxx cadastraPaciente() {
    
    }

    public static void registraPaciente () {
        String nome, sexo;
        int codigo, idade;
        double altura, peso;

        System.out.println("Insira o Nome do paciente: ");
    }
    /** 
    - método que cadastra pacientes na lista. 
        O método deve garantir que nenhum paciente de mesmo nome e codigo sejam adicionados a lista de pacientes.
    */
}
