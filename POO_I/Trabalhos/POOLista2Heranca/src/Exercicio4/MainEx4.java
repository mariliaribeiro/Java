package Exercicio4;

public class MainEx4 {

	public static void main(String[] args) {
		Rica rica = new Rica("Fulano", 40, 5000.00);
		Pobre pobre = new Pobre("Siclano",25);
		Miseravel miseravel = new Miseravel("Beltrano", 50);
		
		System.out.println(rica.getNome() + " deve pagar R$ " + rica.fazerCompras(500.00) + " pelas compras.");
		System.out.println(pobre.getNome() + " deve trabalhar " + pobre.trabalhar("8") + " horas por dia.");
		System.out.println(miseravel.getNome() + " recebeu R$ " + miseravel.mendigar(10.00) + " de esmola.");
	}

}
