import java.util.Date;


public class CInvestimento extends CCorrente{

	private 
		int dia_investimento;
		int periodo;
		
	public CInvestimento(int numero, float saldo, String cliente, int dia, int periodo) {
		super(numero, saldo, cliente);
		this.dia_investimento = dia;
		this.periodo = periodo;
	}
	
	public void atualizarSaldo(){
		Date hoje = new Date();
		int dia = hoje.getDate();
		if (dia == (this.dia_investimento + periodo)){
			this.saldo = (float)(this.saldo * 1.20);
		}
		else{
			System.out.print("Ainda não é dia do investimento");
		}
	}

}
