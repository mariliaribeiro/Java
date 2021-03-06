
public class CPoupanca extends CCorrente implements Investimento{

	private double saldo_minimo;


	public CPoupanca(int numero, double saldo, double saldo_minimo) {
		super(numero, saldo);
		this.saldo_minimo = saldo_minimo;
	}

	//@Override
	public void debitar(double valor){
		if (valor <= this.saldo){
			this.saldo -= valor;
			if (this.saldo <= this.saldo_minimo){
				this.saldo_minimo = this.saldo;
			}
		}
		else{
			System.out.print("Saldo insuficiente");
		}
	}

	public void atualizarSaldo(){
		this.saldo = (double) (this.saldo + (this.saldo_minimo * 0.02));
		this.saldo_minimo = this.saldo;
	}

	public double getSaldoMinimo(){
		return this.saldo_minimo;
	}
	
	public void reajustar(double percentual_reajuste) {
		// TODO Auto-generated method stub
		double reajuste = this.saldo * (percentual_reajuste/100);
		System.out.println("Valor do Reajuste : R$" + reajuste);
	}
	
	public String toString() {
		return "Conta: " + this.numero + " Saldo: R$" + this.saldo /*+ " " + " Saldo mínimo: R$" + this.saldo_minimo*/;
	}
}
