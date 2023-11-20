package Fund_Prog_S2.Funcionários;
import java.util.Scanner;

//nome, valor da hora, carga horária semanal (n pode ultrapassar 44h/semana)
//Defina os atributos da sua classe e os métodos básicos.
//Escreva um método que calcule e retorne o valor do salário do funcionário

//## CADASTROFUNC
public class CadastroFunc {
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    Scanner input = new Scanner(System.in);
    private String nome = input.nextLine();
    private Double horaVal = input.nextDouble();
    private Double cargaH = input.nextDouble();
    private Double soldo;
   
    /** Construtor para objetos da classe CadastroFunc **/
    public cadastroFunc()
    {
        // inicializa variáveis de instância
       
    }
   
    public Double funcCalc() {
        return this.soldo;
    }

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y */
     
    public Double receberHoras (double cargaH,double horaVal)
    {
        // escreva seu código aqui
        return cargaH*horaVal;
    }
}