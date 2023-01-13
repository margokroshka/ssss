import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertMoney {
    public static void main(String[] args) {
        Connection connection = null;
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost/my_base", "postgres", "root");
            connection.setAutoCommit(false);
                Statement statement = connection.createStatement();
                int rows = statement.executeUpdate("INSERT Products(ProductName, Price) VALUES ('iPhone X', 76000)," +
                        "('Galaxy S9', 45000), ('Nokia 9', 36000)");
                System.out.printf("Added %d rows", rows);

        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
    }
}
