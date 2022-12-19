package model;

import java.util.ArrayList;
import java.util.List;

public class VendedorModel extends FuncionarioModel{
    private String local;
    private List<PedidoModel> pedidos = new ArrayList<>();

    public VendedorModel(){
        super();
    }

    public VendedorModel(String local) {
        super();
        this.local = local;
    }

    public VendedorModel(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local){
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.local = local;
    }

    public VendedorModel(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local, List<PedidoModel> pedidos){
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.local = local;
        this.pedidos = pedidos;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<PedidoModel> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoModel> pedidos) {
        this.pedidos = pedidos;
    }

    public void setPedido(PedidoModel pedido){
        this.pedidos.add(pedido);
    }

    @Override
    public String toString() {
        return "VendedorModel{" +
                "local='" + local + '\'' +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
