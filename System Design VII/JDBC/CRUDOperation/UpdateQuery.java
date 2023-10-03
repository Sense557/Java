package CRUDOP;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import in.JDBCUtil.JDBCUtil;

public class UpdateQuery {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCUtil.getJdbcConnection();
            String sqlInsertQuery = "update student set result=? where id=?";

            if (connection != null) {
            	Scanner scan = new Scanner(System.in);
                preparedStatement = connection.prepareStatement(sqlInsertQuery);

                if (preparedStatement != null) {
                	System.out.println("Enter the id which you want to update");
                	int id = scan.nextInt();
                	
                	System.out.println("Enter the updated result");
                	String result = scan.next();
                	
                	preparedStatement.setString(1, result);
                	preparedStatement.setInt(2, id);
                	
                	
                	
                	
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
