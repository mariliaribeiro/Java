
public class CEspecial extends CCorrente{

	private float limite;
	
	
	public CEspecial(int numero, float saldo, String cliente, float limite) {
		super(numero, saldo, cliente);
		this.limite = limite;
	}
	

	public void debitar(float valor){
		if (valor <= (this.saldo  + this.limite)){
			this.saldo -= valor;
		}
		else{
			System.out.print("Saldo insuficiente");
		}
	}
	
}
