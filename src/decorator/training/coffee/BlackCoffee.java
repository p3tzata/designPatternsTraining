package decorator.training.coffee;

public class BlackCoffee extends CoffeeBase {

	public BlackCoffee() {
		
		super();
		description="BlackCoffee";
		
	}

	@Override
	public Double cost() {
		
		return 1.63d;
	}

	
	
	
}
