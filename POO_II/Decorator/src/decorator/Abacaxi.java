package decorator;



public class Abacaxi extends CondimentDecorator{
	Bebidas bebida;
	
	public Abacaxi(Bebidas bebida){
		this.bebida=bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", abacaxi";
	}
	
	@Override
	public double preco() {
		return 0.80 + bebida.preco();
	}
}
