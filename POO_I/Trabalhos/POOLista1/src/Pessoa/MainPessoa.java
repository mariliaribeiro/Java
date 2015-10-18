package Pessoa;


public class MainPessoa {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Marilia", 20, 50, 1.63);
		System.out.print("Você envelheceu, agora você tem " + pessoa.envelhecer(5) + " anos.");
		System.out.print("Você engordou, agora você tem " + pessoa.engordar(1.5) + " Kg.");
		System.out.print("Você emagreceu, agora você tem " + pessoa.emagrecer(1.5) + " Kg.");
		System.out.print("Você cresceu, agora você tem " + pessoa.crescer() + " metros.");
	}
}
