package model;

public class PacienteModel extends UsuarioModel{
    public PacienteModel(){
        super();
    }

    public PacienteModel(Long id, String nome, String email, String senha, String cpf, boolean status){
        super(id, nome, email, senha, cpf, status);
    }

    public PacienteModel(String nome, String email, String senha, String cpf, boolean status){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.status = status;
    }

    @Override
    public String toString() {
        return "\nPacienteModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", status=" + status +
                '}';
    }
}
