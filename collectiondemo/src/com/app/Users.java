package com.app;

public class Users {

	public int userId;
	public String userName;
	public String userMail;
	public String userCity;
	public String userDept;
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userMail=" + userMail + ", userCity="
				+ userCity + ", userDept=" + userDept + "]";
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int userId, String userName, String userMail, String userCity, String userDept) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMail = userMail;
		this.userCity = userCity;
		this.userDept = userDept;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserDept() {
		return userDept;
	}
	public void setUserDept(String userDept) {
		this.userDept = userDept;
	}
}
