import java.sql.*;
class mysqlcon
{
    public static void main(String args[]){
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection
        con=DriverManager.getConnection("jdbc:mysql://localhost:3308/student","root","");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from books");
        while(rs.next())
        System.out.println(rs.getString(1)+"  "+rs.getfloat(2)+"  "rs.getInt(3));
        con.close();

    }
    Catch (Exception e)
    System.out.println(e);
    
}
}
