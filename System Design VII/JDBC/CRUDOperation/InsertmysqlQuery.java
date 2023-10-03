package CRUDOP;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.JDBCUtil.JDBCUtil;

public class InsertmysqlQuery {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCUtil.getJdbcConnection();
            String sqlInsertQuery = "insert into student(name, rollNo, result) values(?, ?, ?)";

            if (connection != null) {
                preparedStatement = connection.prepareStatement(sqlInsertQuery);

                if (preparedStatement != null) {
                    preparedStatement.setString(1, "Chirag");
                    preparedStatement.setInt(2, 12);
                    preparedStatement.setString(3, "P");

                    int rowsUpdated = preparedStatement.executeUpdate();
                    System.out.println("Number of rows updated: " + rowsUpdated);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception ee) {
            ee.printStackTrace();
        } finally {
            try {
                JDBCUtil.cleanUp(connection, preparedStatement, null);
                System.out.println("Closing my resource");
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
