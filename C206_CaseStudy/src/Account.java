/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Nur Shirin 20017864, 5 Aug 2021 6:49:45 pm
 */

public class Account {
	private String username;
	private String password;
	private String role;
	private boolean isUpdated;
	
	public Account(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getRole() {
		return role;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean accLogin(String uName, String uPassword) {
		return true;
	}
	
	public boolean accDelete(String name) {
		return true;
	}
	
	public void setIsUpdated(boolean isUpdated) {
		this.isUpdated = isUpdated;
	}
	
	public boolean getIsUpdated() {
		return isUpdated;
	}
}