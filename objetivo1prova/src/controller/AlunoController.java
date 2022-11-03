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

      //Printing instances created
      System.out.println("Printing instances:");
      System.out.println(alunoA);
      System.out.println(alunoB);
      System.out.println(alunoC);
      System.out.println(alunoD);
      System.out.println(alunoE);
      System.out.println(alunoF);
  }
}
