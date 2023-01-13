import java.sql.*;
import java.util.ArrayList;

public class TransferMoney {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/my_base", "postgres", "root");
            connection.setAutoCommit(false);
            
            PreparedStatement st = connection.prepareStatement("SELECT * FROM money_table WHERE id = ? AND naminal = ?");
            st.setInt(1,2);
            st.setString(2,"100");
            ResultSet resultSet = st.executeQuery();
            connection.rollback();
            ArrayList<Money> moneyResult = mapingToMoneyIObject(resultSet);
            System.out.println(moneyResult);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        } finally {
            connection.close();
        }
    }

    public static ArrayList<Money> mapingToMoneyIObject(ResultSet resultSet) throws SQLException {
        ArrayList<Money> list = new ArrayList<>();
        while (resultSet.next()){
            Money money = new Money();
            money.setAmount(resultSet.getInt("amount"));
            money.setNaminal(resultSet.getString("naminal"));
            money.setValuta(resultSet.getString("valuta"));
            list.add(money);
        }
        return list;
    }
}
