
public class ModObserver implements Observer{
	
	ConcreteSubject concreteSubject;
	int valor;
	
	public ModObserver(ConcreteSubject concreteSubject){
		this.concreteSubject = concreteSubject;
		concreteSubject.registerObserver(this);
	}

	public void update(int quociente, int resto) {
		this.valor = resto;
		System.out.println("Resto da divisão: " + this.valor);
		
	}

	

}
