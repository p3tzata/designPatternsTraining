package state;

public interface State {
	
	public void insertCoin();
	public void ejectCoin();
	public void bushSoldButton();
	public void exitSold();
	public void noCoffie();
	public void fillUpAvailCoffie(int countCoffie);
	
}
