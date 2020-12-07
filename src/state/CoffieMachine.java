package state;

public class CoffieMachine  {

	
	State noCoinState;
	State hasCoinState;
	State soldingState;
	State noCoffieState;
	
	State currentState;

	int countCoffieAvail=0;
	
	String desplayString="Please insert coin";
	
	
	public CoffieMachine(int countCofieAvail) {
		this.countCoffieAvail=countCofieAvail;
		
		noCoinState =new NoCoin(this); 
		hasCoinState = new HasCoin(this);
		soldingState = new Solding(this);
		noCoffieState = new NoCoffie(this);
		
		currentState=noCoinState;
		refreshDisplay();
		
	}

	public void fillWithCoffie(int count) {
		countCoffieAvail+=count;
	}



	public void insertCoin() {
		currentState.insertCoin();
		
	}


	public void ejectCoin() {
		currentState.ejectCoin();		
	}

	public void bushSoldButton() {
		currentState.bushSoldButton();
		
	}


	public void exitSold() {
		
		currentState.exitSold();
		
	}

	public void noCoffie() {
		currentState.noCoffie();
		
	}

	public void fillUpAvailCoffie(int countCoffie) {
		currentState.fillUpAvailCoffie(countCoffie);
		
	}
	
	
	public void decrCoffieCount() {
		countCoffieAvail--;	
	}
	

	public State getNoCoinState() {
		return noCoinState;
	}


	public State getHasCoinState() {
		return hasCoinState;
	}




	public State getSoldingState() {
		return soldingState;
	}




	public State getNoCoffieState() {
		return noCoffieState;
	}




	public State getCurrentState() {
		return currentState;
	}




	public int getCountCoffieAvail() {
		return countCoffieAvail;
	}




	public String getDesplayString() {
		return desplayString;
	}




	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}


	public void setDesplayString(String desplayString) {
		this.desplayString = desplayString;
		refreshDisplay();
	}


	
	public void refreshDisplay() {
		System.out.println(desplayString);
	}








	
	
	
	
	
	
	
	
}
