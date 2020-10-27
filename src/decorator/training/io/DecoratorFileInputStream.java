package decorator.training.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DecoratorFileInputStream extends FileInputStream {

	public DecoratorFileInputStream(String fileName) throws FileNotFoundException {
		super(fileName);
		
		
	}

	@Override
	public int read() throws IOException {
		
		return Character.toLowerCase(super.read());
	}

	
	
	
	

}
