package fatec.poo.control;

import fatec.poo.model.Concurso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoConcurso {
    private Connection conn;

    public DaoConcurso(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Concurso concurso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO TBCONCURSO(SIGLA_CONCURSO, DESCRICAO_CONCURSO, DATAREALIZACAO_CONCURSO, TAXAINSCRICAO_CONCURSO) VALUES(?, ?, ?, ?)");
            ps.setString(1, concurso.getSigla());
            ps.setString(2, concurso.getDescricao());
            ps.setString(3, concurso.getDataRealizacao());
            ps.setDouble(4, concurso.getTaxaInscricao());
            
            ps.execute();
        }catch (SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public void alterar(Concurso concurso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE TBCONCURSO set DESCRICAO_CONCURSO = ?, DATAREALIZACAO_CONCURSO = ?, TAXAINSCRICAO_CONCURSO = ? WHERE SIGLA_CONCURSO = ?");
            
            ps.setString(1, concurso.getDescricao());
            ps.setString(2, concurso.getDataRealizacao());
            ps.setDouble(3, concurso.getTaxaInscricao());
            ps.setString(4, concurso.getSigla());
            
            ps.execute();
        }catch (SQLException ex){
            System.out.println(ex.toString());
        }
    }
    
    public Concurso consultar(String sigla) {
        Concurso c = null;
        
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM TBCONCURSO WHERE SIGLA_CONCURSO = ?");
            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                c = new Concurso(sigla, rs.getString("DESCRICAO_CONCURSO"), rs.getString("DATAREALIZACAO_CONCURSO"));
                c.setTaxaInscricao(Double.parseDouble(rs.getString("TAXAINSCRICAO_CONCURSO")));
            }
        }catch(SQLException ex) {
            System.out.println(ex.toString());
        }
        return c;
    }
    
    public void excluir(Concurso concurso) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM TBCONCURSO WHERE SIGLA_CONCURSO = ?");
            ps.setString(1, concurso.getSigla());
            ps.execute();
        }catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
