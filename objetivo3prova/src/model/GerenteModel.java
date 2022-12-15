package model;

public class GerenteModel extends FuncionarioModel{
    private String formacao;

    public GerenteModel(){
        super();
    }

    public GerenteModel(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String formacao){
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "GerenteModel{" +
                "formacao='" + formacao + '\'' +
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
