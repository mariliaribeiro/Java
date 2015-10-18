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
public class GeradorBoleto {
    
    protected BoletoBuilder boleto;

    public GeradorBoleto(BoletoBuilder boletoTipo) {
        this.boleto = boletoTipo;
    }
    
    public void gerarBoleto(){
        boleto.buildTituloDocumento();
        boleto.buildPagador();
        boleto.buildSacador();
        boleto.buildDataVencimento();
        boleto.buildTarifa();
        boleto.buildValorTotal();
    }
    
    public Boleto getBoleto(){
        return boleto.getBoleto();
    }
    
}
