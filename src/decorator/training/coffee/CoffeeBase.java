package decorator.training.coffee;

public abstract class CoffeeBase implements Coffee {
	
    String description="N/A";
    Size size;
    Double cost;
    

	public CoffeeBase() {
		super();
	}

	public String getDescription() {
		return description;
	}

	
	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	
	

}
