package decorator;



public class Main {

	public static void main(String[] args) {
		Bebidas caipira = new Caipira();		
		System.out.println(caipira.getDescricao() + " $" + caipira.preco());
		
		Bebidas caipira2 = new Caipira();
		caipira2 = new Saque(caipira2);
		caipira2 = new Abacaxi(caipira2);
		caipira2 = new Kiwi(caipira2);
		caipira2 = new Acucar(caipira2);
		System.out.println(caipira2.getDescricao() + " $" + caipira2.preco());
		
		Bebidas caipira3 = new Caipira();
		caipira3 = new Vodka(caipira3);
		caipira3 = new Morango(caipira3);
		caipira3 = new Adocante(caipira3);
		System.out.println(caipira3.getDescricao() + " $" + caipira3.preco());
		
		Bebidas caipirinha = new Caipirinha();
		System.out.println(caipirinha.getDescricao() + " $" + caipirinha.preco());
	}

}
