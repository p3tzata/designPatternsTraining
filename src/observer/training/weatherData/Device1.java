package observer.training.weatherData;

public class Device1 implements Observer,Device {

	double temp;
	
	
	
	
	
	public Device1(Subject subject) {
		super();
		subject.addObserver(this);
	}


	public void displayRecentTemp() {
		
		System.out.println("Device1 temp:" +temp);
		
	}


	@Override
	public void update(double temp) {
		this.temp=temp;
		displayRecentTemp();
		
	}
	
	
}
