
public class Main {
	/*operações de divisões inteiras e resto de divisão
	 * Cada vez que os valores no sujeito são atualizados, as operações
	 devem ser realizadas e seus resultados atualizados apresentados*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcreteSubject concreteSubject = new ConcreteSubject();
		
		DivObserver divObserver = new DivObserver(concreteSubject);
		ModObserver modObserver = new ModObserver(concreteSubject);
		
		concreteSubject.valorChanged(5,2);
		concreteSubject.valorChanged(25,7);
		concreteSubject.valorChanged(64,4);

		
	}

}
