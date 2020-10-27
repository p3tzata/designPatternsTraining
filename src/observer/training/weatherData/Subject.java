package observer.training.weatherData;


public interface Subject {

		void addObserver(Observer el);
		void removeObserver(Observer el);
		void notifyObservers();
	
}
