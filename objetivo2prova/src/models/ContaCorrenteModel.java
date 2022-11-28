package models;

public class ContaCorrenteModel extends ContaModel implements AssociadoVipModel{

    private int qtdCotas;
    private double valorCota;

    public int getQtdCotas(){
        return qtdCotas;
    }

    public void setQtdCotas(int qtdCotas){
        this.qtdCotas = qtdCotas;
    }

    public double getValorCota(){
        return valorCota;
    }

    public void setValorCota(int qtdCotas){
        this.qtdCotas = qtdCotas;
    }

    @Override
    public double lucros(int qtdCotas, double valorCota) {
        return (this.qtdCotas + qtdCotas) * (this.valorCota + valorCota);
    }

    @Override
    public String toString() {
        return "ContaCorrenteModel{" +
                "qtdCotas=" + qtdCotas +
                ", valorCota=" + valorCota +
                '}';
    }
}
