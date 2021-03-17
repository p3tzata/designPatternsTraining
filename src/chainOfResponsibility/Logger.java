package chainOfResponsibility;

public abstract class Logger {
	
	public final static int INFO_LOGGER_LEVEL=0;
	public final static int DEBUG_LOGGER_LEVEL=1;
	public final static int ERROR_LOGGER_LEVEL=2;

	private int loggerLevel;
	private Logger nextLogger;
	
	public Logger(int loggerLevel) {
		super();
		this.loggerLevel = loggerLevel;
	}
	
	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(int targetLogLevel, String msg) {
		
		if(targetLogLevel==this.loggerLevel) {
			displayMessage(msg);
		} else {
			if (nextLogger!=null) {
				nextLogger.logMessage(targetLogLevel,msg);
			}
		}
		
		
	}
	
   abstract void displayMessage(String message);
	
	
	

}
