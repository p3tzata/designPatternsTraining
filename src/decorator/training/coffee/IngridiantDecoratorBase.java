package decorator.training.coffee;

import java.util.HashMap;

public abstract class IngridiantDecoratorBase extends CoffeeBase{

	private Coffee prevCoffee;
	HashMap<Size, Double> ingridiantCostMap;
	
	public IngridiantDecoratorBase(Coffee prevCoffee) {
		super();
		this.prevCoffee = prevCoffee;
		ingridiantCostMap = new HashMap<>();
	}

	public Coffee getPrevCoffee() {
		return prevCoffee;
	}
	
	
	public Size getSize() {
		return prevCoffee.getSize();
	}

	
	
}
