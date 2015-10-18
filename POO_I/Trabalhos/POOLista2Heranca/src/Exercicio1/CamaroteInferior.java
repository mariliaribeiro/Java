package Exercicio1;

public class CamaroteInferior extends Vip{
	
	private
	String local;
	
	public CamaroteInferior(double valor, double valor_adicional, String local){
		super(valor, valor_adicional);
		this.local = local;
	}

	public String imprimeLocal(){
		return this.local;
	}
	
}
