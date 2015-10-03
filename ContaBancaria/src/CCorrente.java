
public class CCorrente {
	
	protected
	int numero;
	double saldo;

	public CCorrente(int numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}	
	
	public void creditar(double valor){
		this.saldo += valor;
	}
	
	public void debitar(double valor){
		if (valor <= this.saldo){
			this.saldo -= valor;
		}
		else{
			System.out.print("Saldo insuficiente");
		}		
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public String toString() {
		return "Conta: " + this.numero + " Saldo: R$" + this.saldo;
	}
}
