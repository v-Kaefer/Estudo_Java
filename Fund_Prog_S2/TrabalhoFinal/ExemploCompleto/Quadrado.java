package Fund_Prog_S2.TrabalhoFinal.ExemploCompleto;

public class Quadrado {
    // Atributos da classe:
    private double lado;
    private String cor;
    
    public Quadrado () { // Contructor (Cria instâncias de quadrado)
        lado = 0;
        cor = "";
    }
    
    public double getLado() { // Métodos "get", não tem parâmetros
        return lado;
    }
    public String getCor() { // Métodos "get", não tem parâmetros
       return cor;
    }
    
    public void setLado(double novoLado){ // Métodos "set", alteram o conteúdo do atributo
        lado = novoLado;
    }
    public void setCor(String novaCor) { // Métodos "set", alteram o conteúdo do atributo
        cor = novaCor;
    }
    
    public double calculaArea() {
        return lado*lado;
    }
    
    public double calculaPerimetro() {
        return lado*4;
    }
    
    
    public String toString() {
        return "Lado: " + getLado() + "\nCor: " + getCor() + "\nÁrea: " + calculaArea();
    }
}

