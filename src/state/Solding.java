package state;

public class Solding implements State {

	private CoffieMachine coffieMachine;
	
	public Solding(CoffieMachine coffieMachine) {
	
		this.coffieMachine = coffieMachine;
	}

	@Override
	public void insertCoin() {
		
		
		
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

		coffieMachine.setCurrentState(coffieMachine.getNoCoinState());
		coffieMachine.setDesplayString("Please put coin.");
		
		
	}

	@Override
	public void noCoffie() {
		
		coffieMachine.setCurrentState(coffieMachine.getNoCoffieState());
		coffieMachine.setDesplayString("No coffie left.");

		
	}

	@Override
	public void fillUpAvailCoffie(int countCoffie) {
		// TODO Auto-generated method stub
		
	}

}
