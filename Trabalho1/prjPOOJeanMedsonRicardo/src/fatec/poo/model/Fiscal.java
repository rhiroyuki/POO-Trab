package fatec.poo.model;

/**
 *
 * @author Jean
 */
public class Fiscal extends Pessoa{
    private String codigo;
    private String local;

    public Fiscal(String codigo, String cpf, String nome, String endereco) {
        super(cpf, nome, endereco);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }
    
}
