/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author vanessa
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArquivoComponent minhaPasta = new ArquivoComposite("Minha Pasta/");
        ArquivoComponent meuArquivo = new ArquivoFolha("meu video.avi");
        ArquivoComponent meuOutroArquivo = new ArquivoFolha("arquivo.txt");
        
        try {
                // Como a interface define operações comuns a todos os arquivo é
                // possível tentar inserir um arquivo em um arquivo
                System.out.println("Tentando adicionar um arquivo em outro arquivo: ");
                meuArquivo.adicionar(meuOutroArquivo);
        } catch (Exception e) {
                // No entanto você deve tratar este tipo de comportamento com
                // exceções ou outros métodos
                System.out.println(e.getMessage());
        }

        try {
                System.out.println();
                System.out.println("Tentando adicionar um arquivo em uma pasta: ");
                minhaPasta.adicionar(meuArquivo);
                minhaPasta.adicionar(meuOutroArquivo);
                minhaPasta.printNomeDoArquivo();
        } catch (Exception e) {
                // Não será executado pois minha pasta é um ArquivoComposite e
                // possui todas as operações de gerenciamento dos arquivos
                // implementadas.
                System.out.println(e.getMessage());
        }

        try {
                // O problema dessa implementação é que o usuário do código precisa
                // sempre verificar se pode realizar as operações, pois não se tem
                // certeza sobre o tipo do objeto utilizado
                System.out.println("\nPesquisando arquivos:");
                minhaPasta.getArquivo(meuArquivo.getNomeDoArquivo())
                                .printNomeDoArquivo();
                System.out.println("\nRemover arquivos");
                minhaPasta.remover(meuArquivo.getNomeDoArquivo());
                minhaPasta.printNomeDoArquivo();
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
    
}
