package TV;

public class MainTv {
	
	public static void main(String[] args) {
		
		Tv tv = new Tv(5, 15);
		System.out.print("Você mudou para o canal " + tv.informarCanal(8) + ".");
		System.out.print("Você aumentou o volume para " + tv.aumentaVolume(3) + ".");
		System.out.print("Você diminuiu o volume para " + tv.diminuiVolume(6) + ".");
	}

}
