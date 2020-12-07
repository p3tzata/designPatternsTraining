package state;

public class NoCoin implements State {

	private CoffieMachine coffieMachine;
	
	public NoCoin(CoffieMachine coffieMachine) {
	
		this.coffieMachine = coffieMachine;
	}

	@Override
	public void insertCoin() {
		coffieMachine.setCurrentState(coffieMachine.getHasCoinState());
		coffieMachine.setDesplayString("You entered coin. Push the solding button");
		
		
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
		// TODO Auto-generated method stub
	}

}
