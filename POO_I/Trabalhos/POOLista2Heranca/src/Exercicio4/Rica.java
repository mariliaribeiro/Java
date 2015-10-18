package Exercicio4;

public class Rica extends Pessoa {
	
	private double dinheiro;
	
	public Rica(String nome, int idade, double dinheiro){
		super(nome, idade);
		this.dinheiro = dinheiro;
	}
	
	public double fazerCompras(double valor){
		return valor;
	}

}
