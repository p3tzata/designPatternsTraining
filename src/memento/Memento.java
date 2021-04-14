package memento;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


//This class contain state of object which will be restored.
public class Memento {

	 private Box state;
	
	   public Memento(Box state) throws ClassNotFoundException, IOException{
	      this.state = clone(state);
	   }

	   public Box getState(){
	      return state;
	   }	
	
	   
	  private Box clone(Box state) throws IOException, ClassNotFoundException {
		  
		  ByteArrayOutputStream bos = new ByteArrayOutputStream();
		  ObjectOutputStream oos = new ObjectOutputStream(bos);
		   
		  oos.writeObject(state);        // serialize
		  oos.flush();
		  
		  byte[] bytes = bos.toByteArray();
		  
		// Create a byte array input stream and use it to create an object input stream
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		 
		ObjectInputStream ois = new ObjectInputStream(bis);
		Box clone = (Box) ois.readObject();  
		  
		  return clone;
		  
	  }
	   
	   
}
