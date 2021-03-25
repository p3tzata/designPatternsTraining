package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactoryImpl {
	
	
     Map<Integer,SquareImpl> map = new HashMap<>();
	
     
     
     SquareImpl getSquare(Integer color) {
    
    	 SquareImpl squareImpl = map.get(color);
    	 if (squareImpl==null) {
    		 squareImpl=new SquareImpl(color);
    		 map.put(color, squareImpl);
    	 }
    	 
    	 return squareImpl;
    	 
    	 
     }
     
     

}
