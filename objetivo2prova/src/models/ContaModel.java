package models;

public class ContaModel {
    protected double saldo;

    public double getsaldo(){
        return saldo;
    }

    public void deposita (double valor){
        saldo += valor;
    }

    public void saca (double valor){
        double saldoAtual = this.saldo - valor;
        if(saldoAtual > 0) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void atualiza(double taxa){
        if(taxa > 0){
            this.saldo += this.saldo * (taxa/100);
        }
    }

}
