package decorator;



public class Adocante extends CondimentDecorator{
	Bebidas bebida;
	
	public Adocante(Bebidas bebida){
		this.bebida=bebida;
	}
	
	@Override
	public String getDescricao() {
		return bebida.getDescricao() + ", adocante";
	}
	
	@Override
	public double preco() {
		return 0.50 + bebida.preco();
	}
}
