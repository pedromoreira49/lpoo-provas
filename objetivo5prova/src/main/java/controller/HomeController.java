package controller;

import DAO.PacienteDAO;
import model.PacienteModel;

import java.util.Scanner;

public class HomeController {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int op = 0;

        do{
            System.out.println("------ Você está na Home ------");
            System.out.print("""
                        1. Logar como paciente
                        2. Logar como psicologo
                        3. Registrar paciente
                        4. Registrar psicologo
                        5. Visualizar usuarios registrados
                        0. Sair
                    """);
            op = input.nextInt();
            switch(op){
                case 1:
                    loginPaciente();
                    break;
                case 2:
                    System.out.println("Login de psicologo ainda não implementado");
                    break;
                case 3:
                    registrarPaciente();
                    break;
                case 4:
                    System.out.println("Registro de psicologo ainda não implementado");
                    break;
                case 5:
                    listarPacientes();
                    break;
                default:
                    if(op != 0) System.out.println("Operação inválida.");
            }
        } while(op != 0);
        System.out.println("Bye");
        input.close();
    }

    private static void loginPaciente(){
        String email;
        String senha;
        System.out.print("\nInforme o email:");
        email = input.next();
        System.out.print("\nInforme a senha:");
        senha = input.next();
        PacienteController.main(PacienteDAO.selectForLogin(email, senha));
    }

    private static void registrarPaciente(){
        PacienteModel paciente = new PacienteModel();
        System.out.println("Registrando paciente");
        System.out.print("\nInforme o nome:");
        paciente.setNome(input.next());
        System.out.print("\nInforme o email:");
        paciente.setEmail(input.next());
        System.out.print("\nInforme a senha:");
        paciente.setSenha(input.next());
        paciente.setStatus(true);
        System.out.print("\nInforme o cpf");
        paciente.setCpf(input.next());
        if(PacienteDAO.insertPaciente(paciente)){
            System.out.println("Paciente cadastrado com sucesso!");
        }else{
            System.out.println("Erro ao cadastrar paciente.");
        }
    }

    private static void listarPacientes(){
        System.out.println("Listando pacientes:");
        System.out.println(PacienteDAO.selectPacienteNotPassword());
    }
}
