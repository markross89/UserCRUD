import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;


public class UserDao {
	
	private final String CREATE_USER_QUERY =
			"INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
	private static final String READ_USER_QUERY =
			"SELECT * FROM users where id = ?";
	private static final String UPDATE_USER_QUERY =
			"UPDATE users SET username = ?, email = ?, password = ? where id = ?";
	private static final String FIND_ALL_USERS_QUERY =
			"SELECT * FROM users";
	private static final String DELETE_USER_QUERY =
			"DELETE FROM users WHERE id = ?";
	
	
	public User create (User user) {
		
		try (Connection connection = DbUtil.getConnection()) {
			
			PreparedStatement createUser = connection.prepareStatement(CREATE_USER_QUERY,
					PreparedStatement.RETURN_GENERATED_KEYS);
			createUser.setString(1, user.getUserName());
			createUser.setString(2, user.getEmail());
			createUser.setString(3, user.getPassword());
			createUser.executeUpdate();
			ResultSet resultSet = createUser.getGeneratedKeys();
			if (resultSet.next()) {
				user.setId(resultSet.getInt(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public User read (int userId) throws SQLException {
		
		try (Connection connection = DbUtil.getConnection()) {
			PreparedStatement statement = connection.prepareStatement(READ_USER_QUERY);
			statement.setInt(1, userId);
			ResultSet resultSet = statement.executeQuery();
			
			if (resultSet.next()) {
				
				User user = new User();
				user.setId(resultSet.getInt("id"));
				user.setUserName(resultSet.getString("username"));
				user.setEmail(resultSet.getString("email"));
				user.setPassword(resultSet.getString("password"));
				
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public void update (User user) {
		
		try (Connection conn = DbUtil.getConnection()) {
			
			PreparedStatement updateStatement = conn.prepareStatement(UPDATE_USER_QUERY);
			updateStatement.setString(1, user.getUserName());
			updateStatement.setString(2, user.getEmail());
			updateStatement.setString(3, user.getPassword());
			updateStatement.setInt(4, user.getId());
			updateStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public User[] findAll () {
		
		try (Connection conn = DbUtil.getConnection()) {
			
			User[] users = new User[0];
			PreparedStatement statement = conn.prepareStatement(FIND_ALL_USERS_QUERY);
			ResultSet resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				
				User user = new User();
				user.setId(resultSet.getInt("id"));
				user.setUserName(resultSet.getString("username"));
				user.setEmail(resultSet.getString("email"));
				user.setPassword(resultSet.getString("password"));
				users = Arrays.copyOf(users, users.length+1);
				users[users.length-1] = user;
			}
			return users;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
	}
	
	public void delete(int userId) {
		
		try (Connection conn = DbUtil.getConnection()) {
			
			PreparedStatement statement = conn.prepareStatement(DELETE_USER_QUERY);
			statement.setInt(1, userId);
			statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
