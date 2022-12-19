package model;

import exception.MyException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PedidoModel {
    private int numero;
    private Date data;
    private double valor;
    private Tipo tipo;
    private VendedorModel vendedor;
    private List<ItemModel> itens = new ArrayList<>();

    public PedidoModel(){
        super();
    }

    public PedidoModel(int numero, Date data, Tipo tipo, VendedorModel vendedor, List<ItemModel> itens){
        super();
        this.numero = numero;
        this.data = data;
        this.tipo = tipo;
        this.vendedor = vendedor;
        this.itens = itens;
    }

    public PedidoModel(int numero, Date data, Tipo tipo, VendedorModel vendedor, ItemModel item){
        super();
        this.numero = numero;
        this.data = data;
        this.tipo = tipo;
        this.vendedor = vendedor;
        this.itens.add(item);
    }

    public int getNumero() {
        return numero;
    }

    public Date getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public VendedorModel getVendedor() {
        return vendedor;
    }

    public List<ItemModel> getItens() {
        return itens;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setValor() {
        this.valor = this.itens.stream().mapToDouble(item -> item.getTotal_item()).sum();
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setVendedor(VendedorModel vendedor) {
        this.vendedor = vendedor;
    }

    public void setItem(ItemModel item){ this.itens.add(item); }
    public void setItens(List<ItemModel> itens) {
        this.itens = itens;
    }

    public void atualizaEstoque() {
        itens.forEach(item -> {
            try{
                if(item.getQuantidade() <= item.getProduto().getQuantidade()){
                    item.getProduto().setQuantidade(item.getProduto().getQuantidade() - item.getQuantidade());
                }else{
                    throw new MyException("Estoque insuficiente. Produto: " + item.getProduto().getNome());
                }
            }catch (MyException exception){
                exception.printStackTrace();
            }
        });
    }

    @Override
    public String toString() {
        return "PedidoModel{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", tipo=" + tipo +
                ", vendedor=" + vendedor +
                ", itens=" + itens +
                '}';
    }
}
