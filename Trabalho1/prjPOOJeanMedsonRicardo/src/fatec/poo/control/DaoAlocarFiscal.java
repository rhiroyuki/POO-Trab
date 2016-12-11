package fatec.poo.control;

import fatec.poo.model.Concurso;
import fatec.poo.model.Fiscal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Medson
 */
public class DaoAlocarFiscal {
    private Connection conn;
    
    public DaoAlocarFiscal(Connection conn){
        this.conn = conn;
    }
    
    public void adicionar(String codigo, String sigla){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbConcurso_Fiscal(codigo_fiscal, sigla_concurso) VALUES(?,?)");
            ps.setString(1,codigo);
            ps.setString(2,sigla);
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void remover(String codigo, String sigla){
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbConcurso_Fiscal WHERE codigo_fiscal = ? and sigla_concurso = ?");
            ps.setString(1, codigo);
            ps.setString(2, sigla);
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public List<Fiscal> consultar(String sigla){
        Fiscal f = null;
        List<Fiscal> fiscais = new ArrayList<>();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbConcurso_Fiscal WHERE sigla_concurso = ?");

            ps.setString(1, sigla);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                f = new Fiscal(rs.getString("codigo_fiscal"),"","","");
                fiscais.add(f);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return fiscais;
    }    
}
