package Fund_Prog_S2.TrabalhoFinal;

//Implemente a classe Paciente: os objetos dessa classe representam os pacientes de um médico endocrinologista.

import java.util.Scanner;
public class Paciente {
    Scanner input = new Scanner(System.in);
    private String nome, sexo;
    private int codigo, idade;
    private double altura, peso;
    public int nPacientes;


    // constructor OK
    public Paciente (int codigo, String nome, String sexo, double peso, double altura, int idade) {
        //De cada paciente, o médico mantém os seguintes dados: código, nome, sexo, peso, altura e idade.
        this.nome = setNome(); // não pode ser nulo
        this.sexo = setSexo(); // deve ser F ou M
        this.peso = setPeso(); // intervalo (0; 150kg] => ( p>0 && p<=150 )
        this.altura = setAltura(); // intervalo (0; 2.5m] => ( a>0 && a<=2.5 )
        this.idade = setIdade(); // intervalo (0; 120] => ( i>0 && i<=120 )
        this.codigo = setCodigo();
    }


    public int setCodigo() {
        System.out.println("codigo");
        codigo = input.nextInt();
        return codigo;
    }
    
    public String setNome() { // não pode ser nulo. OK
        System.out.println("nome");
        if (nome == null) {
            System.out.println("Nome inválido!");
            nome = input.nextLine();
        }
        return nome;
    }
    
    public String setSexo() { // deve ser F ou M
        System.out.println("sexo");
        if (sexo == null) {
            System.out.println("Sexo inválido!\nUtilize (M) ou (F).\n");
            sexo = input.nextLine();
        }
        return sexo;
    }
    
    public double setPeso() { // intervalo (0; 150kg] => ( p>0 && p<=150 )
        System.out.println("peso");
        if (peso < 0 && peso >= 151 ) {
            System.out.println("Peson inválido!\nO peso deve ser estar no intervalo de 0kg a 150kg\n");
            peso = input.nextDouble();
        }
        return peso;
    }
    
    public double setAltura() { // intervalo (0; 2.5m] => ( a>0 && a<=2.5 )
        System.out.println("altura");
        if (altura < 0 && altura >= 2.51) {
            System.out.println("Altura inválida!\nA altura deve estar no intervalo de 0cm a 2,50cm");            
            altura = input.nextDouble();
        }
        return altura;
    }
    
    public int setIdade() { // intervalo (0; 120] => ( i>0 && i<=120 )
        System.out.println("idade");
        if (idade < 0 && idade >= 121) {
            System.out.println("Idade inválida!\n A idade deve estar no intervalo de 0 a 120 anos.");
            idade = input.nextInt();
        }
        return idade;
    }


    //um método que calcula o peso ideal do paciente de acordo com o seu sexo.
    //Para homens, usar 72.7 × altura − 58 e para mulheres, 62.1 × altura − 44.7.

    public static double pesoIdeal (String sexo, double altura) {
        if (sexo == "M") {
            pesoIdealM = (72.7 * altura) - 58;
        } else if (sexo == "F") {
            pesoIdealF = (62.1 * altura) - 44.7;
        } else {System.out.println("Erro em 'pesoIdeal()' ");}
        System.out.println("O peso ideal para o paciente "+getPacienteNome()+" do sexo "+sexo+" é: "+pesoIdeal);
    }
    
    
    public static String getPacienteNome() {// método que consulta um paciente por nome;
        return nome;
    }
    public int getPacienteCodigo() {// - método que consulta um paciente por codigo;
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
    
    
    
    public static double getIMC(double peso, double altura) { //- método que mostra o IMC de um determinado paciente.
        
    }
    
    public static double imc (double peso, double altura) { //Cálculo IMC = peso / altura2;
        double imcCalculado = peso / (altura * 2);
        return imcCalculado;
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
