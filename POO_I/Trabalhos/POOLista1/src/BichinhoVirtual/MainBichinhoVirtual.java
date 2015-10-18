package BichinhoVirtual;

import java.io.ObjectInputStream.GetField;

public class MainBichinhoVirtual {
	
	public static void main(String[] args) {
		
		BichinhoVirtual tamagushi = new BichinhoVirtual("Lola", 3, 9, 17);
		
		System.out.print("Nome: " + tamagushi.getNome() 
				+ "\n" + "Fome: " + tamagushi.getFome()
				+ "\n" + "Saúde: " + tamagushi.getSaude() 
				+ "\n" + "Idade: " + tamagushi.getIdade()
				+ "\n" + "Humor: " + tamagushi.validaHumor());
		
		System.out.print("\n\nAlterando informações do bichinho virtual...." 
				+ "\n" + "Nome: " + tamagushi.alteraNome("Lili")
				+ "\n" + "Fome: " + tamagushi.alteraFome(10)
				+ "\n" + "Saúde: " + tamagushi.alteraSaude(8)
				+ "\n" + "Idade: " + tamagushi.alteraIdade(20)
				+ "\n" + "Humor: " + tamagushi.validaHumor());
	}
}
