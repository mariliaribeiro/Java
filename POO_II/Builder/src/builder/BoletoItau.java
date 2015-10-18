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
public class BoletoItau extends BoletoBuilder{
    
    protected
    String pagador, sacador;
    double valor, tarifa;

    public BoletoItau(String pagador, String sacador, double valor) {
        this.pagador = pagador;
        this.sacador = sacador;
        this.valor = valor;
        boleto = new Boleto();
    }

    @Override
    public void buildTituloDocumento(){
        boleto.tituloDocumento = "Boleto Itaú";
    }
    
    @Override
    public void buildPagador() {
        boleto.pagador = this.pagador;
    }

    @Override
    public void buildSacador() {
        boleto.sacador = this.sacador;
    }

    @Override
    public void buildDataVencimento() {
        boleto.dataVencimento = null;
    }
    
    @Override
    public void buildTarifa() {
        double percentualTarifa = 10;
        this.tarifa = percentualTarifa * (this.valor / 100);
        boleto.tarifa = this.tarifa;
    }

    @Override
    public void buildValorTotal() {
        boleto.valorTotal = this.valor + this.tarifa;
    }
    
}
