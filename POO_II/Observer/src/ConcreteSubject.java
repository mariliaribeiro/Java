import java.util.ArrayList;

public class ConcreteSubject implements Subject{
	
	private ArrayList observers;
	int dividendo, divisor, quociente, resto;
	
	public ConcreteSubject(){
		observers= new ArrayList();
	}

	public void registerObserver(Observer o) {
		observers.add(o);		
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0){
			observers.remove(i);
		}
	}

	public void notifyObserver(){
		System.out.println("----------\n" + this.dividendo + "/" + this.divisor);
		for(int i = 0; i<observers.size(); i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(quociente, resto);
		}
	}
		
	public int getResto(int dividendo, int divisor) {
		return dividendo % divisor;
	}
	
	public int getQuociente(int dividendo, int divisor) {
		return dividendo / divisor;
	}
	
			
	public void valorChanged(int dividendo, int divisor){
		this.divisor = divisor;
		this.dividendo = dividendo;
		this.quociente = getQuociente(dividendo, divisor);
		this.resto = getResto(dividendo, divisor);
		notifyObserver();
	}
	
}
