package CRUDOP;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import in.JDBCUtil.JDBCUtil;

public class SelectQuery {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Scanner scanner = new Scanner(System.in);

        try {
            connection = JDBCUtil.getJdbcConnection();
            
            if(connection != null) {
                String mysqlQuery = "select * from student where id = ?";
                preparedStatement = connection.prepareStatement(mysqlQuery);
                
                if(preparedStatement != null) {
                    System.out.println("Enter the id which you want to get from Database of MySQL");
                    int id = scanner.nextInt();
                    preparedStatement.setInt(1, id);
                    resultSet = preparedStatement.executeQuery();
                    
                    if(resultSet != null) {
                        if(resultSet.next()) {
                            System.out.println("ID\tNAME\tROLLNO\tRESULT");
                            System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getInt(3)+"\t"+resultSet.getString(4));
                        } else {
                            System.out.println("Record not Found");
                        }
                    }
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
                JDBCUtil.cleanUp(connection, preparedStatement, resultSet);
                System.out.println("Closing my resources");
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
