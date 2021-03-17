package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		
		ChainOfResponsibility chainOfResponsibility = new ChainOfResponsibility();
		Logger logger = chainOfResponsibility.doChain();
		
		
		logger.logMessage(Logger.ERROR_LOGGER_LEVEL, "This is wrong");
		logger.logMessage(Logger.INFO_LOGGER_LEVEL, "This is good");

	}

}
