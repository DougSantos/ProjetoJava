/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadinho.ClassesBasicas;

/**
 *
 * @author NeGo
 */
public class Cliente {
    
    private String Nome;
    private String Cpf;
    private String RG;
    private Endereco endcli;

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Cpf
     */
    public String getCpf() {
        return Cpf;
    }

    /**
     * @param Cpf the Cpf to set
     */
    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
    }

    /**
     * @return the endcli
     */
    public Endereco getEndcli() {
        return endcli;
    }

    /**
     * @param endcli the endcli to set
     */
    public void setEndcli(Endereco endcli) {
        this.endcli = endcli;
    }
    
    
}
