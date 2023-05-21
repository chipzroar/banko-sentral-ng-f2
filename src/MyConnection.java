
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    
    public static Connection getConnection() {
        
        Connection con = null;
        try {
            // Edit lang sa port
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/dbonlinebankingsystem", "root", "");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return con;
    }
}
