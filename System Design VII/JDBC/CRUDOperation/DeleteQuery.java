package CRUDOP;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import in.JDBCUtil.JDBCUtil;

public class DeleteQuery {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCUtil.getJdbcConnection();
            String sqlInsertQuery = "delete from student where id=?";

            if (connection != null) {
            	Scanner scan = new Scanner(System.in);
                preparedStatement = connection.prepareStatement(sqlInsertQuery);

                if (preparedStatement != null) {
                	System.out.println("Enter the id which you want to delete");
                	int id = scan.nextInt();

                	
                	preparedStatement.setInt(1, id);
                	
                	
                	
                	
                    int rowsDeleted = preparedStatement.executeUpdate();
                    System.out.println("Number of rows deleted: " + rowsDeleted);
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
