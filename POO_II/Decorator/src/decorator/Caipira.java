package decorator;



public class Caipira extends Bebidas {
	
	public Caipira() {
		descricao = "Caipira";
	}
		
	@Override
	public double preco(){
		return 3.00;
	}

}
