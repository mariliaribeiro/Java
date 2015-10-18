
public class LojaCarros {

	SimpleCarroFactory factory;
	
	public LojaCarros(SimpleCarroFactory factory){
		this.factory = factory;		
	}
	
	public void pedirCarro(String modelo){
	    Carro carro;
	    carro = factory.createCarro(modelo);
	    carro.getModelo();
	    carro.adicionaAcessorio();
	    carro.escolheCombustivel();
	    carro.escolheCor();
	    carro.enviaMontagem();

	}
}
