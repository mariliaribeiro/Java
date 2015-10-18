package Exercicio3;

public class MainEx3 {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Tux", "vira lata");
		Gato gato = new Gato("Suse", "siames");
		
		System.out.println(cachorro.latir() + "\n" +
				         "Caminhar: " + cachorro.caminha("1Km"));
		System.out.println(gato.miar() + "\n" +
				         "Caminhar: " + gato.caminha("10mt"));
		
	}

}
