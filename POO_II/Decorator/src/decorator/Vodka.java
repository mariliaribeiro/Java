package decorator;



public class Vodka extends CondimentDecorator{
	Bebidas bebida;
	
	public Vodka(Bebidas bebida){
		this.bebida=bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", vodka";
	}
	
	@Override
	public double preco() {
		return 3.00 + bebida.preco();
	}
}
