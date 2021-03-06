import java.util.Date;


public class CInvestimento extends CCorrente implements Investimento{

	private 
		int dia_investimento;
		int periodo;
		
	public CInvestimento(int numero, double saldo, int dia, int periodo) {
		super(numero, saldo);
		this.dia_investimento = dia;
		this.periodo = periodo;
	}
	
	public void atualizarSaldo(){
		Date hoje = new Date();
		int dia = hoje.getDate();
		if (dia == (this.dia_investimento + periodo)){
			this.saldo = (double)(this.saldo * 1.20);
		}
		else{
			System.out.print("Ainda não é dia do investimento");
		}
	}
	
	public void reajustar(double percentual_reajuste) {
		// TODO Auto-generated method stub
		double reajuste = this.saldo * (percentual_reajuste/100);
		System.out.println("Valor do Reajuste : R$" + reajuste);
	}
	
	public String toString() {
		return "Conta: " + this.numero + " Saldo: R$" + this.saldo /*+ " " + "Dia do investimento: " + this.dia_investimento + " Período: " + this.periodo*/;
	}

}
