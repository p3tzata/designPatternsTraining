package state;

public class NoCoffie implements State {

	private CoffieMachine coffieMachine;
	
	public NoCoffie(CoffieMachine coffieMachine) {
	
		this.coffieMachine = coffieMachine;
	}

	@Override
	public void insertCoin() {
		
		
		coffieMachine.setDesplayString("Can't you read. No coffie left");
		coffieMachine.refreshDisplay();
		
	}

	@Override
	public void ejectCoin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bushSoldButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSold() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void noCoffie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillUpAvailCoffie(int countCoffie) {

		coffieMachine.fillWithCoffie(countCoffie);
		coffieMachine.setDesplayString("Filled with coffies.");
		coffieMachine.setCurrentState(coffieMachine.getNoCoinState());
		coffieMachine.setDesplayString("Please put coin.");
		
		
	}

}
