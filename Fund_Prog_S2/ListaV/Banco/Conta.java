public class Conta{
    private int numero;
    private double saldo;
    private String proprietario;
    
    
    public Conta(int numero, double saldo, String nome){
        if(numero>0)
            this.numero = numero;
        else
            this.numero =0;
            
        if(saldo>0)
            this.saldo = saldo;
        else
            this.saldo = 0;
        proprietario = nome;
    }
    
    public void setNumero(int numero){
        if(numero>0)
            this.numero = numero;
    }
    
    public int getNumero(){ return numero;
    }
    
    public double getSaldo(){ return saldo;
    }
    
    public String getProprietario(){ return proprietario;
    }
    
    public boolean sacar(double valor){
        if (saldo>=valor){
            saldo = saldo - valor;
            return true;
        }
        else
            return false;
    }
    
    public boolean depositar(double valor){
        if(valor>0){
            saldo = saldo +valor;
            return true;
        }
        else
            return false;
    }
    
    public boolean transferir(double valor, Conta destino){
        if(saldo>=valor){
            saldo = saldo - valor;
            destino.depositar(valor);
            return true;
        }
        else
            return false;
    }
    
    public String toString(){
        return "\nNúmero da Conta: "+numero + "\nProprietario: " + proprietario+"\nSaldo: "+saldo;
    }
}