package Exercicio1;

public class CamaroteSuperior extends Vip{

	private
	String local;
	double valor_adicional;
	
	public CamaroteSuperior(double valor, double valor_adicional, String local, double adicional_camarote){
		super(valor, valor_adicional);
		this.local = local;
		this.valor_adicional = adicional_camarote;
	}
	
	public double imprimeValor(){
		return (this.imprimeValor() + this.valor_adicional);
	}
}
