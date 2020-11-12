package command.training.doorRemoteControl;

public class DoorCloseCommand implements Command{

	Door door;

	public DoorCloseCommand(Door door) {
		super();
		this.door = door;
	}

	@Override
	public void execute() {
		door.closeDoor();
		
	}

}
