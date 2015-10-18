package decorator;



public class Morango extends CondimentDecorator{
	Bebidas bebida;
	
	public Morango(Bebidas bebida){
		this.bebida=bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", morango";
	}
	
	@Override
	public double preco() {
		return 1.50 + bebida.preco();
	}
}
