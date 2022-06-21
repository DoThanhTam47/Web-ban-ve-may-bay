package dao;

import model.UserModel;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

	public int registerUser(UserModel user) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO user" + "  (email, fullname, password, phonenumber, idrole) VALUES "
				+ " (?, ?, ?, ?, ?);";

		int result = 0;
		try (Connection connection = JDBCUtils.getConnection();

				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, user.getEmail());
			preparedStatement.setString(2, user.getFullName());
			preparedStatement.setString(3, user.getPassword());
			preparedStatement.setString(4, user.getPhoneNumber());
			preparedStatement.setInt(5, user.getRoleId());

			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			JDBCUtils.printSQLException(e);
		}
		return result;
	}

	public int addAdmin(UserModel user) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO user" + "  (email, fullname, password, phonenumber,idrole) VALUES " + 
				" (?, ?, ?, ?, ?);";

		int result = 0;
		try (Connection connection = JDBCUtils.getConnection();

				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, user.getEmail());
			preparedStatement.setString(2, user.getFullName());
			preparedStatement.setString(3, user.getPassword());
			preparedStatement.setString(4, user.getPhoneNumber());
			preparedStatement.setInt(5, user.getRoleId());
			System.out.println(preparedStatement);
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			JDBCUtils.printSQLException(e);
		}
		return result;
	}
	
	
	public UserModel findByEmailAndPassword(String email, String password) {
		
		UserModel user = null;
		
		try (Connection connection = JDBCUtils.getConnection();
	            // Create a statement using connection object
	            PreparedStatement preparedStatement = connection
	            .prepareStatement("select * from user where email = ? and password = ? ")) {
	            preparedStatement.setString(1, email);
	            preparedStatement.setString(2, password);

	            System.out.println(preparedStatement);
	            ResultSet rs = preparedStatement.executeQuery();
	            
	            while (rs.next()) {
	            	int userIdDB = rs.getInt("idUser");
	            	String emailDB = rs.getString("email");
	            	String fullNameDB = rs.getString("fullname");
	            	String passwordDB = rs.getString("password");
	            	String phoneNumberDB = rs.getString("phonenumber");
	                int roleIdDB = rs.getInt("idrole");

	            	user = new UserModel(userIdDB, emailDB, fullNameDB, passwordDB, phoneNumberDB, roleIdDB);
	            }

	        } catch (SQLException e) {
	            // process sql exception
	            JDBCUtils.printSQLException(e);
	        }
		return user;
		
	}
}
