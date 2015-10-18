package Bola;

public class Bola {

    private
        String cor;
        int circunferencia;
        String material;

    public Bola(String cor, int circunferencia, String material){
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    public String trocaCor(String nova_cor){
        return (this.cor = nova_cor);
    }

    public String mostraCor(){
        return this.cor;
    }
}
