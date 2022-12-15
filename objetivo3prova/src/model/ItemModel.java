package model;

public class ItemModel {
    private int cod_item;
    private double desconto;
    private int quantidade;
    private double total_item;
    private ProdutoModel produto;

    public ItemModel(){
        super();
    }

    public ItemModel(int cod_item, double desconto, int quantidade, ProdutoModel produto){
        this.cod_item = cod_item;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getCod_item() {
        return cod_item;
    }

    public double getDesconto() {
        return desconto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getTotal_item() {
        return total_item;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setCod_item(int cod_item) {
        this.cod_item = cod_item;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setTotal_item() {
        this.total_item = (this.quantidade * this.produto.getPrecoVenda()) - ((this.quantidade * this.produto.getPrecoVenda()) * (this.desconto / 100));
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemModel{" +
                "cod_item=" + cod_item +
                ", desconto=" + desconto +
                ", quantidade=" + quantidade +
                ", total_item=" + total_item +
                ", produto=" + produto +
                '}';
    }
}
