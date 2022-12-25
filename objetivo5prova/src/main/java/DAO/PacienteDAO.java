package DAO;

import model.PacienteModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PacienteDAO extends BaseDAO{
    public static List<PacienteModel> selectPacientes(){
        final String sql = "SELECT * FROM paciente ORDER BY nome";
        try
                (
                        Connection conn = getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                        ResultSet rs = pstmt.executeQuery();
                )
        {
            List<PacienteModel> pacientes = new ArrayList<>();
            while(rs.next()){
                pacientes.add(resultsetToPaciente(rs));
            }
            return pacientes;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static PacienteModel selectPacienteById(Long id){
        final String sql = "SELECT * FROM paciente WHERE iduser = ?";
        try
            (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
            )
        {
            pstmt.setLong(1, id);
            ResultSet rs = pstmt.executeQuery();
            PacienteModel paciente = null;
            if(rs.next()){
                paciente = resultsetToPaciente(rs);
            }
            rs.close();
            return paciente;
        } catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public static List<PacienteModel> selectPacienteByName(String nome){
        final String sql = "SELECT * FROM paciente WHERE nome LIKE ? ORDER BY nome";
        try
            (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
            )
        {
            pstmt.setString(1, nome.toLowerCase() + "%");
            ResultSet rs = pstmt.executeQuery();
            List<PacienteModel> pacientes = new ArrayList<>();
            while(rs.next()){
                pacientes.add(resultsetToPaciente(rs));
            }
            return pacientes;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public static boolean selectForLogin(String email, String senha){
        final String sql = "SELECT * FROM paciente WHERE email = ? AND senha = ? AND status = 1";
        try
            (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
            )
        {
            pstmt.setString(1, email);
            pstmt.setString(2, senha);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                rs.close();
                return true;
            }else{
                rs.close();
                return false;
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public static boolean insertPaciente(PacienteModel paciente){
        final String sql = "INSERT INTO paciente (nome, email, senha, status,cpf) VALUES (?, ?, ?, ?, ?)";
        try(
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
            )
        {
            pstmt.setString(1, paciente.getNome());
            pstmt.setString(2, paciente.getEmail());
            pstmt.setString(3, paciente.getSenha());
            pstmt.setBoolean(4, paciente.getStatus());
            pstmt.setString(5, paciente.getCpf());
            int count = pstmt.executeUpdate();
            return count > 0;
        } catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updatePaciente(PacienteModel paciente){
        final String sql = "UPDATE paciente SET nome = ?, email = ?, senha = ?, cpf = ?, status = ? WHERE iduser = ?";
        try
            (
                    Connection conn = getConnection();
                    PreparedStatement pstmt = conn.prepareStatement(sql);
            )
        {
            pstmt.setString(1, paciente.getNome());
            pstmt.setString(2, paciente.getEmail());
            pstmt.setString(3, paciente.getSenha());
            pstmt.setString(4, paciente.getCpf());
            pstmt.setBoolean(5, paciente.getStatus());
            pstmt.setLong(6, paciente.getId());
            int count = pstmt.executeUpdate();
            return count > 0;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public static boolean softDeletePaciente(long id, boolean status){
        final String sql = "UPDATE paciente SET status = ? WHERE iduser = ?";
        try
            (
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
            )
        {
            pstmt.setBoolean(1, status);
            pstmt.setLong(2, id);
            int count = pstmt.executeUpdate();
            return count > 0;
        } catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    private static PacienteModel resultsetToPaciente(ResultSet rs) throws SQLException {
        PacienteModel paciente = new PacienteModel();
        paciente.setId(rs.getLong("iduser"));
        paciente.setNome(rs.getString("nome"));
        paciente.setEmail(rs.getString("email"));
        paciente.setSenha(rs.getString("senha"));
        paciente.setCpf(rs.getString("cpf"));
        paciente.setStatus(rs.getBoolean("status"));

        return paciente;
    }

    public static void main(String[] args){
        //Listando todos pacientes
        System.out.println("Printando pacientes");
        System.out.println(PacienteDAO.selectPacientes());

        //Criando um paciente
        System.out.println("Criando um paciente");
        PacienteModel paciente = new PacienteModel(2L, "Thalia", "thalia@gmail.com", "123123", "12312312366", false);
        System.out.println(PacienteDAO.insertPaciente(paciente));
        System.out.println("Paciente adicionado com sucesso:" + paciente);

        //Apresentando novo SQL
        System.out.println(PacienteDAO.selectPacientes());

        //Printando paciente pelo ID
        System.out.println("Printando paciente pelo ID");
        System.out.println(PacienteDAO.selectPacienteById(2L));

        //Printando paciente pelo nome
        System.out.println("Printando paciente pelo nome");
        System.out.println(PacienteDAO.selectPacienteByName("t"));

        //Alterando um paciente
        paciente = selectPacienteById(2L);
        paciente.setNome("Thalia");
        paciente.setEmail("santos@gmail.com");
        paciente.setSenha("345345");
        paciente.setCpf("55555555555");
        paciente.setStatus(true);
        System.out.println(PacienteDAO.updatePaciente(paciente));

        //Realizando um soft delete em paciente
        System.out.println("Realizando um soft DELETE em paciente");
        System.out.println(PacienteDAO.softDeletePaciente(2, false));
    }
}
