package observer.training.weatherData;

public class Main {

	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		Observer dev1= new Device1(weatherData);
		Observer dev2= new Device2();
		//weatherData.addObserver(dev1);
		weatherData.addObserver(dev2);
		
		weatherData.setTemp(55);
		weatherData.setTemp(65);

		weatherData.removeObserver(dev2);
		weatherData.setTemp(75);
		
		
	}

}
