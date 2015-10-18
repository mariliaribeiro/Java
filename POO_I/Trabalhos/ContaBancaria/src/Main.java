import java.io.ObjectInputStream.GetField;


public class Main {

	public static void main(String[] args) {
		// Criando objetos para os tipos de conta
		CCorrente conta1 = new CCorrente(1, 1000, "Ana");
        CEspecial conta2 = new CEspecial(2, 2000, "Joao", 5000);
        CPoupanca conta3 = new CPoupanca(3,1000, "Ivo",1000);
        CInvestimento conta4 = new CInvestimento(4, 1000, "Cida", 14, 10);
        CInvestimento conta5 = new CInvestimento(5, 1000, "Eva", 22, 5);

      //Conta Corrente
        conta1.debitar(2000);
        conta1.debitar(500);
        System.out.println("Seu saldo é: " + conta1.getSaldo());
        conta1.creditar(1000);
        System.out.println("Seu saldo é: " + conta1.getSaldo());
        System.out.println("----------------------------------------");
        
        //Conta Especial 
        conta2.debitar(10000);
         conta2.debitar(3000);
         System.out.println("Seu saldo é: " + conta2.getSaldo());
         conta2.creditar(2000);
         System.out.println("Seu saldo é: " + conta2.getSaldo());
         System.out.println("----------------------------------------");
         
       //Conta Poupança 
         conta3.debitar(1500);
          conta3.debitar(500);
          System.out.println("Seu saldo é: " + conta3.getSaldo());
          System.out.println("Seu saldo mínimo é: " + conta3.getSaldoMinimo());
          conta3.creditar(1500);
          System.out.println("Seu saldo é: " + conta3.getSaldo());
          System.out.println("Seu saldo mínimo é: " + conta3.getSaldoMinimo());
          conta3.atualizarSaldo();
          System.out.println("Seu saldo é: " + conta3.getSaldo());
          System.out.println("Seu saldo mínimo é: " + conta3.getSaldoMinimo());
          System.out.println("-------------------------------------");
          
        //Conta Investimento
          conta4.atualizarSaldo();
            System.out.println("Seu saldo é: " + conta4.getSaldo());
            conta5.atualizarSaldo();
            System.out.println("Seu saldo é: " + conta5.getSaldo());
        
	}

}
