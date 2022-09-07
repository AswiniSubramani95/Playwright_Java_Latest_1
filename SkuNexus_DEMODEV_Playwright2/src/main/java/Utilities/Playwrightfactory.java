package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Playwrightfactory
{  
	 Playwright playwright;
	 Browser browser;
	 BrowserContext browserContext;
	 protected Properties prop;
	 Page page;

	public Page init_browser(Properties prop)
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
	    
	    return page;
	}
	
	public Properties init_prop()
	{
		try
		{
		FileInputStream fis = new FileInputStream("src\\main\\java\\Properties\\Assessment.Properties");
	    prop = new Properties();
		prop.load(fis);
		}
		catch(Exception e)
		{
				e.getMessage();
		}
		return prop;
	}
}
