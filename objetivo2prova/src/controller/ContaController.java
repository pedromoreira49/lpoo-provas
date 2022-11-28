package controller;

import models.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ContaController {
    public static void main(String[] args){
        //Instanciado classes das Contas Corrente
        ContaCorrenteModel contaCorrente1 = new ContaCorrenteModel();
        ContaCorrenteModel contaCorrente2 = new ContaCorrenteModel();
        ContaCorrenteModel contaCorrente3 = new ContaCorrenteModel();

        //Instanciado Classes das Contas Poupancas
        ContaPoupancaModel contaPoupanca1 = new ContaPoupancaModel();
        ContaPoupancaModel contaPoupanca2 = new ContaPoupancaModel();
        ContaPoupancaModel contapoupanca3 = new ContaPoupancaModel();

        //Instanciando Classes de Associados
        AssociadoModel associado1 = new AssociadoModel();
        AssociadoModel associado2 = new AssociadoModel();
        AssociadoModel associado3 = new AssociadoModel();

        //Atribuindo valors as classes Instanciadas
        contaCorrente1.deposita(1000.00);
        contaCorrente2.deposita(2000.00);
        contaCorrente3.deposita(3000.00);

        contaPoupanca1.deposita(4000.00);
        contaPoupanca2.deposita(5000.00);
        contapoupanca3.deposita(6000.00);

        associado1.setNome("Joao");
        associado2.setNome("Ricardo");
        associado3.setNome("Thalia");

        //Imprimindo classes
        System.out.println("Printing classes");
        System.out.println(contaCorrente1);
        System.out.println(contaCorrente2);
        System.out.println(contaCorrente3);

        System.out.println(contaPoupanca1);
        System.out.println(contaPoupanca2);
        System.out.println(contapoupanca3);

        System.out.println(associado1);
        System.out.println(associado2);
        System.out.println(associado3);

        List<ContaModel> contas = new ArrayList<>();
        contas.add(contaCorrente1);
        contas.add(contaCorrente2);
        contas.add(contaCorrente3);
        contas.add(contaPoupanca1);
        contas.add(contaPoupanca2);
        contas.add(contapoupanca3);

        List<AssociadoModel> associados = new ArrayList<>();
        associados.add(associado1);
        associados.add(associado2);
        associados.add(associado3);

        List<AssociadoVipModel> associadosVip = new ArrayList<>();
        associadosVip.add(contaCorrente1);
        associadosVip.add(contaCorrente2);
        associadosVip.add(contaCorrente3);
        associadosVip.add(associado1);
        associadosVip.add(associado2);
        associadosVip.add(associado3);

        //Imprimindo lista de Contas e Associandos
        System.out.println("Lista de contas:");
        System.out.println(contas);

        System.out.println("Lista de associados:");
        System.out.println(associados);

        System.out.println("Lista de associados vip:");
        System.out.println(associadosVip);

        //Utilizando movimntos nas contas
        contaCorrente3.deposita(1000.00);
        contaCorrente3.atualiza(5.00);
        contaCorrente3.saca(50.00);

        contaCorrente3.deposita(500.00);
        contaCorrente3.saca(400.00);

        //Atribuindo cotas aos associados vip
        contaCorrente1.setQtdCotas(100);
        contaCorrente2.setQtdCotas(400);
        contaCorrente3.setQtdCotas(600);

        associado1.setQtdCotas(300);
        associado2.setQtdCotas(600);
        associado3.setQtdCotas(600);

        //Imprimindo Lista de associados Vip
        System.out.println("Printing...");
        System.out.println(associadosVip);

        //Imprimindo Lista de associados em ordem decrescente
        associados.sort(Comparator.comparing(AssociadoModel::getQtdCotas).reversed());
        System.out.println(associados);

        //Impprimindo associado com maior quantidade de cotas
        AssociadoModel associadoMax = associados.stream().max(Comparator.comparingInt(AssociadoModel::getQtdCotas)).get();
        System.out.println(associadoMax);

        //Imprimindo contas em ordem descrescente
        contas.sort(Comparator.comparing(ContaModel::getsaldo).reversed());
        System.out.println(contas);

        //Imprimindo associados vips
        associados.forEach(a -> {
            if (a instanceof AssociadoVipModel){
                System.out.println(a);
            }
        });

        //Imprimindo conta com maior saldo
        ContaModel contaMax = contas.stream().max(Comparator.comparingDouble(ContaModel::getsaldo)).get();
        System.out.println(contaMax);

    }


}
