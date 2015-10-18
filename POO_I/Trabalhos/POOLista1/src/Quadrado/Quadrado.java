package Quadrado;

public class Quadrado {

    private 
    	double lado_quadrado;

    public Quadrado(double tamanho_lado){
        this.lado_quadrado = tamanho_lado;
    }

    public double mudaTamanhoLado(double novo_lado){
        return this.lado_quadrado = novo_lado;
    }

    public double valorLadoQuadrado(){
        return this.lado_quadrado;
    }

    public double calculaAreaQuadrado(double lado){
    	this.lado_quadrado = valorLadoQuadrado();
        return (this.lado_quadrado * this.lado_quadrado);
    }

}
