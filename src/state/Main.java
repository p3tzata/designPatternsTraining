package state;

public class Main {

	public static void main(String[] args) {
		
		
		CoffieMachine coffieMachine = new CoffieMachine(3);
		
		coffieMachine.insertCoin();
		coffieMachine.bushSoldButton();
		
		coffieMachine.insertCoin();
		coffieMachine.bushSoldButton();
		
		coffieMachine.insertCoin();
		coffieMachine.bushSoldButton();
		
		coffieMachine.insertCoin();
		coffieMachine.bushSoldButton();

		coffieMachine.insertCoin();
		coffieMachine.bushSoldButton();
		
		coffieMachine.fillUpAvailCoffie(5);
		
		coffieMachine.insertCoin();
		coffieMachine.bushSoldButton();

		
	}

}
