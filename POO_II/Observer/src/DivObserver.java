
public class DivObserver implements Observer{
	
	ConcreteSubject concreteSubject;
	int valor;
	
	public DivObserver(ConcreteSubject concreteSubject){
		this.concreteSubject = concreteSubject;
		concreteSubject.registerObserver(this);
	}

	public void update(int quociente, int resto) {
		this.valor = quociente;
		System.out.println("Quociente (resultado): " + this.valor);		
		
	}

	

}
