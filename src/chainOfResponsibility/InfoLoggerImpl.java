package chainOfResponsibility;

public class InfoLoggerImpl extends Logger {

	public InfoLoggerImpl() {
		super(Logger.INFO_LOGGER_LEVEL);
	}

	@Override
	public void displayMessage(String message) {
		System.out.println("This is info log:"+message );
		
	}

}
