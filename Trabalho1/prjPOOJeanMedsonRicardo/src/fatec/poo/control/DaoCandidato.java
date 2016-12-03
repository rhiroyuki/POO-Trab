package fatec.poo.control;

import fatec.poo.model.Candidato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Medson
 */
public class DaoCandidato {

    private Connection conn;

    public DaoCandidato(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Candidato candidato) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbCandidato(inscricao_candidato, cpf_candidato,nome_candidato,endereco_candidato,telefone_candidato,email_candidato) VALUES(?,?,?,?,?,?)");
            ps.setString(1, candidato.getInscricao());
            ps.setString(2, candidato.getCpf());
            ps.setString(3, candidato.getNome());
            ps.setString(4, candidato.getEndereco());
            ps.setString(5, candidato.getTelefone());
            ps.setString(6, candidato.getEmail());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Candidato candidato) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbCandidato set cpf_candidato = ?, nome_candidato = ?, endereco_candidato = ?, telefone_candidato = ?, email_candidato = ? where inscricao_candidato = ?");

            ps.setString(1, candidato.getCpf());
            ps.setString(2, candidato.getNome());
            ps.setString(3, candidato.getEndereco());
            ps.setString(4, candidato.getTelefone());
            ps.setString(5, candidato.getEmail());
            ps.setString(6, candidato.getInscricao());

            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public Candidato consultar (String inscricao){
        Candidato c = null;
        
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * from tbCandidato where inscricao_candidato = ?");
            ps.setString(1,inscricao);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next() == true) {
                c = new Candidato (inscricao,rs.getString("cpf_candidato"),rs.getString("nome_candidato"),rs.getString("endereco_candidato"));
                c.setEmail(rs.getString("email_candidato"));
                c.setTelefone(rs.getString("telefone_candidato"));
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return c;
    }
    
    public void excluir(Candidato candidato){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbCandidato where inscricao_candidato = ?");
            ps.setString(1, candidato.getInscricao());
            ps.execute();
        }
        catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
