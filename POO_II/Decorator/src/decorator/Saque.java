package decorator;



public class Saque extends CondimentDecorator{
	Bebidas bebida;
	
	public Saque(Bebidas bebida){
		this.bebida=bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", saquê";
	}
	
	@Override
	public double preco() {
		return 2.50 + bebida.preco();
	}
}
