public class Agencia{
    private String nome;
    private Conta[] listaContas;
    private int proximoIndice;
    
    public Agencia(String nome, int tamanho){
        this.nome = nome;
        listaContas = new Conta[tamanho];
        proximoIndice=0;
    }
    
    
    public int getProximoIndice(){ return proximoIndice;
    }
    
    
    public boolean cadastraConta(Conta c1){
        if(proximoIndice==0){
            listaContas[proximoIndice] = c1;
            proximoIndice++;
            return true;            
        }
        
        for(int i= 0;i<proximoIndice;i++){
            if(listaContas[i].getNumero()==c1.getNumero())
                return false;
        }
        
        listaContas[proximoIndice] = c1;
        proximoIndice++;
        return true;  
    }
    
    public Conta consultaContaPorNumero(int numero){
        if(proximoIndice==0) return null;
        for(int i= 0;i<proximoIndice;i++){
            if(listaContas[i].getNumero()==numero)
                return listaContas[i];
        }
        return null;
    }
    
    
    public Conta consultaContaPorNome(String nome){
        if(proximoIndice==0) return null;
        for(int i= 0;i<proximoIndice;i++){
            if(listaContas[i].getProprietario().equalsIgnoreCase(nome))
                return listaContas[i];
        }
        return null;
    }
    
    public boolean depositar(int numero, double valor){
        Conta auxiliar = consultaContaPorNumero(numero);
        if(auxiliar == null)
            return false;
        else
            return auxiliar.depositar(valor);
    }
    
    public boolean sacar(int numero, double valor){
        Conta auxiliar = consultaContaPorNumero(numero);
        if(auxiliar == null)
            return false;
        else
            return auxiliar.sacar(valor);
    }
    
    public boolean transferir(int numeroOrigem, int numeroDestino, double valor){
        Conta origem = consultaContaPorNumero(numeroOrigem);
        Conta destino = consultaContaPorNumero(numeroDestino);
        if(origem!=null && destino!=null){
            origem.sacar(valor);
            destino.depositar(valor);
            return true;
        }            
        else
            return false;
    }
    
    public Conta[] mostraContasSaldo(double valor){
        Conta[] auxiliar = new Conta[proximoIndice];
        int proxInd=0;
        for(int i=0;i<proximoIndice;i++){
            if(listaContas[i].getSaldo()>=valor){
                auxiliar[proxInd] = listaContas[i];
                proxInd++;
            }
        }
        return auxiliar;
    }
    
    public String toString(){
        String saida = "\nNome da Agência: "+ nome;
        for(int i= 0;i<proximoIndice;i++){
            saida = saida + listaContas[i].toString();
        }
        return saida;
    }
}