package MetroBank.daos;

import MetroBank.colletions.MyArrayList;
import MetroBank.models.Accounts;

import java.sql.*;
import java.util.List;

public class AccountDAO <Account> implements CrudDAO <Accounts>{


    private Connection conn;

    public AccountDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void save(Accounts accounts) throws SQLException {
        String sql = "SELECT * FROM accounts WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, accounts.getId());

        ResultSet rs = pstmt.executeQuery();
        //Result set are very similar to list. Very similar
        if (rs.next()){

            //Need Update statement

            String updateStatement =  "UPDATE accounts SET balance = ? type = ? WHERE id = ?";
            PreparedStatement preparedUpdateStatement = conn.prepareStatement(updateStatement);
            preparedUpdateStatement.setInt(1,accounts.getId());
            preparedUpdateStatement.setDouble(2, accounts.getBalance());
            preparedUpdateStatement.setString(3, accounts.getAccount_type());

            preparedUpdateStatement.executeUpdate();

        } else {
            //Need Insert statement
            String insertStatement = "INSERT INTO accounts (message, complete) VALUES (?,?)";
            PreparedStatement preparedInsertStatement = conn.prepareStatement(insertStatement);
            preparedInsertStatement.setInt(1,accounts.getId());
            preparedInsertStatement.setDouble(2, accounts.getBalance());
            preparedInsertStatement.setString(3, accounts.getAccount_type());

            preparedInsertStatement.executeUpdate();
        }

    }


    @Override
    public Accounts getItemByID(int id) throws SQLException {
        String sql = "SELECT * FROM accounts WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);

        ResultSet rs = pstmt.executeQuery(sql);

        if (rs.next()) {
            new Accounts(rs.getInt("id"), rs.getDouble("balance"), rs.getString("account_type"));
        }
        return null;
    }


    @Override
    public MyArrayList<Accounts> getAllItems() throws SQLException {
        String sql = "SELECT * FROM accounts";
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        MyArrayList<Accounts> acctList = new MyArrayList<>();

        while(rs.next()) {
            Accounts newItem = new Accounts();
                    rs.getInt("id");
                    rs.getDouble("balance");
                    rs.getString("account_type");
            acctList.add(newItem);
        }

        return (MyArrayList<Accounts>) acctList;
    }

    @Override
    public void deleteByID(int id) throws SQLException {
        String sql = "DELETE FROM accounts WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);

        pstmt.executeUpdate();

    }

    public void finalize() throws SQLException {
        conn.close();
    }
}
