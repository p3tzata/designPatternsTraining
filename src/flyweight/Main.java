package flyweight;

public class Main {

	
	
	
	public static void main(String[] args) {
		ShapeFactoryImpl shapeFactoryImpl = new ShapeFactoryImpl();
		SquareImpl square=null;
		square = shapeFactoryImpl.getSquare(5);
		square.setDemension(9);
		square.draw();
		square = shapeFactoryImpl.getSquare(15);
		square.setDemension(99);
		square.draw();
		square = shapeFactoryImpl.getSquare(5);
		square.setDemension(70);
		square.draw();	
		
	}

}
