package observer.training.weatherData;

public class Device2 implements Observer,Device {

	double temp;
	
	
	public void displayRecentTemp() {
		
		System.out.println("Device2 temp:" +temp);
		
	}


	@Override
	public void update(double temp) {
		this.temp=temp;
		displayRecentTemp();
		
	}
	
	
}
