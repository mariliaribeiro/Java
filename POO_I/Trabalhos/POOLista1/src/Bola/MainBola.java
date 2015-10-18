package Bola;

public class MainBola {

	public static void main(String[] args) {
		/*String cor, material;
		int circunferencia;*/

		Bola bola = new Bola("blue", 10, "couro"/*cor, circunferencia, material*/);
		System.out.print("A cor da bola é: " + bola.mostraCor());
		System.out.println("A nova cor da bola é: " + bola.trocaCor("red"));  
	}

}
