public abstract class Personagem{
	
	Arma arma;
	
    public Personagem(){
    	
    }
    
    public void lutar(){
    	System.out.println("Estou lutando!");
    }

    public void armamento(){
    	arma.usarArma();
    }
}
