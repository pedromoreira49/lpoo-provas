package model;

public class AlunoModel {
    private int id;
    private int cpf;
    private String nome;
    private String sobrenome;
    private String email;


    public AlunoModel(){
        super();
    }

    public AlunoModel(int id, int cpf, String nome, String sobrenome, String email){
        super();
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    //Create Getters
    public int getId(){
        return id;
    }

    public int getCpf(){
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


}
