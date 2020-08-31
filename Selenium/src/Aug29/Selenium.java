package Aug29;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Selenium {
	
	 Connection con ;
	 Statement smt;
	 ResultSet rs;
	 Properties property;
	 FileInputStream fis;
	 WebDriver driver;

	//loading config.Property file. 
	@BeforeSuite
	public void SetUp() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashish\\Desktop\\selenium drivers\\chromedriver_win32\\Chromedriver.exe");
		property=new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\Aug29\\setupConfig.Properties");
		property.load(fis);	
	}
	
	//Data Input in Sql.
	@Test
	public void insert()
	{
		try 
		{
		//Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://" + property.getProperty("hostname") + ":" +  property.getProperty("port")+ "/" +  property.getProperty("database"),  property.getProperty("username"),  property.getProperty("password"));
		smt=con.createStatement();
		String sql="insert into selenium1 values(?,?)";
		PreparedStatement pat=con.prepareStatement(sql);
		pat.setString(1,property.getProperty("user"));
		pat.setString(2,property.getProperty("pass"));
		pat.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	   
	}
	
	//Updating the value.
	//@Test
	public void update()
	{
		try 
		{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://" + property.getProperty("hostname") + ":" +  property.getProperty("port")+ "/" +  property.getProperty("database"),  property.getProperty("username"),  property.getProperty("password"));
		smt=con.createStatement();
		String sql="update selenium1 set pass=? where user=?";
		PreparedStatement pat=con.prepareStatement(sql);
		pat.setString(1,property.getProperty("data1"));
		pat.setString(2,property.getProperty("data2"));
		pat.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	   
	}
	
	
	
	//Deleting data in database.
	//@Test
	public void delete()
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://" + property.getProperty("hostname") + ":" +  property.getProperty("port")+ "/" +  property.getProperty("database"),  property.getProperty("username"),  property.getProperty("password"));
		smt=con.createStatement();
		String sql=" delete from selenium1 where user=?";
		PreparedStatement pat=con.prepareStatement(sql);
		pat.setString(1, property.getProperty("deletion"));
		pat.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	//Fetching data from database and input that values in website.
	//@Test
	public void select() 
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://" + property.getProperty("hostname") + ":" +  property.getProperty("port")+ "/" +  property.getProperty("database"),  property.getProperty("username"),  property.getProperty("password"));
			smt=con.createStatement();
			rs=smt.executeQuery("select * from "+property.getProperty("tablename"));
			if(property.getProperty("browser").contentEquals("chrome"))
			{
				 driver = new ChromeDriver();
			}
			while(rs.next())
			{
				driver.get(property.getProperty("url1"));
				Thread.sleep(2000);
				driver.findElement(By.id("text")).sendKeys(rs.getString("user"));
				Thread.sleep(1000);
				driver.findElement(By.id("password")).sendKeys(rs.getString("pass"));
				Thread.sleep(1000);
				driver.findElement(By.id("login-button")).click();
				Thread.sleep(2000);
				Alert popup=driver.switchTo().alert();
				popup.accept();
				
			}
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}	
		
		driver.close();
		
		
	}
	
	//closing connections.
	//@AfterSuite
	public void end() 
	{
		
		try {
			con.close();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
