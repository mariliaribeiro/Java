package BombaCombustivel;


public class MainBombaCombustivel {

	public static void main(String[] args) {

		BombaCombustivel bomba = new BombaCombustivel("GNV", 3.50, 80);
		System.out.print("Você abasteceu " + bomba.abastecerPorValor(21.0) + " litros." );
		System.out.print("Você deverá pagar R$ " + bomba.abastecerPorLitro(10) + "." );
		System.out.print("O novo valor do combustível é R$ " + bomba.alterarValorLitro(2.85) + " por litro." );
		System.out.print("O tipo de combustível é " + bomba.alterarTipoCombustivel("etanol") + "." );
	}

}
