import java.util.ArrayList;
import java.util.List;


public class ClienteContas{
	protected List clientes;
		
	public ClienteContas(){
		this.clientes = new ArrayList<Cliente>();
	}
	
	public void addClientes(Cliente[] cliente){
		for (int i = 0; i < cliente.length; i++){
			clientes.add(cliente[i]);
		}
		//this.clientes.add(cliente);
	}
	
	public String getClientes(){		
		for (int i = 0; i < clientes.size(); i++){
			System.out.println(clientes.get(i));
			//clientes.get(i);
		}
		return "";
	}
	
	
	@Override
	public String toString() {
		return getClientes().toString();
	}
	
}



