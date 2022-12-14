package model;

public class AlunoModel {
    private int id;
    private String cpf;
    private String nome;
    private String sobrenome;
    private String email;


    public AlunoModel(){
        super();
    }

    public AlunoModel(int id, String cpf, String nome, String sobrenome, String email){
        super();
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public AlunoModel(int id, String nome, String sobrenome){
        super();
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    //Create Getters
    public int getId(){
        return id;
    }

    public String getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public String getEmail(){
        return email;
    }

    //Create Setters
    public void setId(int id){
        this.id = id;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "AlunoModel{" +
                "id=" + id +
                ", cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
