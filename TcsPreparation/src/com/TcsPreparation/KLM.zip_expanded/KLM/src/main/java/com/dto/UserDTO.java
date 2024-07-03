package com.dto;

public class UserDTO {
	
	private String userName;
	
	private String password;

	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + ", password=" + password + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserDTO(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public UserDTO() {
		super();
	}
	
	

}
