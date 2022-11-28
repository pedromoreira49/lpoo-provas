package models;

public class AssociadoModel implements AssociadoVipModel{
    private String nome;
    private int qtdCotas;
    private double valorCota;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQtdCotas(int qtdCotas){
        this.qtdCotas = qtdCotas;
    }

    public int getQtdCotas(){
        return qtdCotas;
    }

    public double getValorCota(){
        return valorCota;
    }

    public void setValorCota(){
        this.valorCota = valorCota;
    }

    @Override
    public String toString() {
        return "AssociadoModel{" +
                "nome='" + nome + '\'' +
                ", qtdCotas=" + qtdCotas +
                ", valorCota=" + valorCota +
                '}';
    }

    @Override
    public double lucros(int qtdCotas, double valorCota) {
        return (this.qtdCotas + qtdCotas) * (this.valorCota + valorCota);
    }
}
