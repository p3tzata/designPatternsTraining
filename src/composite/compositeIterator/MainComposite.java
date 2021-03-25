package composite.compositeIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MainComposite {
	
	
	/*THIS CODE IS NOT WORKING*/
	public static void main(String[] args) {
		
		MultipleItem mainItem = new MultipleItem("main item");
					
		SingleItem single_1 = new SingleItem("single_1");
		mainItem.add(single_1);
		MultipleItem multipleItem2 = new MultipleItem("multi_2");
		SingleItem single_21 = new SingleItem("single_21");
		SingleItem single_22 = new SingleItem("single_22");
		multipleItem2.add(single_21);
		multipleItem2.add(single_22);
			MultipleItem multipleItem23 = new MultipleItem("multi_23");
			SingleItem single_231 = new SingleItem("single_231");
			SingleItem single_232 = new SingleItem("single_232");
		
		
			multipleItem23.add(single_231);
			multipleItem23.add(single_232);
		multipleItem2.add(multipleItem23);

			
		mainItem.add(multipleItem2);
		
		
		SingleItem single_3 = new SingleItem("single_3");
		mainItem.add(single_3);
		
		
		
		SingleItem single_4 = new SingleItem("single_4");
		mainItem.add(single_4);
		
		
		
		/*	
		mainItem = new MultipleItem("main item");
		mainItem.add(new SingleItem("single_1"));
		ItemComponent multiIem2X = new MultipleItem("multi 2") {}.add(new SingleItem("2.1")).add(new SingleItem("2.2"));
		mainItem.add(multiIem2X);
		mainItem.add(new SingleItem("single_3"));
		*/
		
				
		/*	
		
		mainItem = new MultipleItem("main item");
		mainItem.add(new SingleItem("single_1"));
		mainItem.add(new SingleItem("single_2"));
		*/
		
		/* 
		mainItem = new MultipleItem("main item");
		mainItem.add(new SingleItem("single_1"));
		mainItem.add(new MultipleItem("multi_2X").add(new SingleItem("single_21"))
												 .add(new MultipleItem("multi_22X").add(new SingleItem("Single_221")))
												 .add(new SingleItem("single_23"))
					);
		
		
		mainItem.add(new SingleItem("single_3"));
		
		*/
		
		
		
		
		
		Iterator<ItemComponent> mainIterator = mainItem.createIterator();
	
	
		
		
		while (mainIterator.hasNext()) {
			
			ItemComponent itemComponent = mainIterator.next();
			itemComponent.print();
			
			
		}
		
		
		
		
	}
	
	
	
	

}
