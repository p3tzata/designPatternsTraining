package decorator.training.coffee;

public class Main {

	public static void main(String[] args) {
		
		
		Coffee whiteCoffee = new WhiteCoffee();
		whiteCoffee.setSize(Size.Little);
		
		Coffee addMilk = new Milk(whiteCoffee);
		
		Coffee coffee = new Choco(addMilk);
		
		System.out.println(coffee.cost());
		System.out.println(coffee.getDescription());
		

	}

}
