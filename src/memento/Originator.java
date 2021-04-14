package memento;

import java.io.IOException;

public class Originator {

	   private Box state;

	   public void setState(Box state){
	      this.state = state;
	   }

	   public Box getState(){
	      return state;
	   }

	   public Memento saveStateToMemento() throws ClassNotFoundException, IOException{
	      return new Memento(state);
	   }

	   public void getStateFromMemento(Memento memento){
	      state = memento.getState();
	   }
}
