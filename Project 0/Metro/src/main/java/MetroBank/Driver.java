package MetroBank;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Driver {


    public static void main(String[] args) {


////        String check = "Checking";
//////
//////        //"jdbc:mariadb://hostname:port/databaseName?user=username&password=password"
//        String connString = "jdbc:mysql://glenroy-db.cwnf4kerlwdj.us-east-1.rds.amazonaws.com:3306/NewAlpha?user=admin&password=8jag(PQup9ANJZ6";
//
//        try {
//            Connection conn = DriverManager.getConnection(connString);
//
//
//
//            String sql = "INSERT INTO clients (customer_id, firstName, lastName, password) VALUES (003, \"Love\", \"Anderson\". \"rickie\" );";
//            Statement stmt = conn.createStatement();
//            stmt.executeQuery(sql);
//            ResultSet rs = stmt.executeQuery(sql);
//
//            List<Clients> cust = new ArrayList<>();
//
//            while (rs.next()) {
//                Clients temp = new Clients();
//                temp.setId(rs.getInt("customer_id"));
//                temp.setFirstName(rs.getString("firstName"));
//                temp.setLastName(rs.getString("lastName"));
//                temp.setPassword(rs.getString("password"));
//                cust.add(temp);
//            }
//
//            for (Clients tm : cust) {
//                System.out.println(tm);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
////
//    }
////         MainMenu start = new MainMenu();
    }
}
