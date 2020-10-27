package decorator.training.coffee;



public class WhiteCoffee extends CoffeeBase {

	public WhiteCoffee() {
		super();
	    description="WhiteCOffee";
	}

	@Override
	public Double cost() {
		
		return 1.35d;
	}

	
	
	
}
