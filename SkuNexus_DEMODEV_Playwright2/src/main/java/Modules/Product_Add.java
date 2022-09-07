package Modules;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import Utilities.Testbase;


public class Product_Add extends Testbase
{   
	static String productURL = "https://demo-dev.skunexus.com/products";
	public static String emailid = "//input[@id='email']";
	public static String password ="//input[@id='password']";
	public static String Loginbtn ="//button[@class='btn btn-primary']"; 
	public static String Productbtn = "text=Add Product";
	public static String Productname = "//input[@id='name']";
	public static String Productsku = "//input[@id='sku']";
	public static String Productweight = "//input[@id='weight']";
	public static String Productdescription = "//textarea[@id='description']";
	public static String Parentmaster = "#react-select-8-input";
	public static String Savebtn = "text=Save";    
    static String LoginScreen = "E:\\Playwright_Screenshot\\Login";
    public static String notification ="//div[@class='notification-message']";
    public static String ProductName;
    
	public Product_Add(Page page)
	{
		this.page = page;
	}
		
	
	public static void Launchtheurl()
	{
	    page.navigate(prop.getProperty("URL"));
	}
	public static void Enteremailaddress()
	{
		page.fill(emailid,"developer@skunexus.com");
	}
	
	public static void Enterpassword()
	{
		page.fill(password,"ChangeMe2021!");
	}
	
	public static void clickonloginbtn()
	{
		page.click(Loginbtn);
	}
	
	public static void GototheProductgrid()
	{
	    page.navigate(productURL);
	}
	
	public static void ClickonAddproduct() throws InterruptedException
	{
	    page.locator(Productbtn).click();
	    Thread.sleep(2000);
	}
	
	public static void Enterproductname(String name)
	{   
	    page.fill(Productname,name);
	    ProductName = name;
	}
	
	public static void Enterproductsku(String sku)
	{   
	    page.fill(Productsku,sku);
	}
	
	public static void Enterproductweight(String weight) throws InterruptedException
	{   
	    page.fill(Productweight,weight);
	    Thread.sleep(1000);

	}
	
	public static void Enterproductdes(String des)
	{   
	    page.fill(Productdescription,des);
	}
	

	public static void SelectParentmaster(String value)
	{
	    page.locator(Parentmaster).fill(value);
	    page.locator(Parentmaster).press("Tab");
	}
	
	public static void Clicksavebtn() throws InterruptedException
	{
	    page.locator(Savebtn).click();
	    Thread.sleep(3000);
	}
	
	public static void verificationmessage()
	{
		 String Notification = page.locator(notification).innerText();
		 if(Notification.equals("Saving product is succeeded."))
		 {
			 System.out.println(ProductName+" is "+Notification);
		 }
		 else
		 {
			 System.out.println(ProductName+" is "+Notification);
		 }
		 
	}
	
  
}
