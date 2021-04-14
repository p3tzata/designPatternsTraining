package memento;

import java.io.Serializable;

public class Box implements Serializable {
	
	private String line;

	public Box(String line) {
		super();
		this.line = line;
	}

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}
	
	
	
}
