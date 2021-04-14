package memento;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Originator originator = new Originator();
	    CareTaker careTaker = new CareTaker();
	    Box box=new Box("State 1");
	    
	    originator.setState(box);
	    
	    box.setLine("State 2");
	    originator.setState(box);
	    
	    careTaker.add(originator.saveStateToMemento());
	    box.setLine("State 3");
	    
	    originator.setState(box);
	    careTaker.add(originator.saveStateToMemento());

	    originator.getStateFromMemento(careTaker.get(0));
	    System.out.println(originator.getState().getLine());
	    originator.getStateFromMemento(careTaker.get(1));
	    System.out.println(originator.getState().getLine());
	    
	   String debugString="";
	}

}
