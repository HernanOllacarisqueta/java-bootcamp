package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="user")

public class User {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	
	
	protected User() {};
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
		
	public int getUserid() {
		return id;
	}
	public void setUserid(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return String.format("User [id=%d, username='%s', password='%s']", id, username, password);
		//return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}



}