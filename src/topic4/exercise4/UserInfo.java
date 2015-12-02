package topic4.exercise4;

public class UserInfo {

	private String name;
	private int id;
	private String email;	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int hashcode(){
		return id;
	}
	
	public boolean equals(Object obj)
	{
		boolean match = false;
		UserInfo userinfo = (UserInfo)obj;
		if(userinfo.id == id)
		match = true;
		return match;
	}
}
