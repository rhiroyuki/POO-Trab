package fatec.poo.control;

import fatec.poo.model.Fiscal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoFiscal {

    private Connection conn;

    public DaoFiscal(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Fiscal fiscal) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbFiscal(codigo_fiscal, local_fiscal, cpf_fiscal, nome_fiscal, endereco_fiscal, telefone_fiscal, email_fiscal) VALUES(?,?,?,?,?,?,?)");
            ps.setString(1, fiscal.getCodigo());
            ps.setString(2, fiscal.getLocal());
            ps.setString(3, fiscal.getCpf());
            ps.setString(4, fiscal.getNome());
            ps.setString(5, fiscal.getEndereco());
            ps.setString(6, fiscal.getTelefone());
            ps.setString(7, fiscal.getEmail());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Fiscal fiscal) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("UPDATE tbfiscal SET local_fiscal = ?, cpf_fiscal = ?, nome_fiscal = ?, endereco_fiscal = ?, telefone_fiscal = ?, email_fiscal = ? WHERE codigo_fiscal = ?");
            ps.setString(1, fiscal.getLocal());
            ps.setString(2, fiscal.getCpf());
            ps.setString(3, fiscal.getNome());
            ps.setString(4, fiscal.getEndereco());
            ps.setString(5, fiscal.getTelefone());
            ps.setString(6, fiscal.getEmail());
            ps.setString(7, fiscal.getCodigo());

            ps.execute();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public Fiscal consultar(String codigo) {
        Fiscal f = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbFiscal WHERE codigo_fiscal = ?");

            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                f = new Fiscal(codigo, rs.getString("cpf_fiscal"), rs.getString("nome_fiscal"), rs.getString("endereco_fiscal"));
                f.setEmail(rs.getString("email_fiscal"));
                f.setLocal(rs.getString("local_fiscal"));
                f.setTelefone(rs.getString("telefone_fiscal"));
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return f;
    }

    public ArrayList<Fiscal> listarFiscal() {
        ArrayList<Fiscal> fiscais = new ArrayList<>();
        Fiscal f = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbFiscal ");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                f = new Fiscal(rs.getString("codigo_fiscal"), rs.getString("cpf_fiscal"), rs.getString("nome_fiscal"), rs.getString("endereco_fiscal"));
                f.setEmail(rs.getString("email_fiscal"));
                f.setLocal(rs.getString("local_fiscal"));
                f.setTelefone(rs.getString("telefone_fiscal"));
                fiscais.add(f);
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return fiscais;
    }
    
    public Fiscal consultarNome(String nome) {
        Fiscal f = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbFiscal WHERE nome_fiscal = ?");

            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                f = new Fiscal(rs.getString("codigo_fiscal"), rs.getString("cpf_fiscal"), nome, rs.getString("endereco_fiscal"));
                f.setEmail(rs.getString("email_fiscal"));
                f.setLocal(rs.getString("local_fiscal"));
                f.setTelefone(rs.getString("telefone_fiscal"));
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return f;
    }

    public void excluir(Fiscal fiscal) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbfiscal WHERE codigo_fiscal = ?");
            ps.setString(1, fiscal.getCodigo());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
