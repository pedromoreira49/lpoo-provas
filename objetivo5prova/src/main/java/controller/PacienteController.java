package controller;

import java.util.List;
import java.util.Scanner;

import DAO.PacienteDAO;
import model.PacienteModel;

public class PacienteController {
    private static final Scanner input = new Scanner(System.in);

    public static void main(PacienteModel args){
        PacienteModel paciente = args;
        int op = 0;

        do{
            System.out.println("------ Olá, " + paciente.getNome() + "------");
            System.out.print("""
                        1. Visualizar horarios disponiveis
                        2. Agendar horario
                        3. Atualizar conta
                        4. Finalizar conta
                        0. Sair
                    """);
            op = input.nextInt();
            input.nextLine();
            switch (op){
                case 1:
                    System.out.println("Visualizar horarios disponiveis");
                    break;
                case 2:
                    System.out.println("Agendar horario");
                    break;
                case 3:
                    atualizarConta(paciente);
                    break;
                case 4:
                    encerrarConta(paciente);
                    break;
                default:
                    if(op != 0) System.out.println("Operação inválida");
            }
        }while(op != 0);
    }

    private static void atualizarConta(PacienteModel paciente){
        System.out.println("Atualizar informações:");
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("Deseja alterar o nome? 1. Sim 2. Não");
        if(input.nextInt() == 1){
            System.out.println("Informe novo nome:");
            paciente.setNome(input.next());
        }
        System.out.println("Email: " + paciente.getEmail());
        System.out.println("Deseja alterar o Email? 1. Sim 2. Não");
        if(input.nextInt() == 1){
            System.out.println("Informe novo email:");
            paciente.setEmail(input.next());
        }
        System.out.println("Senha: " + paciente.getSenha());
        System.out.println("Deseja alterar a senha? 1. Sim 2. Não");
        if(input.nextInt() == 1){
            System.out.println("Informe nova senha:");
            paciente.setSenha(input.next());
        }
        System.out.println("CPF: " + paciente.getCpf());
        System.out.println("Deseja alterar o cpf? 1. Sim 2. Não");
        if(input.nextInt() == 1){
            System.out.println("Informe novo cpf:");
            paciente.setCpf(input.next());
        }
        System.out.println("Atualizando informações...");
        if(PacienteDAO.updatePaciente(paciente)){
            System.out.println("Paciente atualizado com sucesso.");
        }else{
            System.out.println("Houve um erro ao atualizar informações");
        }
    }

    private static void encerrarConta(PacienteModel paciente){
        int op;
        System.out.println("Deseja mesmo encerrar sua conta? 1. Sim 2.Não");
        op = input.nextInt();
        if(op == 1){
            PacienteDAO.softDeletePaciente(paciente.getId(), false);
            HomeController.main(null);
        }
    }
}
