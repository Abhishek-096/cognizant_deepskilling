package PLSQL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallStoredProcedure {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/CompanyDB";
        String user = "root";
        String password = "root";

        try {

            Connection con = DriverManager.getConnection(url, user, password);

            CallableStatement cs = con.prepareCall("{call GetEmployee(?)}");

            cs.setInt(1, 101);

            ResultSet rs = cs.executeQuery();

            while (rs.next()) {

                System.out.println("ID : " + rs.getInt("id"));
                System.out.println("Name : " + rs.getString("name"));
                System.out.println("Salary : " + rs.getDouble("salary"));
            }

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
