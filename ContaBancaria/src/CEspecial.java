
public class CEspecial extends CCorrente{

	private double limite;
	
	
	public CEspecial(int numero, double saldo, double limite) {
		super(numero, saldo);
		this.limite = limite;
	}
	
	//@Override
	public void debitar(double valor){
		if (valor <= (this.saldo  + this.limite)){
			this.saldo -= valor;
		}
		else{
			System.out.print("Saldo insuficiente");
		}
	}
	
	
	public String toString() {
		return "Conta: " + this.numero + " Saldo: R$" + this.saldo /*+ " " + " Limite: R$" + this.limite*/;
	}
}
