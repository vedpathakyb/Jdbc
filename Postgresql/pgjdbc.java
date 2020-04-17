import java.sql.*;
public class pgjdbc
{
public static void main(String args[])
{
Connection conn=null;
Statement stmt; 
try
{
Class.forName("org.postgresql.Driver");
conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/family","postgres"," ");
stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery("SELECT *FROM AV");
while(rs.next())
{
int id=rs.getInt(1);
String name=rs.getString(2);
int age=rs.getInt(3);
System.out.println(id+" "+name+" "+age);
}
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

