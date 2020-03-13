package beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.sql.*;
import java.util.Calendar;

public class Test implements InitializingBean,DisposableBean {

    private String driverName;
    private String url;
    private String userName;
    private String password;
    private Connection con;
    private String databaseName;

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Class.forName(driverName);
        String url="jdbc:sqlserver://192.168.1.25;databaseName="+databaseName+";user="+userName+";password="+password;
        System.out.println(url);
        con=DriverManager.getConnection(url);

        System.out.println(con.isClosed());
        System.out.println("connection established");
        System.out.println("init method is called ");

    }

    public void saveToDb(String name,String emailId,String Address) throws SQLException {
        PreparedStatement ps=con.prepareStatement("INSERT INTO UserDetails VALUES (?,?,?,?,?)");
        ps.setString(1,name);
        ps.setString(2,emailId);
        ps.setString(3,Address);
        ps.setString(4,"vinay");
        ps.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
        int i=ps.executeUpdate();
        System.out.println(i);
        System.out.println("record inserted successfully");
    }


    public void printStatement(String text){
        System.out.println(text);
    }


    @Override
    public void destroy() throws Exception{
        con.close();
        System.out.println("connection destroyed");
        System.out.println("destroy method is called ");
    }
}
