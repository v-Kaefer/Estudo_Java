package Fund_Prog_S2.TrabalhoFinal;

import java.util.Scanner;

public class Clinica {
    private Paciente[] paciente;
    private int nPacientes;
    private int idade, codigo;
    private String nome, sexo;
    private double altura, peso;

    public Clinica() {
        paciente = new Paciente[10];
        nPacientes = 0;
    }

    public void adicionarNovoPaciente() {
        if (nPacientes < paciente.length) {
            paciente[nPacientes++] = new Paciente(codigo, nome, sexo, peso, altura,  idade);
            System.out.println("Novo paciente adicionado!");
            System.out.println(paciente[1]);
        } else {
            System.out.println("Limite de paciente atingido!");
        }
    }

    public static void main(String[] args) {
        Clinica clinica = new Clinica();

        clinica.adicionarNovoPaciente();
        clinica.adicionarNovoPaciente();
        
    }
}
