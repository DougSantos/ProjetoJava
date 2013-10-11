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
public class Produtos {
   private String CodigoProduto;
   private String NomeProduto;
   private SetorProdutos sector;

    /**
     * @return the CodigoProduto
     */
    public String getCodigoProduto() {
        return CodigoProduto;
    }

    /**
     * @param CodigoProduto the CodigoProduto to set
     */
    public void setCodigoProduto(String CodigoProduto) {
        this.CodigoProduto = CodigoProduto;
    }

    /**
     * @return the NomeProduto
     */
    public String getNomeProduto() {
        return NomeProduto;
    }

    /**
     * @param NomeProduto the NomeProduto to set
     */
    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }
    
}
