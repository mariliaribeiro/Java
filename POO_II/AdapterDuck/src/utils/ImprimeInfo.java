package utils;

import adaptado.Peru;
import alvo.PatoInterface;

public class ImprimeInfo {	
	public ImprimeInfo(){
	}
	
	public void imprimirPato(PatoInterface pato){
		pato.grasnar();
		pato.voar();
	}
	
	public void imprimirPeru(Peru peru){
		peru.grugrulhar();
		peru.voar();
	}
}
