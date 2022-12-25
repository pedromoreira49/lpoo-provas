package model;

public class UsuarioModel {
    protected Long id;
    protected String nome;
    protected String senha;
    protected String email;
    protected String cpf;
    protected Boolean status;

    public UsuarioModel(){
        super();
    }

    public UsuarioModel(Long id, String nome, String senha, String email, String cpf, boolean status){
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.cpf = cpf;
        this.status = status;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getStatus(){
        return status;
    }

    public void setStatus(Boolean status){
        this.status = status;
    }

    @Override
    public String toString() {
        return "UsuarioModel{" +
                "id=" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", status=" + status + '\'' +
                '}';
    }
}
