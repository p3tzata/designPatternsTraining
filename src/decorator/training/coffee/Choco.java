package decorator.training.coffee;

import java.util.HashMap;

public class Choco extends IngridiantDecoratorBase {

	Double ingridiantCost=0.75;
	
	
	public Choco(Coffee prevCoffee) {
		super(prevCoffee);
		ingridiantCostMap.put(Size.Little, 1.25);
		ingridiantCostMap.put(Size.Medium, 1.35);
		ingridiantCostMap.put(Size.Large, 1.45);
	}

	@Override
	public String getDescription() {
		
		return getPrevCoffee().getDescription() + ", Choco" ;
	}

	
	@Override
	public Double cost() {
		
		return ingridiantCostMap.get(getPrevCoffee().getSize()) + getPrevCoffee().cost();
	}


}
