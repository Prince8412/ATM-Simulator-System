package bank.management.system;
import java.sql.*;


public class conn {
    
    Connection c;
    Statement s;

    public conn(){ // here we are making constructor to make the object of the class
        try{ // here we are adding exceptional handling because MySql is an external entity that's why there are some possibilities of error
//            Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Qwerty@123");
            
            s = c.createStatement();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
