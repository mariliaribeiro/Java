package decorator;



public class Limao extends CondimentDecorator{
	Bebidas bebida;
	
	public Limao(Bebidas bebida){
		this.bebida=bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", limão";
	}
	
	@Override
	public double preco() {
		return 1.30 + bebida.preco();
	}
}
