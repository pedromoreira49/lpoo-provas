package model;

import java.util.ArrayList;
import java.util.List;

public class ProdutoModel {
    private int codigo;
    private String nome;
    private int quantidade;
    private double preco_venda;
    private double preco_compra;

    private List<FornecedorModel> fornecedores = new ArrayList<>();

    public ProdutoModel(){
        super();
    }

    public ProdutoModel(int codigo, String nome, int quantidade, double preco_venda, double preco_compra, List<FornecedorModel> fornecedores){
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco_venda = preco_venda;
        this.preco_compra = preco_compra;
        this.fornecedores = fornecedores;
    }

    public ProdutoModel(int codigo, String nome, int quantidade, double preco_venda, double preco_compra, FornecedorModel fornecedor){
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco_venda = preco_venda;
        this.preco_compra = preco_compra;
        this.fornecedores.add(fornecedor);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoVenda() {
        return preco_venda;
    }

    public void setPrecoVenda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public double getPrecoCompra() {
        return preco_compra;
    }

    public void setPrecoCompra(double preco_compra) {
        this.preco_compra = preco_compra;
    }

    public List<FornecedorModel> getFornecedores(){ return fornecedores; }

    public void setFornecedor(FornecedorModel fornecedor) {this.fornecedores.add(fornecedor); }

    public void setFornecedores(List<FornecedorModel> fornecedores){ this.fornecedores = fornecedores; }

    @Override
    public String toString() {
        return "ProdutoModel{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco de Venda=" + preco_venda +
                ", preco de compra=" + preco_compra +
                ", fornecedores= " + fornecedores +
                '}';
    }
}
