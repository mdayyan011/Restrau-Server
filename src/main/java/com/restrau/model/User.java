package com.restrau.model;

public class User {

	private int user_id,is_admin;
	private String user_email,user_password;
	public User(int user_id, int is_admin, String user_email, String user_password) {
		super();
		this.user_id = user_id;
		this.is_admin = is_admin;
		this.user_email = user_email;
		this.user_password = user_password;
	}
	
	public User() {}

	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the is_admin
	 */
	public int getIs_admin() {
		return is_admin;
	}

	/**
	 * @param is_admin the is_admin to set
	 */
	public void setIs_admin(int is_admin) {
		this.is_admin = is_admin;
	}

	/**
	 * @return the user_email
	 */
	public String getUser_email() {
		return user_email;
	}

	/**
	 * @param user_email the user_email to set
	 */
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	/**
	 * @return the user_password
	 */
	public String getUser_password() {
		return user_password;
	}

	/**
	 * @param user_password the user_password to set
	 */
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", is_admin=" + is_admin + ", user_email=" + user_email + ", user_password="
				+ user_password + "]";
	}
	
	
	
}
