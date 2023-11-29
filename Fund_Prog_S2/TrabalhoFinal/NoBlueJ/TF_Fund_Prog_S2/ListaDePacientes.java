public class ListaDePacientes {
    private Paciente[] listaPacientes;
    private int proximoIndice;

    public ListaDePacientes(int tamanho) {
        listaPacientes = new Paciente[tamanho];
        proximoIndice = 0;
    }

    public int getProximoIndice(){ return proximoIndice; }

    // Método que cadastra paciente na lista
    public boolean cadastraNovoPaciente (Paciente paciente) {
        if (proximoIndice == 0) {
            listaPacientes[proximoIndice] = paciente;
            proximoIndice++;
            return true;
        }

        for (int i = 0; i < proximoIndice; i++ ) {
            if ( listaPacientes[i].getCodigo() == paciente.getCodigo()) {
                return true;
            }
        }

        listaPacientes[proximoIndice] = paciente;
        proximoIndice++;
        return true;
    }


    // Método que consulta um paciente por nome
    public Paciente consultarPorNome(String nomeAuxiliar) {
        if (proximoIndice == 0) { return null; };
        for (int i = 0; i < proximoIndice; i++) {
            if (listaPacientes[i].getNome().equalsIgnoreCase(nomeAuxiliar)) {
                return listaPacientes[i];
            }
        }
        return null; // Retorna null se não encontrar o paciente com o nome especificado
    }

    // Método que consulta um paciente por código
    public Paciente consultarPorCodigo(int codigo) {
        for (int i = 0; i < proximoIndice; i++) {
            if (listaPacientes[i].getCodigo() == codigo) {
                return listaPacientes[i];
            }
        }
        return null; // Retorna null se não encontrar o paciente com o código especificado
    }

    // Método que mostra uma lista de todos os paciente com idade acima de um valor informado
    public Paciente[] listarPacientesAcimaIdade(int idadeMinima) {
        Paciente[] listaAuxiliar = new Paciente[proximoIndice];
        int indiceAuxiliar = 0;
         for (int i = 0; i < proximoIndice; i++) {
            if (listaPacientes[i].getIdade() >= idadeMinima) {
                listaAuxiliar[indiceAuxiliar] = listaPacientes[i];
                indiceAuxiliar++;
            }
        }
        return listaAuxiliar;
    }








    // Método que lista todos os pacientes
    public void listarTodosPacientes() {
        System.out.println("Todos os Pacientes :");
        for (int i = 0; i < proximoIndice; i++) {
            System.out.println("Código: " + listaPacientes[i].getCodigo() + ", Nome: " + listaPacientes[i].getNome() + ", Sexo: " + listaPacientes[i].getSexo() + ", Idade: " + listaPacientes[i].getIdade());
        }
    }



    // Método que altera o peso de um determinado paciente, informando o seu código
    public void alterarPeso(int codigoPaciente) {
        Paciente paciente = consultarPorCodigo(codigoPaciente);
        if (paciente != null) {
            paciente.setPeso();
            System.out.println("Peso do paciente alterado com sucesso.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    // Método que altera a altura de um determinado paciente, informando o seu código
    public void alterarAltura(int codigoPaciente) {
        Paciente paciente = consultarPorCodigo(codigoPaciente);
        if (paciente != null) {
            paciente.setAltura();
            System.out.println("Altura do paciente alterada com sucesso.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    // Método que altera o sexo de um determinado paciente, informando seu código
    public void alterarSexo(int codigoPaciente) {
        Paciente paciente = consultarPorCodigo(codigoPaciente);
        if (paciente != null) {
            paciente.setSexo();
            System.out.println("Sexo do paciente alterado com sucesso.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    // Método que mostra o IMC de um determinado paciente
    public void mostrarIMC(int codigoPaciente) {
        Paciente paciente = consultarPorCodigo(codigoPaciente);
        if (paciente != null) {
            double imc = paciente.calcularIMC(paciente.getPeso(), paciente.getAltura());
            System.out.println("IMC do paciente: " + imc);
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    // Método toString
    public String toString() {
        String stringPaciente = "\nPaciente:";
        for (int i = 0; i < proximoIndice; i++) {
            stringPaciente = stringPaciente + listaPacientes[i].toString();
        }
        return stringPaciente;
    };
    
}
