package Exercicio2;

public class Assistente extends Funcionarios{
	
	private 
	String matricula;
	
	public Assistente(String nome, String endereco, String telefone, String email, String matricula){
		super(nome, endereco, telefone, email);
		this.matricula = matricula;
	}
	
	public String getMatricula(){
		return this.matricula;
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
}
