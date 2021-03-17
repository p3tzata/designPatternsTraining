package chainOfResponsibility;

public class DebugLoggerImpl extends Logger {

	public DebugLoggerImpl() {
		super(Logger.DEBUG_LOGGER_LEVEL);
	}

	@Override
	public void displayMessage(String message) {
		System.out.println("This is debug log:"+message );
		
	}

}
