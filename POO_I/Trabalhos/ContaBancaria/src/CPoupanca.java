
public class CPoupanca extends CCorrente{

	private float saldo_minimo;


	public CPoupanca(int numero, float saldo, String cliente, float saldo_minimo) {
		super(numero, saldo, cliente);
		this.saldo_minimo = saldo_minimo;
	}


	public void debitar(float valor){
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
		this.saldo = (float) (this.saldo + (this.saldo_minimo * 0.02));
		this.saldo_minimo = this.saldo;
	}

	public float getSaldoMinimo(){
		return this.saldo_minimo;
	}


}
