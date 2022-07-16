public class Person {    
	private String mName;
	private String nFriend;
	private int friendA;
	   
	public Person(String name)    {        
	    mName = name;
	    nFriend = new String("");
	}    
	public String getFriendNames()    {        
		return nFriend;         
	}       
	public void befriend(Person p)    {         
		nFriend = nFriend + p.getName() + " ";
		friendA++; 
	}     
	public void unfriend(Person p)    {        
		String storage =  "\\s*\\b" + p.getName() + "\\b\\s*";
		nFriend= nFriend.replaceAll(storage, " ");
	    friendA--;
	}   
	public String getName( ) {
		return mName;
	}
    public int getFriendCount()    {        
    	return friendA;          
    }
}
