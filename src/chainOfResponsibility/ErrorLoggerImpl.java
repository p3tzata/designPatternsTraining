package chainOfResponsibility;

public class ErrorLoggerImpl extends Logger {

	public ErrorLoggerImpl() {
		super(Logger.ERROR_LOGGER_LEVEL);
	}

	@Override
	public void displayMessage(String message) {
		System.out.println("This is error log:"+message );
		
	}

}
