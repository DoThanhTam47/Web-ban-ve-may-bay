package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.TicketModel;
import utils.JDBCUtils;

public class TicketDaoImpl implements InterfaceTicketDao {

	private static final String INSERT_TICKET_SQL = "INSERT INTO ticket"
			+ "  (gia, hangghe, mamaybay, ngaybay, ngayden, noibay, noiden, thoigian) VALUES "
			+ " (?, ?, ?, ?, ?, ?, ?, ?);";

	private static final String SELECT_TICKET_BY_ID = "select * from ticket where idTicket =?";
	private static final String SELECT_ALL_TICKET = "select * from ticket";
	private static final String DELETE_TICKET_SQL = "delete from ticket where idTicket = ?;";
	private static final String UPDATE_TICKET_SQL = "update ticket set gia = ?, hangghe= ?, mamaybay = ?, ngaybay = ?, ngayden = ?, noibay = ?, noiden = ?, thoigian = ? where idTicket = ?;";

	@Override
	public void insertTicket(TicketModel ticketModel) throws SQLException {
		
		Connection connection = JDBCUtils.getConnection();
		
		try {

			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TICKET_SQL);

			preparedStatement.setLong(1, ticketModel.getGia());
			preparedStatement.setString(2, ticketModel.getHangGhe());
			preparedStatement.setString(3, ticketModel.getMaMaybay());
			preparedStatement.setString(4, ticketModel.getNgayBay());
			preparedStatement.setString(5, ticketModel.getNgayDen());
			preparedStatement.setString(6, ticketModel.getNoiBay());
			preparedStatement.setString(7, ticketModel.getNoiDen());
			preparedStatement.setString(8, ticketModel.getThoiGian());

			System.out.println(preparedStatement);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			JDBCUtils.printSQLException(e);
		} finally {
			connection.close();
		}
	}

	@Override
	public TicketModel selectTicketById(int ticketId) {
		// TODO Auto-generated method stub
		TicketModel ticketModel = null;

		try (Connection connection = JDBCUtils.getConnection();

				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_TICKET_BY_ID)) {

			preparedStatement.setInt(1, ticketId);
			System.out.println(preparedStatement);
			// Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Process the ResultSet object.
			while (rs.next()) {

				int ticketIdDB = rs.getInt(ticketId);
				long giaDB = rs.getLong("gia");
				String hangGheDB = rs.getString("hangghe");
				String maMayBayDB = rs.getString("mamaybay");
				String ngayBayDB = rs.getString("ngaybay");
				String ngayDenDB = rs.getString("ngayden");
				String noiBayDB = rs.getString("noibay");
				String noiDenDB = rs.getString("noiden");
				String thoiGianDB = rs.getString("thoigian");

				ticketModel = new TicketModel(ticketIdDB, maMayBayDB, noiBayDB, noiDenDB, ngayBayDB, ngayDenDB,
						thoiGianDB, hangGheDB, giaDB);
			}

		} catch (SQLException e) {
			JDBCUtils.printSQLException(e);
		}

		return ticketModel;
	}

	@Override
	public List<TicketModel> selectAllTickets() {
		// TODO Auto-generated method stub
		List<TicketModel> tickets = new ArrayList<>();

		try (Connection connection = JDBCUtils.getConnection();

				// Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TICKET);) {
			System.out.println(preparedStatement);
			// Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			//Process the ResultSet object.
			while (rs.next()) {
				
				int ticketIdDB = rs.getInt("idTicket");
				long giaDB = rs.getLong("gia");
				String hangGheDB = rs.getString("hangghe");
				String maMayBayDB = rs.getString("mamaybay");
				String ngayBayDB = rs.getString("ngaybay");
				String ngayDenDB = rs.getString("ngayden");
				String noiBayDB = rs.getString("noibay");
				String noiDenDB = rs.getString("noiden");
				String thoiGianDB = rs.getString("thoigian");
				
				tickets.add(new TicketModel(ticketIdDB, maMayBayDB, noiBayDB, noiDenDB, ngayBayDB, ngayDenDB,
						thoiGianDB, hangGheDB, giaDB));
			}
		} catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}

		return tickets;
	}

	@Override
	public boolean deleteTicket(int ticketId) throws SQLException {
		boolean rowDeleted;
        
		try (Connection connection = JDBCUtils.getConnection(); 
        	PreparedStatement statement = connection.prepareStatement(DELETE_TICKET_SQL);) {
            statement.setInt(1, ticketId);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
	}

	@Override
	public boolean updateTicket(TicketModel ticketModel) throws SQLException {
		boolean rowUpdated;
        try (Connection connection = JDBCUtils.getConnection(); 
        	PreparedStatement statement = connection.prepareStatement(UPDATE_TICKET_SQL);) {
            
        	statement.setLong(1, ticketModel.getGia());
            statement.setString(2, ticketModel.getHangGhe());
            statement.setString(3, ticketModel.getMaMaybay());
            statement.setString(4, ticketModel.getNgayBay());
            statement.setString(5, ticketModel.getNgayDen());
            statement.setString(6, ticketModel.getNoiBay());
            statement.setString(7, ticketModel.getNoiDen());
            statement.setString(8, ticketModel.getThoiGian());
            
            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
	}

}
