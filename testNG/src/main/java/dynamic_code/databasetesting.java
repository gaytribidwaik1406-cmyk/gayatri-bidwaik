package dynamic_code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class databasetesting extends base_class{
	public static ResultSet result;
	public static Statement cs;
	public static Connection connect ;
	public static String host = "localhost";
	public static String portnumber = "3306";

	public static void databasetesting( String databasename , String query) throws Throwable {
		

		String host = "localhost";
		String portnumber = "3306";
		
		connect = DriverManager.getConnection("jdbc:mysql://" + host + ":" + portnumber + "/"+ databasename, "root",
				"gayu2740");
		
		cs = connect.createStatement();

		result = cs.executeQuery(query);
		
		result.next();
	}
	
	public static void colums( String columnname , By locator) throws SQLException {
		System.out.println(result.getString(columnname));
		
		WebElement var = driver.findElement(locator);
		var.click();
		var.sendKeys(result.getString(columnname));
		

	}
	
}


