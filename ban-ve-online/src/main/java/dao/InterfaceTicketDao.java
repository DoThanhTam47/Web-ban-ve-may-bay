package dao;

import java.sql.SQLException;
import java.util.List;

import model.TicketModel;

public interface InterfaceTicketDao {
	 
	 void insertTicket(TicketModel ticketModel) throws SQLException;

	 TicketModel selectTicketById(int ticketId);

	 List<TicketModel> selectAllTickets();

	 boolean deleteTicket(int ticketId) throws SQLException;

	 boolean updateTicket(TicketModel ticketModel) throws SQLException;
}
