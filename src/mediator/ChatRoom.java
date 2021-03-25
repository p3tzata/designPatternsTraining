package mediator;

public interface ChatRoom {
	void sendMsg(User fromUser,User toUser, String msg);
	void addUser(User user);
}
