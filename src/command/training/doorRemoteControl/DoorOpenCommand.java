package command.training.doorRemoteControl;

public class DoorOpenCommand implements Command{

	Door door;

	public DoorOpenCommand(Door door) {
		super();
		this.door = door;
	}

	@Override
	public void execute() {
		door.openDoor();
		
	}
	
	
	
	
	
}
