package decorator;



public class Kiwi extends CondimentDecorator{
	Bebidas bebida;
	
	public Kiwi(Bebidas bebida){
		this.bebida=bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", kiwi";
	}
	
	@Override
	public double preco() {
		return 2.00 + bebida.preco();
	}
}
