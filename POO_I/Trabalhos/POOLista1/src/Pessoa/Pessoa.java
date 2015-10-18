package Pessoa;

public class Pessoa {

	private
		String nome;
		int idade;
		double peso;
		double altura;

	public Pessoa(String nome_pessoa, int idade_pessoa, double peso_pessoa, double altura_pessoa){
		this.nome = nome_pessoa;
		this.idade = idade_pessoa;
		this.peso = peso_pessoa;
		this.altura = altura_pessoa;
	}

	public int envelhecer(int anos){
		return (this.idade + anos);
	}

	public double engordar(double kilogramas){
		return (this.peso + kilogramas);
	}

	public double emagrecer(double kilogramas){
		return (this.peso - kilogramas);
	}

	public double crescer(){
		//A cada ano que a pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm.
		
		for (int i=0; i <= this.idade; i++){
			if (this.idade < 21){
				this.altura += 0.5;
			}
		}
		return this.altura;
	}
	
}
