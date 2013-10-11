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
public class Funcionario {
    
    private int Matricula;
    private String cpf;
    private String RG;
    private String nome;
    private Endereco endfun;

    /**
     * @return the Matricula
     */
    public int getMatricula() {
        return Matricula;
    }

    /**
     * @param Matricula the Matricula to set
     */
    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endfun
     */
    public Endereco getEndfun() {
        return endfun;
    }

    /**
     * @param endfun the endfun to set
     */
    public void setEndfun(Endereco endfun) {
        this.endfun = endfun;
    }
}
