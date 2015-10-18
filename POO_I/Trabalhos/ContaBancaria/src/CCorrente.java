
public class CCorrente {
	
	private 
	int numero;
	float saldo;
	String cliente;

	public CCorrente(int numero, float saldo, String cliente) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}	
	
	public void creditar(float valor){
		this.saldo += valor;
	}
	
	public void debitar(float valor){
		if (valor <= this.saldo){
			this.saldo -= valor;
		}
		else{
			System.out.print("Saldo insuficiente");
		}		
	}
	
	public float getSaldo(){
		return this.saldo;
	}
}
