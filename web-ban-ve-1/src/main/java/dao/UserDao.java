package dao;

import model.UserModel;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

	

	public void insertAdmin(String email, String fullname, String password, String phonenumber, String idrole ) {
		
		String INSERT_ADMIN = "INSERT INTO user" + "  (email, fullname, password, phonenumber,idrole) VALUES " + 
				" (?, ?, ?, ?, ?);";
		
		try{
			Connection connection = JDBCUtils.getConnection(); 
        	PreparedStatement statement = connection.prepareStatement(INSERT_ADMIN);
            
        	statement.setString(1, email);
        	statement.setString(2, fullname);
        	statement.setString(3, password);
        	statement.setString(4, phonenumber);
        	statement.setString(5, idrole);
        	
        	
        	statement.executeUpdate();
        	
        	System.out.println(statement);
           
        } catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
	}

	public UserModel findByEmailAndPassword(String email, String password) {
		
		UserModel user = null;
		
		try {
				
			Connection connection = JDBCUtils.getConnection();
            PreparedStatement preparedStatement = connection
            .prepareStatement("select * from user where email = ? and password = ? ");
				
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
	            JDBCUtils.printSQLException(e);
	        }
		return user;
		
	}
	
	
	public List<UserModel> getAllUser() {
		
		List<UserModel> list = new ArrayList<UserModel>();
		String query = "select * from user";
		
		try {
			Connection connection = JDBCUtils.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				list.add(new UserModel(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6)
						));
				System.out.println(preparedStatement);
			}
			
		} catch (SQLException e) {
			JDBCUtils.printSQLException(e);
		}
		
		return list;
	}
	
	
	public void deleteUser(String userId) throws SQLException {
		String query = "delete from user where idUser = ?";
         
		try{
			Connection connection = JDBCUtils.getConnection(); 
        	PreparedStatement preparedStatement = connection.prepareStatement(query);
        	preparedStatement.setString(1, userId);
            
        	preparedStatement.executeUpdate();
        	System.out.println(preparedStatement);

            
        } catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
       
	}
	
	
public void insertUser(String email, String fullname, String password, String phonenumber, String idrole ) {
		
		String INSERT_USER = "INSERT INTO user" + "  (email, fullname, password, phonenumber,idrole) VALUES " + 
				" (?, ?, ?, ?, ?);";
		
		try{
			Connection connection = JDBCUtils.getConnection(); 
        	PreparedStatement statement = connection.prepareStatement(INSERT_USER);
            
        	statement.setString(1, email);
        	statement.setString(2, fullname);
        	statement.setString(3, password);
        	statement.setString(4, phonenumber);
        	statement.setString(5, idrole);
        	
        	
        	statement.executeUpdate();
        	
        	System.out.println(statement);
           
        } catch (SQLException exception) {
			JDBCUtils.printSQLException(exception);
		}
	}
}
