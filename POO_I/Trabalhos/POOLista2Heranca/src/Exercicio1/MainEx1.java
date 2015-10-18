package Exercicio1;

public class MainEx1 {

	public static void main(String[] args) {
		Normal normal = new Normal(100.00);
		CamaroteInferior camaroteInferior = new CamaroteInferior(100.00, 20.00, "Bloco A");
		CamaroteSuperior camaroteSuperior = new CamaroteSuperior(100.00, 50.00, "Bloca B", 20.00);
		
		System.out.print("Ingressos: \n" +
						 "Normal: " + normal.imprimeValor() + '\n' +
						 "Camarote Inferior: " + camaroteInferior.imprimeValor() + '\n' +
						 "Camarote Superior: " + camaroteSuperior.imprimeValor());
		

	}
	
}
