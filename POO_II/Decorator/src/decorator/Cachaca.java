package decorator;



public class Cachaca extends CondimentDecorator{
	Bebidas bebida;
	
	public Cachaca(Bebidas bebida){
		this.bebida=bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", cachaça";
	}
	
	@Override
	public double preco() {
		return 1.50 + bebida.preco();
	}
}
