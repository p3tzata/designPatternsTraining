package decorator.training.coffee;

import java.util.HashMap;

public class Milk extends IngridiantDecoratorBase {

	
	Double ingridiantCost=0.65;
	
	
	
	
	public Milk(Coffee prevCoffee) {
		super(prevCoffee);
		
		ingridiantCostMap.put(Size.Little, 0.25);
		ingridiantCostMap.put(Size.Medium, 0.35);
		ingridiantCostMap.put(Size.Large, 0.45);
	}

	@Override
	public String getDescription() {
		
		return getPrevCoffee().getDescription() + ", Milk" ;
	}


	@Override
	public Double cost() {
		
		return ingridiantCostMap.get(getPrevCoffee().getSize()) + getPrevCoffee().cost();
	}
	

}
