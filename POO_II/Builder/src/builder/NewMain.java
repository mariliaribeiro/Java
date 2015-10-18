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
public class NewMain {

    public static void main(String[] args) {

        GeradorBoleto gerador; /* declaro o gerador de boletos */

        /* Instancio o boleto de um determinado tipo com as informações solicitadas */
        //BoletoBuilder boleto = new BoletoBancoDoBrasil("Juca Loteiro", "Jucelino Cente", 330.0);
        //BoletoBuilder boleto = new BoletoSantander("Felipe Flamarion da Conceição", "Brasfoot Games Ltda.", 15.0);
        BoletoBuilder boleto = new BoletoItau("Maicon Sumista", "Danilo Jista", 165.0);

        /* Instancia gerador com o boleto do tipo de determinado */
        gerador = new GeradorBoleto(boleto);
        /* Cria/Constrói o boleto solicitado */
        gerador.gerarBoleto();
        /* Recebe o boleto criado */
        Boleto boletoGerado = gerador.getBoleto();

        /* Resultado */
        System.out.println(
                boletoGerado.tituloDocumento + "\n"
                + "Nome Pagador: " + boletoGerado.pagador
                + "\nNome Sacador: " + boletoGerado.sacador
                + "\nData de Vencimento: " + boletoGerado.dataVencimento
                + "\nTarifa do boleto: R$ " + boletoGerado.tarifa
                + "\nValor Total: R$ " + boletoGerado.valorTotal
        );

    }

}
