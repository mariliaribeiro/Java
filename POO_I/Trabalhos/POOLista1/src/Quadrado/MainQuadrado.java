package Quadrado;

public class MainQuadrado {
	
	public static void main(String[] args) {
	
		Quadrado quadrado = new Quadrado(5);
		System.out.print("O tamanho do quadrado é: " + quadrado.valorLadoQuadrado());
		System.out.print("Novo lado do quadrado: " + quadrado.mudaTamanhoLado(3));
		System.out.print("A área do quadrado é: " + quadrado.calculaAreaQuadrado(3.5));	
	}

}
