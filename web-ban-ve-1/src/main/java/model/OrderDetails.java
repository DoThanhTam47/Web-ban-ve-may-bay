package model;

public class OrderDetails {
	int id;
	int ticket_id;
	int order_id;
	int quantity;
	int price;
	public OrderDetails() {
		super();
	}
	public OrderDetails(int ticket_id, int order_id, int quantity, int price) {
		super();
		this.ticket_id = ticket_id;
		this.order_id = order_id;
		this.quantity = quantity;
		this.price = price;
	}
	public OrderDetails(int id, int ticket_id, int order_id, int quantity, int price) {
		super();
		this.id = id;
		this.ticket_id = ticket_id;
		this.order_id = order_id;
		this.quantity = quantity;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
