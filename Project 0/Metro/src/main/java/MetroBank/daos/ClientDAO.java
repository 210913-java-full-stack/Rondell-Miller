package MetroBank.daos;

import MetroBank.colletions.MyArrayList;
import MetroBank.models.Clients;
import MetroBank.utils.ConnectionManager;

import java.sql.*;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public  class ClientDAO<T> implements CrudDAO<T>{
    private static Connection conn = ConnectionManager.getConnection();



    
    @Override
    public static void save(Clients clients) throws SQLException {
            String sql = "insert into cars (color, make, model, model_year) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql, RETURN_GENERATED_KEYS);
            pstmt.setInt(1, clients.getId());
            pstmt.setString(2, clients.getFirstName());
            pstmt.setString(3, clients.getLastName());
            pstmt.setString(4, clients.getUserPassword());

            pstmt.executeUpdate();

            ResultSet rs = pstmt.getGeneratedKeys();

            rs.next();
            clients.setId(rs.getInt("id"));
            //we could also identify the column by index 1
    }

    @Override
    public void save(T t) throws SQLException {

    }

    @Override
    public T getItemByID(int id) throws SQLException {
        return null;
    }

    @Override
    public MyArrayList<T> getAllItems() throws SQLException {
        String sql = "SELECT * FROM clients";
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        MyArrayList<Clients> clientList = new MyArrayList<>();

        while(rs.next()) {
            Clients newItem = new Clients();
            rs.getInt("customer_id");
            rs.getString("firstName");
            rs.getString("lastName");
            clientList.add(newItem);
        }

        return (MyArrayList<T>) clientList;
    }


    @Override
    public void deleteByID(int id) throws SQLException {

    }
}
