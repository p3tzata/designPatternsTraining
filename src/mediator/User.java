package mediator;

public interface User {

	String getName();
	Integer getId();
	void setChatRoom(ChatRoom chatRoom);
	void sendMsg(User toUser, String msg);
	void receiveMsg(User fromUser, String msg);
	
}
