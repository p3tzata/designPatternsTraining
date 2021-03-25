package flyweight;

public class SquareImpl implements Shape {

	private int color;
	private int demension;
	
	
	
	public SquareImpl(int color) {
		super();
		this.color = color;
		
	}



	public int getColor() {
		return color;
	}



	public int getDemension() {
		return demension;
	}



	public void setDemension(int demension) {
		this.demension = demension;
	}



	@Override
	public void draw() {

		System.out.println("Draw square-> " +"color: " + color+", "+"demension: "+demension  );
	
		
	}

}
