package adaptador;

import utils.PeruInterface;
import alvo.PatoInterface;

public class PeruAdapter implements PatoInterface{ //implementar o a interface que está sendo adaptada
	PeruInterface peru;

	public PeruAdapter(PeruInterface peru){//referenciar o objeto que estamos adaptando
		this.peru = peru;		
	}
	
	@Override
	public void grasnar() {
		peru.grugrulhar();
	}

	@Override
	public void voar() {
		peru.voar();
	}
}
