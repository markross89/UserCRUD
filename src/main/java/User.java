public class User {
	
	private int id = 1;
	private String userName;
	private String email;
	private String password;
	
	
	

	
	public int getId () {
		
		return id;
	}
	public void seId(int id){
		this.id = id;
	}
	
	public void setId(int newId){
	
	this.id = newId;
	}
	
	
	public String getUserName () {
		
		return userName;
	}
	
	public void setUserName (String userName) {
		
		this.userName = userName;
	}
	
	public String getEmail () {
		
		return email;
	}
	
	public void setEmail (String email) {
		
		this.email = email;
	}
	
	public String getPassword () {
		
		return password;
	}
	
	public void setPassword (String password) {
		
		this.password = password;
	}
	
	@Override
	public String toString () {
		
		return "User{"+
				"id="+id+
				", userName='"+userName+'\''+
				", email='"+email+'\''+
				", password='"+password+'\''+
				'}';
	}
}
