package Exercicio1;

public class Vip extends Ingresso{
	
	private 
	double valor_adicional;
	Ingresso ingresso;
	
	public Vip(double valor, double valor_adicional){
		super(valor);
		this.valor_adicional = valor_adicional;
	}

	public double imprimeValor(){
		return (this.imprimeValor() + this.valor_adicional);
	}
	
}
