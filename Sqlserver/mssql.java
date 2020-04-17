import java.sql.*;
public class mssql
{
public static void main(String args[])
{
Connection conn=null;
Statement stmt; 
try
{
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
conn=DriverManager.getConnection("jdbc:sqlserver://mssql-2016.mw.lab.eng.bos.redhat.com:1433;databaseName=dballo00;user=dballo00;password=dballo00");
stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery("SELECT 'sample'");
System.out.println("Connected");
rs.close();
stmt.close();
conn.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}

