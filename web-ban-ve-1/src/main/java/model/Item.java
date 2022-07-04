package model;

import java.io.Serializable;

public class Item implements Serializable {
	private static final long serialVersionUID = 1L;
	

	private int quantity;
	private int price;
	private TicketModel ticket;
	
	
	
	public Item(int quantity, TicketModel ticket) {
		super();
		this.quantity = quantity;
		this.ticket = ticket;
	}


	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public TicketModel getTicket() {
		return ticket;
	}
	public void setTicket(TicketModel ticket) {
		this.ticket = ticket;
	}
	
	


	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public Item(int quantity, int price, TicketModel ticket) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.ticket = ticket;
	}
	
	public void incrementQuantity() {
		this.quantity ++;
	}
	
}
