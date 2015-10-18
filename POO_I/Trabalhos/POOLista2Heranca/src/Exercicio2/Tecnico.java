package Exercicio2;

public class Tecnico extends Assistente{
	double bonus_salarial;
	
	public Tecnico(String nome, String endereco, String telefone, String email, String matricula, double bonus_salarial){
		super(nome, endereco, telefone, email, matricula);
		this.bonus_salarial = bonus_salarial;
	}
	
	public double getBonus(){
		return this.bonus_salarial;
	}
	
	public void setBonus(double bonus){
		this.bonus_salarial = bonus;
	}

}
