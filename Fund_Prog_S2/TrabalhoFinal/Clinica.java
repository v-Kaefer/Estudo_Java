package Fund_Prog_S2.TrabalhoFinal;

import java.util.Scanner;
public class Clinica {
    private Paciente[] pacientes;
    private int nPacientes;
    private int idade, codigo;
    private String nome, sexo;
    private double altura, peso;

    public Clinica() {
        pacientes = new Paciente[10];
        nPacientes = 0;
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

    public static void main(String[] args) {
        Clinica clinica = new Clinica();

        clinica.adicionarNovoPaciente();
        clinica.adicionarNovoPaciente();
        
    }
}
