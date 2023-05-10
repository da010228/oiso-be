package com.ssafy.user.model;

public class User {

	private String userId;
	private String userPwd;
	private String emailId;
	private String emailDomain;

	public User() {}
	

	public User(String userId, String userPwd) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
	}


	public User(String userId, String userPwd, String emailId, String emailDomain) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.emailId = emailId;
		this.emailDomain = emailDomain;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmailDomain() {
		return emailDomain;
	}

	public void setEmailDomain(String emailDomain) {
		this.emailDomain = emailDomain;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPwd=" + userPwd + ", emailId=" + emailId + ", emailDomain="
				+ emailDomain + "]";
	}

}
