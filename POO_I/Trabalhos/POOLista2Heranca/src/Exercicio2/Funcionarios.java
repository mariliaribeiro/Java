package Exercicio2;

public class Funcionarios {
	protected 
		String nome;
		String endereco;
		String telefone;
		String email;
	
	public Funcionarios(String nome, String endereco, String telefone, String email){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco(){
		return this.endereco;
	}
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public String getTelefone(){
		return this.telefone;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	
	public void exibeDados(){
		System.out.print("Nome : " + this.getNome() + "\n" +
						 "Endereço: " + this.getTelefone() +  "\n" +
						 "Telefone: " + this.getTelefone() +  "\n" +
						 "E-mail: " + this.getEmail());
	}

}
