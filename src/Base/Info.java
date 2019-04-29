package Base;

import java.io.Serializable;

public class Info implements Serializable {
	private String name;
	private String username;
	private String password;
	private String birth;
	private int id;
	private int year_intake;
	
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
	
	public int getYear_intake() {
		return year_intake;
	}
	public void setYear_intake(int year_intake) {
		this.year_intake = year_intake;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
