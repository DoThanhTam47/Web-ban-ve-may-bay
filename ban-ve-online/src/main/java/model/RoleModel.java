package model;

import java.io.Serializable;

public class RoleModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int roleId;
	private String roleName;
	
	
	
	public RoleModel() {
		
	}

	public RoleModel(int roleId, String roleName) {
		this.roleId = roleId;
		this.roleName = roleName;
	}
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	

}
