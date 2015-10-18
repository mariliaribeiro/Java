
public class Main {

	
	public static void main(String[] args) {
		
		SimplePizzaFactory spf = new SimplePizzaFactory();
        PizzaStore ps = new PizzaStore(spf);
        ps.orderPizza("cheese");
        ps.orderPizza("pepperoni");

	}

}
