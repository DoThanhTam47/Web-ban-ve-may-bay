package model;

public class Orders {
	int id;
	String	user_name; 
	String email; 
	int total;
	
	public Orders() {
		super();
	}
	
	public Orders(String user_name, String email, int total) {
		super();
		this.user_name = user_name;
		this.email = email;
		this.total = total;
	}
	
	public Orders(int id, String user_name, String email, int total) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.email = email;
		this.total = total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
