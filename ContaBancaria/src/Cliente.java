import java.util.ArrayList;
import java.util.List;

public class Cliente {
	protected 
		String nome;
		String cpf;
		List contas;
		List clientes;
		
		public Cliente(String nome, String cpf){
			this.nome = nome;
			this.cpf = cpf;
			this.contas = new ArrayList<CCorrente>();
			this.clientes = new ArrayList<Cliente>();
		}
		
		public String getCpf() {
			return cpf;
		}
		
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public void addConta(CCorrente conta){
			this.contas.add(conta);
		}
		
		public List getContas(){
			return contas;
		}
		
		@Override
		public String toString() {
			return this.nome + ": " + this.contas;
		}
		
		public void imprime(){
			for (int i = 0; i <= clientes.size(); i++)
				System.out.println(clientes.get(i));	
		}
		

}
