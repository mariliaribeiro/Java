
public class SimpleCarroFactory {

	public Carro createCarro(String modelo){
        Carro carro = null;
        if (modelo.equals("captiva")){
            carro = new Captiva();
        } else if (modelo.equals("celta")){
            carro = new Celta();
    } else if (modelo.equals("classic")){
            carro = new Classic();
    } else if (modelo.equals("cruze")){
            carro = new Cruze();
    }
    return carro;
}
	
}
