package model;

import java.io.Serializable;

public class UserModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int userId;
	private String email;
	private String fullName;
	private String password;
	private String phoneNumber;
	private int roleId;
	private RoleModel roleModel = new RoleModel();
	
	public UserModel() {
		
	}

	public UserModel(String email, String fullName, String password, String phoneNumber, int roleId) {
		super();
		this.email = email;
		this.fullName = fullName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.roleId = roleId;
	}

	public UserModel(int userId, String email, String fullName, String password, String phoneNumber, int roleId) {
		super();
		this.userId = userId;
		this.email = email;
		this.fullName = fullName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.roleId = roleId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public RoleModel getRoleModel() {
		return roleModel;
	}

	public void setRoleModel(RoleModel roleModel) {
		this.roleModel = roleModel;
	}

	
	
	
}
