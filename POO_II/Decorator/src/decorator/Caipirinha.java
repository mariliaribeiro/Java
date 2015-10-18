package decorator;



public class Caipirinha extends Bebidas {
	
	public Caipirinha() {
		descricao = "Caipirinha";
	}
		
	@Override
	public double preco(){
		return 3.00;
	}

}
