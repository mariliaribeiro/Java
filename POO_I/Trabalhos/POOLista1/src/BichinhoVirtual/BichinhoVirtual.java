package BichinhoVirtual;

public class BichinhoVirtual {
	private
	String nome;
	int fome;
	int saude;
	int idade;

	public BichinhoVirtual(String nome, int fome, int saude, int idade){
		this.nome = nome;
		this.fome = fome;
		this.saude = saude;
		this.idade = idade;
	}

	public String alteraNome(String novo_nome){
		return this.nome = novo_nome;
	}

	public int alteraFome(int nova_fome){
		return this.fome = nova_fome;
	}		

	public int alteraSaude(int nova_saude){
		return this.saude = nova_saude;
	}

	public int alteraIdade(int nova_idade){
		return this.idade = nova_idade;
	}

	public String getNome(){
		return this.nome;
	}

	public int getFome(){
		return this.fome;
	}

	public int getSaude(){
		return this.saude;
	}

	public int getIdade(){
		return this.idade;
	}

	public String validaHumor(){
		int calc_humor = this.saude * this.fome;
		String humor = "";

		// saúde - mal
		if (this.saude <=7){
			if (calc_humor <= 35){
				humor = "bom";
			}else{
				humor = "mal";
			}			
		}else{
			if (calc_humor <= 50){
				humor = "bom";
			}else{
				humor = "mal";
			}		
		}	
		return humor; 			
	} 

	public String validaFome(){
		String fome = "";
		for (int i=0; i <= 10; i++){
			if (this.fome > 0 && this.fome <= 6){
				fome = "poca fome";
			}
			if (this.fome >= 7 && this.fome <= 10){
				fome = "faminto";
			}
			else{
				fome = "sem fome";
			}
		}
		return fome;
	}

	public String validaSaude(){
		String saude = "";
		for (int i=1; i <= 10; i++){
			if (this.saude <= 7){
				saude = "mal";
			}
			else{				
				saude = "boa";
			}
		}
		return saude;
	}
}
