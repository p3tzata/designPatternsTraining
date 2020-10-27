package observer.training.weatherData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WeatherData implements Subject {
	
	double temp=0;
	List<Observer> observers;
	
	
	
	public WeatherData() {
		super();
	    observers = new ArrayList<>();
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
		notifyObservers();
	}

	@Override
	public void addObserver(Observer el) {
		observers.add(el);
		
	}

	@Override
	public void removeObserver(Observer el) {
		observers.remove(el);
		
	}

	@Override
	public void notifyObservers() {
		
		for (Iterator iterator = observers.iterator(); iterator.hasNext();) {
			Observer observer = (Observer) iterator.next();
			observer.update(temp);
		}
		
	}

	
	
	
	
	

}
