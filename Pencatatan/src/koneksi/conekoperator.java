package koneksi;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class conekoperator {
    private static Connection koneksi;
    public static Connection GetConnection()throws SQLException{
        if (koneksi==null){
            new Driver();
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/pencatatan","root","");
        }
        return koneksi;
    }
}
