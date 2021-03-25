package mediator;


public class UserImpl implements User {
	
	Integer userIDInteger;
	String name;
	ChatRoom mediator;
	
	
	public UserImpl(Integer userIDInteger, String name) {
		super();
		this.userIDInteger = userIDInteger;
		this.name = name;
	}


	@Override
	public String getName() {
		
		return name;
	}


	@Override
	public Integer getId() {
	
		return userIDInteger;
	}
	

	
	public void setChatRoom(ChatRoom chatRoom) {
		this.mediator = chatRoom;
	}

	@Override
	public void sendMsg(User toUser, String msg) {
		
		System.out.println(this.getName()+" send msg to "+toUser.getName()+"->" + msg);
		mediator.sendMsg(this,toUser, msg);
		
	}

	@Override
	public void receiveMsg(User fromUser, String msg) {
		
		System.out.println(this.getName()+" receive msg from:"+fromUser.getName()+"->" + msg);
		
	}


}
