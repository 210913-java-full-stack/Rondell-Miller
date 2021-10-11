package MetroBank.utils;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {

    private static Connection conn;

    //private connection constructor so that no-one but me can instantiate a connection.
    private ConnectionManager() {
    }

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Properties props = new Properties();
                FileReader connectionProperties = new FileReader("src/main/resources/connection.properties");
                props.load(connectionProperties);

                String connString = "jdbc:mariadb://" +
                        props.getProperty("hostname") + ":" +
                        props.getProperty("port") + "/" +
                        props.getProperty("dbname") + "?user=" +
                        props.getProperty("username") + "&password= " +
                        props.getProperty("password");


                conn = DriverManager.getConnection(connString);
//            Statement stmt = conn.createStatement();
//            String sql = "SELECT * FROM Alpha.customers";
//
//            ResultSet rs = stmt.executeQuery(sql);
//
//            while (rs.next())
//                System.out.println(rs.getString("first_name"));
            } catch (SQLException | IOException e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }
        return conn;
    }
}

