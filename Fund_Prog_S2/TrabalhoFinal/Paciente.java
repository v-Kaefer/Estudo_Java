package Fund_Prog_S2.TrabalhoFinal;

//Implemente a classe Paciente: os objetos dessa classe representam os pacientes de um médico endocrinologista.

import java.util.Scanner;
public class Paciente {
    Scanner input = new Scanner(System.in);
    private String nome, sexo;
    private int codigo, idade;
    private double altura, peso;
    public double imc;
    public int nPacientes;


    // MÉTODO CONSTRUTOR -- OK
    public Paciente (int codigo, String nome, String sexo, double peso, double altura, int idade) {
        //De cada paciente, o médico mantém os seguintes dados: código, nome, sexo, peso, altura e idade.
        this.nome = setNome(nome); // não pode ser nulo
        this.sexo = setSexo(sexo); // deve ser F ou M
        this.peso = setPeso(peso); // intervalo (0; 150kg] => ( p>0 && p<=150 )
        this.altura = setAltura(altura); // intervalo (0; 2.5m] => ( a>0 && a<=2.5 )
        this.idade = setIdade(idade); // intervalo (0; 120] => ( i>0 && i<=120 )
        this.codigo = setCodigo(codigo);
    }

    // MÉTODOS SET (Recebem parâmetros) -- OK

    public int setCodigo(int novoCodigo) {
        System.out.println("Insira o Código do Paciente:");
        novoCodigo = input.nextInt();
        codigo = novoCodigo;
        return codigo;
    }
    
    public String setNome(String novoNome) { // não pode ser nulo. OK
        System.out.println("Insira o Nome do Paciente:");
        if (novoNome == null) {
            System.out.println("Nome inválido!");
            novoNome = input.nextLine();
        }
        nome = novoNome;
        return nome;
    }
    
    public String setSexo(String novoSexo) { // deve ser F ou M. OK
        System.out.println("Insira o Sexo do Paciente.\nUtilize (M) ou (F):");
        if (novoSexo == null) {
            System.out.println("Sexo inválido!\nUtilize (M) ou (F).\n");
            novoSexo = input.nextLine();
        }
        sexo = novoSexo;
        return sexo;
    }
    
    public double setPeso(double novoPeso) { // intervalo (0; 150kg] => ( p>0 && p<=150 )
        System.out.println("Insira o Peso do Paciente:");
        if (novoPeso < 0 && novoPeso >= 151 ) {
            System.out.println("Peso inválido!\nO peso deve ser estar no intervalo de 0kg a 150kg\n");
            novoPeso = input.nextDouble();
        }
        peso = novoPeso;
        return peso;
    }
    
    public double setAltura(double novaAltura) { // intervalo (0; 2.5m] => ( a>0 && a<=2.5 )
        System.out.println("Insira a Altura do Paciente:");
        if (novaAltura < 0 && novaAltura >= 2.51) {
            System.out.println("Altura inválida!\nA altura deve estar no intervalo de 0cm a 2,50cm");            
            novaAltura = input.nextDouble();
        }
        altura = novaAltura;
        return altura;
    }
    
    public int setIdade(int novaIdade) { // intervalo (0; 120] => ( i>0 && i<=120 )
        System.out.println("Insira a Idade do Paciente:");
        if (novaIdade < 0 && novaIdade >= 121) {
            System.out.println("Idade inválida!\n A idade deve estar no intervalo de 0 a 120 anos.");
            novaIdade = input.nextInt();
        }
        idade = novaIdade;
        return idade;
    }


    // MÉTODOS GET (Devolvem parâmetros) -- OK

    public int getCodigo() { return codigo; }

    public String getNome() { return nome; }

    public String getSexo() { return sexo; }

    public double getPeso() { return peso; }

    public double getAltura() { return altura; }

    public int getIdade() { return idade; }

    public double getIMC() { return imc; }


    // Método que mostra o IMC de um determinado paciente.
    public double calcularIMC(double peso, double altura) {
        imc = peso / (altura * 2);
        return imc;
    }




    // Método que calcula o peso ideal do paciente de acordo com o seu sexo. - AJUSTAR
    //Para homens, usar 72.7 × altura − 58 e para mulheres, 62.1 × altura − 44.7.
    public double PesoIdeal() {
        if (sexo == "M") {
            return 72.7 * altura - 58;
        } else {
            return 62.1 * altura - 44.7;
        }
        //System.out.println("O peso ideal para o paciente "+getPacienteNome()+" do sexo "+sexo+" é: "+pesoIdeal);
    }


    // Método toString

    public String toString() {
        return "Paciente { "+
                "codigo="+ codigo +
                ", nome= "+ nome +'\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ", idade=" + idade +
                '}';
    }
}



    /*

    public static void registraPaciente () {
        String nome, sexo;
        int codigo, idade;
        double altura, peso;

        System.out.println("Insira o Nome do paciente: ");
    }
    /** 
    - método que cadastra pacientes na lista. 
        O método deve garantir que nenhum paciente de mesmo nome e codigo sejam adicionados a lista de pacientes.
    /
}






    public void adicionarNovoPaciente() {
        if (nPacientes < pacientes.length) {
            pacientes[nPacientes++] = new Paciente(codigo, nome, sexo, peso, altura,  idade);
            System.out.println("Novo paciente adicionado!");
            System.out.println(pacientes[1]);
        } else {
            System.out.println("Limite de pacientes atingido!");
        }
    }
    */
