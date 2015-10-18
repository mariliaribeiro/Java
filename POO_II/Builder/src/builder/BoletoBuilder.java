/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Samsung.com
 */
public abstract class BoletoBuilder {
 
    protected Boleto boleto;
 
    public BoletoBuilder() {
        boleto = new Boleto();
    }
    
    public abstract void buildTituloDocumento();
 
    public abstract void buildPagador();
    
    public abstract void buildSacador();
    
    public abstract void buildDataVencimento();
    
    public abstract void buildTarifa();
    
    public abstract void buildValorTotal();
    
    public Boleto getBoleto() {
        return boleto;
    }
}
