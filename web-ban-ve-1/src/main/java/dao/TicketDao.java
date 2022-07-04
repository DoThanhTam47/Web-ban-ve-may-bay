package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.TicketModel;
import utils.JDBCUtils;

public class TicketDao {
	private static final String INSERT_TICKET_SQL = "INSERT INTO ticket"
			+ "  (gia, hangghe, mamaybay, ngaybay, ngayden, noibay, noiden, thoigian) VALUES "
			+ " (?, ?, ?, ?, ?, ?, ?, ?);";

	private static final String SELECT_TICKET_BY_ID = "select * from ticket where idTicket =?";
	private static final String SELECT_ALL_TICKET = "select * from ticket order by ngaybay LIMIT ?, 5";
	private static final String DELETE_TICKET_SQL = "delete from ticket where idTicket = ?;";
	private static final String UPDATE_TICKET_SQL = "update ticket set gia = ?, hangghe= ?, mamaybay = ?, ngaybay = ?, ngayden = ?, noibay = ?, noiden = ?, thoigian = ? where idTicket = ?;";

	public List<TicketModel> getAllTickets(int index) {
		List<TicketModel> list = new ArrayList<TicketModel>();

		try {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TICKET);
			preparedStatement.setInt(1, (index - 1)*5);
			System.out.println(preparedStatement);
			// Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			//Process the ResultSet object.
			while (rs.next()) {
				list.add(new TicketModel(
						rs.getInt(1),
						rs.getInt(2),
						rs.getString(3),
						rs.getString(4),
						rs.getDate(5),
						rs.getDate(6),
						rs.getString(7),
						rs.getString(8),
						rs.getString(9)
						));
				System.out.println(preparedStatement);
			}
		} catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}

		return list;
	}
	
	
	public void deleteTicket(String ticketId) throws SQLException {
		
        
		try{
			Connection connection = JDBCUtils.getConnection(); 
        	PreparedStatement statement = connection.prepareStatement(DELETE_TICKET_SQL);
            statement.setString(1, ticketId);
            
            statement.executeUpdate();
        	System.out.println(statement);

        } catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
	}
	
	public void insertTicket(String gia, String hangGhe, String maMayBay, String ngayBay, String ngayDen, String noiBay, 
			String noiDen, String thoiGian) {
		
		try{
			Connection connection = JDBCUtils.getConnection(); 
        	PreparedStatement statement = connection.prepareStatement(INSERT_TICKET_SQL);
            
        	statement.setString(1, gia);
        	statement.setString(2, hangGhe);
        	statement.setString(3, maMayBay);
        	statement.setString(4, ngayBay);
        	statement.setString(5, ngayDen);
        	statement.setString(6, noiBay);
        	statement.setString(7, noiDen);
        	statement.setString(8, thoiGian);
        	
        	statement.executeUpdate();
        	
        	System.out.println(statement);
           
        } catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
	}
	
	public TicketModel getTicketById(String ticketId) {
		
		try{
			Connection connection = JDBCUtils.getConnection(); 
        	PreparedStatement statement = connection.prepareStatement(SELECT_TICKET_BY_ID);
            
        	statement.setString(1, ticketId);
        	
        	ResultSet rs = statement.executeQuery();
        	
        	while (rs.next()) {
				return new TicketModel(
						rs.getInt(1),
						rs.getInt(2),
						rs.getString(3),
						rs.getString(4),
						rs.getDate(5),
						rs.getDate(6),
						rs.getString(7),
						rs.getString(8),
						rs.getString(9)
						);
			}
        	System.out.println(statement);

        } catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
		
		return null;
		
	}
	
	public void updateTicket(String ticketId, String gia, String hangGhe, String maMayBay, String ngayBay, String ngayDen, String noiBay, 
			String noiDen, String thoiGian) {
		
		try{
			Connection connection = JDBCUtils.getConnection(); 
        	PreparedStatement statement = connection.prepareStatement(UPDATE_TICKET_SQL);
            
        	statement.setString(1, gia);
        	statement.setString(2, hangGhe);
        	statement.setString(3, maMayBay);
        	statement.setString(4, ngayBay);
        	statement.setString(5, ngayDen);
        	statement.setString(6, noiBay);
        	statement.setString(7, noiDen);
        	statement.setString(8, thoiGian);
        	statement.setString(9, ticketId);
        	
        	statement.executeUpdate();
        	
        	System.out.println(statement);
           
        } catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
	}
	
	public int count(String noiBay, String noiDen, String ngayBay) {
		
		try{
			String query = "SELECT count(*) FROM banveonline.ticket WHERE noibay LIKE ? OR noiden LIKE ? OR ngaybay LIKE ?";
					
			Connection connection = JDBCUtils.getConnection(); 
        	PreparedStatement statement = connection.prepareStatement(query);
            
        	statement.setString(1, "%"+noiBay+"%");  
        	statement.setString(2, "%"+noiDen+"%");        	
        	statement.setString(3, "%"+ngayBay+"%"); 
        	
        	ResultSet rs = statement.executeQuery();
        	
        	while(rs.next()) {
        		return rs.getInt(1);
        		
        	}
        	System.out.println(statement);
        } catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
		return 0;
	}
	
	public List<TicketModel> searchTickets(String noiBay, String noiDen, String ngayBay, int index) {
		List<TicketModel> list = new ArrayList<TicketModel>();
		
		String query = "SELECT * FROM banveonline.ticket WHERE noibay LIKE ? AND noiden LIKE ? AND ngaybay LIKE ? order by ngaybay asc LIMIT ?, 5";
		
		try {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, "%"+noiBay+"%");  
			preparedStatement.setString(2, "%"+noiDen+"%");        	
			preparedStatement.setString(3, "%"+ngayBay+"%");
			preparedStatement.setInt(4, (index - 1)*5); 
			
			System.out.println(preparedStatement);
			// Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			//Process the ResultSet object.
			while (rs.next()) {
				list.add(new TicketModel(
						rs.getInt(1),
						rs.getInt(2),
						rs.getString(3),
						rs.getString(4),
						rs.getDate(5),
						rs.getDate(6),
						rs.getString(7),
						rs.getString(8),
						rs.getString(9)
						));
				System.out.println(preparedStatement);
			}
		} catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}

		return list;
	}
	
	
public int countAllTicket() {
		
		try{
			String query = "SELECT count(*) FROM banveonline.ticket";
					
			Connection connection = JDBCUtils.getConnection(); 
        	PreparedStatement statement = connection.prepareStatement(query);
            
     
        	
        	ResultSet rs = statement.executeQuery();
        	
        	while(rs.next()) {
        		return rs.getInt(1);
        		
        	}
        	System.out.println(statement);
        } catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
		return 0;
	}
}
 