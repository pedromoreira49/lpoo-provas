package controller;

import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MarketController {
    public static void main(String[] args){
        //Instanciando Classe de Fornecedor
        FornecedorModel fornecedorA = new FornecedorModel("111", "111", "Tordilho");

        //Intanciando Classes para produtos
        ProdutoModel produtoA = new ProdutoModel(111, "Arroz 1kg", 30, 3.80, 4.80, fornecedorA);
        ProdutoModel produtoB = new ProdutoModel(111, "Feijão 1kg", 30, 6.80, 8.00, fornecedorA);
        ProdutoModel produtoC = new ProdutoModel(333, "Farinha de trigo 1kg", 30, 4.80, 5.50, fornecedorA);

        //Instanciando Classes de Vendedor
        VendedorModel vendedorA = new VendedorModel(111, "Pedro Moreira", "Rua. Tres Caminhadas, n 2009", "Praia do Laranjal", "96025-182", "Porto Alegre", "RS", "Iemanjá");

        //Instanciando Classes para Itens
        ItemModel itemA = new ItemModel(111, 2.00, 3, produtoA);
        ItemModel itemB = new ItemModel(222, 1.50, 2, produtoB);
        ItemModel itemC = new ItemModel(333, 3.00, 5, produtoC);

        //Setando total dos itens instanciados
        itemA.setTotal_item();
        itemB.setTotal_item();
        itemC.setTotal_item();

        //Printando o estaque antes da vendas
        System.out.println(produtoA.getNome() + ":" + produtoA.getQuantidade());
        System.out.println(produtoB.getNome() + ":" + produtoB.getQuantidade());
        System.out.println(produtoC.getNome() + ":" + produtoC.getQuantidade());

        //Intanciando Pedidos
        PedidoModel pedidoA = new PedidoModel(1, new Date(), Tipo.ATENDIDO, vendedorA, itemA);
        PedidoModel pedidoB = new PedidoModel(2, new Date(), Tipo.ATENDIDO, vendedorA, itemA);

        //Setando valor e estoque no Pedido A
        pedidoA.setItem(itemB);
        pedidoA.setValor();
        pedidoA.atualizaEstoque();

        //Setando valor e estoque no Pedido B
        pedidoB.setItem(itemC);
        pedidoB.setValor();
        pedidoB.atualizaEstoque();

        //Criando coleção de pedidos do tipo List
        List<PedidoModel> pedidos = new ArrayList<>();
        pedidos.add(pedidoA);
        pedidos.add(pedidoB);

        //Printando as vendas realizadas
        System.out.println(pedidos);

        //Printando o estoque pós vendas
        System.out.println(produtoA.getNome() + ":" + produtoA.getQuantidade());
        System.out.println(produtoB.getNome() + ":" + produtoB.getQuantidade());
        System.out.println(produtoC.getNome() + ":" + produtoC.getQuantidade());

        //Instanciando fornecimentos
        FornecimentoModel fornecimentoA = new FornecimentoModel(new Date(), 50, fornecedorA, produtoA);
        FornecimentoModel fornecimentoB = new FornecimentoModel(new Date(), 50, fornecedorA, produtoB);

        //Setando os valores e estoque do Fornecimento A
        fornecimentoA.setValor_total();
        fornecimentoA.atualizaEstoque();

        //Setando os valores e estoque do Fornecimento B
        fornecimentoB.setValor_total();
        fornecimentoB.atualizaEstoque();

        //Criando coleção do tipo List para Fornecimentos
        List<FornecimentoModel> fornecimentos = new ArrayList<>();
        fornecimentos.add(fornecimentoA);
        fornecimentos.add(fornecimentoB);

        //Printando os fornecimentos
        System.out.println(fornecimentos);

        //Printando o valor total dos fornecimentos
        System.out.println(fornecimentos.stream().mapToDouble(fornecimento -> fornecimento.getValor_total()).sum());

        //Printando novo estoque pós fornecimentos
        System.out.println(produtoA.getNome() + ":" + produtoA.getQuantidade());
        System.out.println(produtoB.getNome() + ":" + produtoB.getQuantidade());
        System.out.println(produtoC.getNome() + ":" + produtoC.getQuantidade());

    }
}
