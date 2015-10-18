
public class ContadorVisitas {
	
	int acesso;
    private static ContadorVisitas instance = null;

    public static ContadorVisitas getInstance() {
        if (instance == null) {
            instance = new ContadorVisitas();
        }
        return instance;
    }


    public ContadorVisitas() {
		
	}
      
    public void getVisitas(){
    	this.acesso ++;
    	if(this.acesso != 1){
    		System.out.println("Você já visitou esse site " + this.acesso + " vezes! Seu endereço não entrará para o contador de visitas!");
    	}else{
    		System.out.println("Parabéns! Essa é sua primeira visita ao nosso site.");
    	}
    	
    }
	
	

}
