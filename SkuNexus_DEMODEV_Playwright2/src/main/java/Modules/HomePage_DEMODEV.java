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


public class HomePage_DEMODEV extends Testbase
{   
	
	public static String emailid ="//input[@id='email']";
	public static String password ="//input[@id='password']";
	public static String Loginbtn ="//button[@class='btn btn-primary']"; 
    public static String Dashboard  = "//div[@class='mt-3 container-fluid']";	
    public static String username = "//div[@class='src-components-UserName-_styles-module_userName_wVWrS']";
    
    static String LoginScreen = "E:\\Playwright_Screenshot\\Login";
	public HomePage_DEMODEV(Page page)
	{
		this.page = page;
	}
		
	public static void Launchtheurl()
	{
	    page.navigate(prop.getProperty("URL"));
	}
	
	public static void Enteremailaddress(String email)
	{
		page.fill(emailid,email);
	}
	
	public static void Enterpassword(String pass)
	{
		page.fill(password,pass);
	}
	
	public static void clickonloginbtn()
	{
		page.click(Loginbtn);
	}
	
	public static void Verifytheloginscenario(String usertype, String Screenshot) throws InterruptedException
	{	
		Thread.sleep(5000);
		try {
		if(page.isVisible(Dashboard))
		{
			System.out.println("Login successfully");
			String Uname = page.locator(username).textContent();
			System.out.println("Logged in user name is  "+ Uname);
			System.out.println("Logged in user type is "+usertype);
			page.screenshot(new Page.ScreenshotOptions()
				      .setPath(Paths.get(Screenshot)));
		}
        
		else
		{
			System.out.println("Login failed");
			page.screenshot(new Page.ScreenshotOptions()
				      .setPath(Paths.get(Screenshot)));
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
			
}
