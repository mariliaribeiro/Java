package cliente;

import utils.ImprimeInfo;
import utils.Pato;
import adaptado.Peru;
import adaptador.PeruAdapter;
import alvo.PatoInterface;

public class Cliente {

	public static void main(String[] args) {
		ImprimeInfo imprimir = new ImprimeInfo();
		
		Pato pato = new Pato();
		System.out.println("--- Imprimindo um pato utilizando o adaptador ---");
		imprimir.imprimirPato(pato);
		
		Peru peru = new Peru();
		System.out.println("\n\n--- Imprimindo um peru direto no método dele. ---");
		imprimir.imprimirPeru(peru);
		
		PatoInterface patoInterf = new PeruAdapter(peru); //envelopando o peru
		System.out.println("\n\n--- Imprimindo um peru utilizando o adaptador ---");
		imprimir.imprimirPato(patoInterf);
		
		
	}

}
