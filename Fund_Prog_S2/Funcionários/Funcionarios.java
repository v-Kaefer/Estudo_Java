import java.util.Scanner;

//Implemente uma classe Principal, contendo 1 método main, instancie 2 objetos da classe Funcionário.
//Apresente os dados do funcionário que recebe o maior salário.

// ## FUNCIONÁRIOS
public class Funcionarios {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args){
       
        System.out.print("--//--REGISTRO DE FUNCIONÁRIOS--//--");
        System.out.print("Digite o NOME do funcionário: \n");
        System.out.print("Digite o VALOR PAGO POR HORA ao funcionário:\n");
        System.out.print("Digite a CARGA HORÁRIA do funcionário:\n");
           
        public String getNome () {
            return this.nome;
        }
       
        public double getDiagonal ()
        {
            return Math.sqrt(Math.pow(this.base, 2.0) + Math.pow(this.altura, 2.0));
        }
   
        public String toString ()
        {
            return "Retangulo " + this.base + " x " + this.altura;
       
        }
    }
}
//nome, valor da hora, carga horária semanal (n pode ultrapassar 44h/semana)
//Defina os atributos da sua classe e os métodos básicos.
//Escreva um método que calcule e retorne o valor do salário do funcionário