package Fund_Prog_S2.TrabalhoFinal;


public class ListaDePacientes {
    private Paciente [] paciente;
    private int tamanho;
    private int proximoIndice;


    public ListaDePacientes(int capacidade) {
        this.paciente = new Paciente[capacidade];
        this.tamanho = 0;
    }

    // Método que consulta um paciente por nome
    public Paciente consultarPorNome(String auxiliar) {
        if (proximoIndice == 0) { return null; };
        for (int i = 0; i < tamanho; i++) {
            if (paciente[i].getNome().equalsIgnoreCase(auxiliar)) {
                return paciente[i];
            }
        }
        return null; // Retorna null se não encontrar o paciente com o nome especificado
    }

    // Método que consulta um paciente por código
    public Paciente consultarPorCodigo(int codigo) {
        for (int i = 0; i < tamanho; i++) {
            if (paciente[i].getCodigo() == codigo) {
                return paciente[i];
            }
        }
        return null; // Retorna null se não encontrar o paciente com o código especificado
    }

    // Método que mostra uma lista de todos os paciente com idade acima de um valor informado
    public Paciente listarPacientesAcimaIdade(int idadeMinima) {
         for (int i = 0; i < tamanho; i++) {
            if (paciente[i].getIdade() > idadeMinima) {
                System.out.println(paciente[i]);
                return paciente[i];
            }
        }
        return null;
    }

    // Método que lista todos os pacientes
    public void listarTodosPacientes() {
        System.out.println("Todos os Pacientes :");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Código: " + paciente[i].getCodigo() + ", Nome: " + paciente[i].getNome() + ", Sexo: " + paciente[i].getSexo() + ", Idade: " + paciente[i].getIdade());
        }
    }

    // Método que cadastra paciente na lista
    public void cadastrarPaciente(Paciente novoPaciente) {
        if (consultarPorNome(novoPaciente.getNome()) == null && consultarPorCodigo(novoPaciente.getCodigo()) == null) {
            if (tamanho < paciente.length) {
                paciente[tamanho] = novoPaciente;
                tamanho++;
                System.out.println("Paciente cadastrado com sucesso.");
            } else {
                System.out.println("A lista de paciente está cheia.");
            }
        } else {
            System.out.println("Já existe um paciente com o mesmo nome ou código na lista.");
        }
    }

    // Método que altera o peso de um determinado paciente, informando o seu código
    public void alterarPeso(int codigoPaciente, double novoPeso) {
        Paciente paciente = consultarPorCodigo(codigoPaciente);
        if (paciente != null) {
            paciente.setPeso(novoPeso);
            System.out.println("Peso do paciente alterado com sucesso.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    // Método que altera a altura de um determinado paciente, informando o seu código
    public void alterarAltura(int codigoPaciente, double novaAltura) {
        Paciente paciente = consultarPorCodigo(codigoPaciente);
        if (paciente != null) {
            paciente.setAltura(novaAltura);
            System.out.println("Altura do paciente alterada com sucesso.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    // Método que altera o sexo de um determinado paciente, informando seu código
    public void alterarSexo(int codigoPaciente, String novoSexo) {
        Paciente paciente = consultarPorCodigo(codigoPaciente);
        if (paciente != null) {
            paciente.setSexo(novoSexo);
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
}
