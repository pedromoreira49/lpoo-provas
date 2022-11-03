package controller;

import model.AlunoModel;

public class AlunoController {
  public static void main(String[] args){
      //Build instances

      //Instancia padrão
      AlunoModel alunoA = new AlunoModel();
      AlunoModel alunoB = new AlunoModel();

      //Instancia parametrizado
      AlunoModel alunoC = new AlunoModel(3, "12312312366", "Pedro", "Moreira", "pedro@moreira.com");
      AlunoModel alunoD = new AlunoModel(4, "89089089044", "Ricardo", "Moreira", "ricardo@moreira.com");

      //Instancia parametrizado com 2 parametros
      AlunoModel alunoE = new AlunoModel(5, "Rodrigo", "Moreira");
      AlunoModel alunoF = new AlunoModel(6, "Thalia", "Santos");

      //Printando Instancias de Alunos
      System.out.println("Printing instances:");
      System.out.println(alunoA);
      System.out.println(alunoB);
      System.out.println(alunoC);
      System.out.println(alunoD);
      System.out.println(alunoE);
      System.out.println(alunoF);

      //Modificando o estado do aluno A na memoria com setters
      alunoA.setId(1);
      alunoA.setCpf("12341234567");
      alunoA.setNome("Henrique");
      alunoA.setSobrenome("Cunha");
      alunoA.setEmail("henrique@cunha.com");

      //Modificando o estado do aluno B na memoria com setters
      alunoB.setId(2);
      alunoB.setCpf("23412341765");
      alunoB.setNome("Flavio");
      alunoB.setSobrenome("Garcia");
      alunoB.setEmail("flavio@garcia.com");

      //Mostrando o estado do aluno A com getters
      System.out.println("Mostrando dados do aluno A:");
      System.out.println("Id: " + alunoA.getId());
      System.out.println("CPF: " + alunoA.getCpf());
      System.out.println("Nome: " + alunoA.getNome());
      System.out.println("Sobrenome: " + alunoA.getSobrenome());
      System.out.println("Email: " + alunoA.getEmail());

      //Mostrando o estado do aluno B com getters
      System.out.println("Mostrando dados do aluno B:");
      System.out.println("Id: " + alunoB.getId());
      System.out.println("CPF: " + alunoB.getCpf());
      System.out.println("Nome: " + alunoB.getNome());
      System.out.println("Sobrenome: " + alunoB.getSobrenome());
      System.out.println("Email: " + alunoB.getEmail());
  }
}
