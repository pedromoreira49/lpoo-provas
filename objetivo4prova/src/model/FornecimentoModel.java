package model;

import java.util.Date;

public class FornecimentoModel {
    private Date data;
    private double valor_total;
    private int quantidade;
    private FornecedorModel fornecedor;
    private ProdutoModel produto;

    public FornecimentoModel(){
        super();
    }

    public FornecimentoModel(Date data, int quantidade, FornecedorModel fornecedor, ProdutoModel produto){
        this.data = data;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public Date getData() {
        return data;
    }

    public double getValor_total() {
        return valor_total;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public FornecedorModel getFornecedor() {
        return fornecedor;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setValor_total() {
        this.valor_total = this.quantidade * this.produto.getPrecoCompra();
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setFornecedor(FornecedorModel fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }

    public void atualizaEstoque() {
        produto.setQuantidade(produto.getQuantidade() + this.quantidade);
    }

    @Override
    public String toString() {
        return "FornecimentoModel{" +
                "data=" + data +
                ", valor_total=" + valor_total +
                ", quantidade=" + quantidade +
                ", produto=" + produto +
                '}';
    }
}