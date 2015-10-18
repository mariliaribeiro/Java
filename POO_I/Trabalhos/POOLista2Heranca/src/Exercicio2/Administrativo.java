package Exercicio2;

public class Administrativo extends Assistente {

	String turno;
	double adiconal_noturno;

	public Administrativo(String nome, String endereco, String telefone, String email,String matricula, String turno, double adicional_noturno){
		super(nome, endereco, telefone, email, matricula);
		this.turno = turno;
		this.adiconal_noturno = adicional_noturno;		
	}
	
	public String getTurno(){
		return this.turno;
	}

	public void setTurno(String turno){
		this.turno = turno;
	}

	public double getAdicional(){
		return this.adiconal_noturno;
	}

	public void setAdicional(double adicional){
		this.adiconal_noturno = adicional;
	}



}
