package decorator;



public class Acucar extends CondimentDecorator{
	Bebidas bebida;
	
	public Acucar(Bebidas bebida){
		this.bebida=bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", açúcar";
	}
	
	@Override
	public double preco() {
		return 0.50 + bebida.preco();
	}
}
