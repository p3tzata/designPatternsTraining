package mediator;

public class Main {

	public static void main(String[] args) {
		
		User ivoUser = new UserImpl(1,"Ivo");
		User pepoUser = new UserImpl(2,"Pepo");
		
		
		ChatRoom chatRoomImpl = new ChatRoomImpl();
		chatRoomImpl.addUser(pepoUser);
		chatRoomImpl.addUser(ivoUser);
		
		ivoUser.setChatRoom(chatRoomImpl);
		pepoUser.setChatRoom(chatRoomImpl);
		
		ivoUser.sendMsg(pepoUser, "Hi pepo");
		
	}

}
