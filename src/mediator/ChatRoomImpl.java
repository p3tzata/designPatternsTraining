package mediator;

import java.util.HashMap;

import java.util.Map;

public class ChatRoomImpl implements ChatRoom {

	
	Map<Integer,User> users=new HashMap<>();
	
	public void addUser(User user){
		users.put(user.getId(),user);
	}
	
	
	@Override
	public void sendMsg(User from,User toUser, String msg) {
		users.get(toUser.getId()).receiveMsg(from, msg);
		
	}


	
	

}
