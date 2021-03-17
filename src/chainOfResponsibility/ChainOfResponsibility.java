package chainOfResponsibility;

public class ChainOfResponsibility {
	InfoLoggerImpl infoLoggerImpl;
	DebugLoggerImpl debugLoggerImpl;
	ErrorLoggerImpl errorLoggerImpl;
	
	public ChainOfResponsibility() {
		doChain();
	}

	public Logger doChain() {
		 infoLoggerImpl = new InfoLoggerImpl();
		 debugLoggerImpl = new DebugLoggerImpl();
		 errorLoggerImpl = new ErrorLoggerImpl();
		
		infoLoggerImpl.setNextLogger(debugLoggerImpl);
		debugLoggerImpl.setNextLogger(errorLoggerImpl);
		return infoLoggerImpl;
	}
	
	
	
	
	

}
