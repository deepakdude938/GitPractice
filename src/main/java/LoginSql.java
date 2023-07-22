import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginSql {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		System.out.println("Driver  loaded");
		
	Connection con=		DriverManager.getConnection("jdbc:mysql://localhost:3306/mavenmovies", "root", "Ishu@2205");
	System.out.println("Connected to DB");
	
	Statement b= con.createStatement();
	System.out.println("Statement created");
	
	ResultSet i =	b.executeQuery("select * from actor");
	while(i.next()) {
	String fname=	i.getString("first_name");
	String lname=	i.getString("last_name");
	
	System.out.println(fname+" "+lname);
	}
	
	int rowsaffected =b.executeUpdate("insert into actor(actor_id,first_name,last_name) values(20003,'Salman','Khan')");
		System.out.println(rowsaffected);
		
		
		ResultSet ij =	b.executeQuery("select * from actor");
		while(ij.next()) {
		String fname=	ij.getString("first_name");
		String lname=	ij.getString("last_name");
		
		System.out.println(fname+" "+lname);
		}
	}

}
