
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleCarroFactory factory = new SimpleCarroFactory();
		LojaCarros lojaCarros = new LojaCarros(factory);
		
		lojaCarros.pedirCarro("cruze");

	}

}
