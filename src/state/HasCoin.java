package state;

public class HasCoin implements State {

	private CoffieMachine coffieMachine;
	
	public HasCoin(CoffieMachine coffieMachine) {
	
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
		coffieMachine.setCurrentState(coffieMachine.getSoldingState());
		coffieMachine.setDesplayString("You pushed button. Please wait...");

		
		if(coffieMachine.getCountCoffieAvail()>0) {
			
			coffieMachine.decrCoffieCount();
			
			coffieMachine.setDesplayString("Get your coffie");
		
			
			if (coffieMachine.getCountCoffieAvail()>0) {
			
				coffieMachine.exitSold();
			} else {
				coffieMachine.noCoffie();
			}
				
		} else {
			
			coffieMachine.noCoffie();
			
			
		}
		
		
		
		
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
