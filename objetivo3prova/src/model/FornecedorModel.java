package model;

import java.util.ArrayList;
import java.util.List;

public class FornecedorModel {
    private String cnpj;
    private String contato;
    private String nome;
    private List<ProdutoModel> produtos = new ArrayList<>();

    public FornecedorModel(){
        super();
    }

    public FornecedorModel(String cnpj, String contato, String nome){
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
    }

    public FornecedorModel(String cnpj, String contato, String nome, ProdutoModel produto){
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
        this.produtos.add(produto);
    }

    public FornecedorModel(String cnpj, String contato, String nome, List<ProdutoModel> produtos){
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
        this.produtos = produtos;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getContato() {
        return contato;
    }

    public String getNome() {
        return nome;
    }

    public List<ProdutoModel> getProdutos() {
        return produtos;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProdutos(ProdutoModel produto) {
        this.produtos.add(produto);
    }

    public void setProdutos(List<ProdutoModel> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "FornecedorModel{" +
                "cnpj='" + cnpj + '\'' +
                ", contato='" + contato + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
