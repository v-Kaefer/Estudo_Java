package Fund_Prog_S2.TrabalhoFinal;

/** Implemente a classe Paciente:
 os objetos dessa classe representam os pacientes de um médico endocrinologista.

 De cada paciente, o médico mantém os seguintes dados: código, nome, sexo, peso, altura e idade. OK
 O nome do paciente não pode ser nulo e o sexo deve ser F ou M. OK
 Tanto o nome quanto o sexo devem ser definidos logo que o objeto é instanciado. OK
 O peso deve pertencer ao intervalo (0; 150kg]; OK
 A altura deve respeitar o intervalo (0; 2,5m]; OK
 A idade, [0; 120]. OK
  
  Além dos métodos construtor, modificadores, de acesso e toString, implemente:
  Um método que calcula o índice de massa corporal do paciente (IMC),
   onde IMC = peso / altura*2 ;
  Um método que calcula o peso ideal do paciente de acordo com o seu sexo. 
   Para homens, usar 72.7 × altura − 58 e para mulheres, 62.1 × altura − 44.7. 
*/

import java.util.Scanner;

public class Paciente {
    Scanner input = new Scanner(System.in);
    private String nome, sexo;
    private int codigo, idade;
    private double altura;
    private double peso;
    public double imc;
    public int nPacientes;

    ListaDePacientes listaPacientes = new ListaDePacientes(codigo);


    // MÉTODO CONSTRUTOR -- OK
    public Paciente (int codigo, String nome, String sexo, double peso, double altura, int idade) {
        // De cada paciente, o médico mantém os seguintes dados: código, nome, sexo, peso, altura e idade.
        this.codigo = codigo;
        this.nome = nome; // não pode ser nulo
        this.sexo = sexo; // deve ser F ou M
        this.peso = peso; // intervalo (0; 150kg] => ( p>0 && p<=150 )
        this.altura = altura; // intervalo (0; 2.5m] => ( a>0 && a<=2.5 )
        this.idade = idade; // intervalo (0; 120] => ( i>0 && i<=120 )
        
    }

    // MÉTODOS GET (Devolvem parâmetros) -- OK

    public int getCodigo() { return codigo; }

    public String getNome() { return nome; }

    public String getSexo() { return sexo; }

    public double getPeso() { return peso; }

    public double getAltura() { return altura; }

    public int getIdade() { return idade; }

    public double getIMC() { return imc; }


    // MÉTODOS SET (Recebem parâmetros) -- OK

    public int setCodigo(int novoCodigo) { // Botar verificação de duplicidade.
        System.out.println("Insira o Código do Paciente:");
        novoCodigo = input.nextInt();
        codigo = novoCodigo;
        return codigo;
    }

    public double setPeso(double novoPeso) { // intervalo (0; 150kg] => ( p>0 && p<=150 ). OK
        System.out.println("Insira o valor do Novo Peso do Paciente:");
        novoPeso = input.nextDouble();
        if (novoPeso < 0 && novoPeso >= 151 ) {
            System.out.println("Peso inválido!\nO peso deve ser estar no intervalo de 0kg a 150kg\n");
            novoPeso = input.nextDouble();
        }
        peso = novoPeso;
        return peso;
    }
    
    public double setAltura(double novaAltura) { // intervalo (0; 2.5m] => ( a>0 && a<=2.5 ). OK
        System.out.println("Insira o valor da nova altura do paciente: ");
        novaAltura = input.nextDouble();
        if (novaAltura < 0.00 && novaAltura >= 2.51) {
            System.out.println("Altura inválida!\nA altura deve estar no intervalo de 0cm a 2,50cm");            
            novaAltura = input.nextDouble();
        }
        altura = novaAltura;
        return altura;
    }

    public void setSexo(String novoSexo) {
        System.out.println("Insira o sexo do paciente: ");
        novoSexo = input.nextLine();
        if (novoSexo == null) { // O sexo deve ser F ou M.
            System.out.println("Sexo inválido!\nUtilize (M) ou (F).");
            novoSexo = input.nextLine();
        }
        sexo = novoSexo;
    }
    
    public int setIdade(int novaIdade) { // intervalo (0; 120] => ( i>0 && i<=120 ). OK
        System.out.println("Insira a Idade do Paciente: ");
        novaIdade = input.nextInt();
        if (novaIdade < 0 && novaIdade >= 121) {
            System.out.println("Idade inválida!\n A idade deve estar no intervalo de 0 a 120 anos.");
            novaIdade = input.nextInt();
        }
        idade = novaIdade;
        return idade;
    }

    public double calcularIMC(double peso, double altura) { // Método que mostra o IMC de um determinado paciente. OK
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
        return "Paciente { "+"Codigo: "+codigo+", Nome: "+nome+
                ", Sexo: "+sexo+", Peso: "+peso+", Altura: "+altura+
                ", Idade: "+idade;
        };
}