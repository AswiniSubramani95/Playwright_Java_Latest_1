package Utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import Modules.HomePage_DEMODEV;

public class Testbase 
{   
	 protected static  Properties prop;
	 public static Playwright playwright;
	 public static Browser browser;
	 public static BrowserContext browserContext;
	 protected static Page page;

	 public Testbase()  
		{
			try
			{
		    prop = new Properties();
			FileInputStream fis = new FileInputStream("E:\\Eclipse_Program\\SkuNexus_DEMODEV_Playwright\\src\\main\\java\\Properties\\Assessment.Properties");
			prop.load(fis);
			}
			catch(Exception e)
			{
					e.getMessage();
			}
		}
	 
	public static void init_browser() throws InterruptedException
	{
		System.out.println("Browser name is "+prop.getProperty("browser"));
		String browsername = prop.getProperty("browser"); 
	    playwright = Playwright.create();
		switch(browsername.toLowerCase())
		{
		case "chromium":
			browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;

		case "firefox":
			browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;

		default: 
			System.out.println("Please pass the right browser name");
			break;
		}
		
	    browserContext = browser.newContext();
	    page = browserContext.newPage();
	    page.navigate(prop.getProperty("URL"));
	}
	

}
