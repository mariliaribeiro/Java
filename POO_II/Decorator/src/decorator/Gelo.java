package decorator;



public class Gelo extends CondimentDecorator{
	Bebidas bebida;
	
	public Gelo(Bebidas bebida){
		this.bebida=bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", gelo";
	}
	
	@Override
	public double preco() {
		return 1.50 + bebida.preco();
	}
}
