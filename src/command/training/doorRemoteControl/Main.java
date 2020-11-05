package command.training.doorRemoteControl;

public class Main {

	//Client
	public static void main(String[] args) {
		
		//Invoker
		RemoteControl rControl = new RemoteControl();
		
		//Receiver
		Door door = new Door();
		
		//Command
		Command doorCloseCommand = new DoorCloseCommand(door);
		
		rControl.setCommand(doorCloseCommand);
		rControl.buttonPress();
	}

}
