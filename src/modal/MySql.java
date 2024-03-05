
package modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySql{

    private static Connection connection;

    static {  //static block ekma eka wathaawai execute wenne
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shop_db", "root", "Lakshan@1999");

        } catch (Exception e) {
        }

    }

    public static ResultSet execute(String query) { 
        try {

            Statement statement = connection.createStatement();
            if (query.startsWith("SELECT")) {
                ResultSet resultset = statement.executeQuery(query);
                return resultset;

            } else {
                int result = statement.executeUpdate(query); 
                return null;

            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
