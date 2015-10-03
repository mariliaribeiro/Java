import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
				
		// Clientes		
		Cliente cli1 = new Cliente("Joice", "234.333.345-54");
		Cliente cli2 = new Cliente("João", "345.432.564-67");
		Cliente cli3 = new Cliente("Ivo", "355.422.555-78");
		Cliente cli4 = new Cliente("Ana", "444.455.355-98");
		Cliente cli5 = new Cliente("Carlos", "342.467.598-98");
		
		CCorrente cc1 = new CCorrente(1,1000);
		cli1.addConta(cc1);
		CCorrente cc2 = new CCorrente(2,2500);
		cli2.addConta(cc2);
		CPoupanca cp1 = new CPoupanca(3, 1000, 1000);
		cli2.addConta(cp1);
		CEspecial ce1 = new CEspecial(4, 1500, 3000);
		cli3.addConta(ce1);
		CInvestimento ci1 = new CInvestimento (5, 2000,20, 10);
		cli3.addConta(ci1);
		CInvestimento ci2 = new CInvestimento (6, 5000, 20, 5);
		cli4.addConta(ci2);

		Cliente[] clientes = {cli1, cli2, cli3, cli4, cli5};
		
		ClienteContas clicont = new ClienteContas();
		clicont.addClientes(clientes);
		System.out.println(clicont);

		

	
	}

}
