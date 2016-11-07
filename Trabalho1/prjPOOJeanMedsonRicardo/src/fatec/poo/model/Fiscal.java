/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fatec.poo.model;

/**
 *
 * @author Jean
 */
public class Fiscal extends Pessoa{
    private String codigo;
    private String local;

    public Fiscal(String cpf, String nome, String endereco) {
        super(cpf, nome, endereco);
    } 

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }
    
}
