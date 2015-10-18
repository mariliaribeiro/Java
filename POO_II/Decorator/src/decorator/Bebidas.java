package decorator;

public abstract class Bebidas {
	String descricao = "Bebida desconhecida";
	
	public String getDescricao(){
	return descricao;
	}
	
	public abstract double preco();
	

}
