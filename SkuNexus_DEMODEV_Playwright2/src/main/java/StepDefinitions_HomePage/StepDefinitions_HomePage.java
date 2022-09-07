package StepDefinitions_HomePage;

import Modules.HomePage_DEMODEV;
import Utilities.Testbase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_tx.Thenyall;

public class StepDefinitions_HomePage extends Testbase
{	
	@Before
	public void launchbrowser() throws InterruptedException
	{
        Testbase.init_browser();
 	    Thread.sleep(2000);
	}
	
	@After
	public void quitbrowser()
	{
		browser.close();
	}
    
	@Given("^Go to the Login page$")
	public void go_to_the_Login_page() throws Throwable 
	{
	   HomePage_DEMODEV.Launchtheurl();
	   Thread.sleep(2000);
	}

	@When("^Enter the valid emailaddress ([^\"]*)$")
	public void enter_the_valid_developer_skunexus_com(String Email) throws Throwable 
	{
		HomePage_DEMODEV.Enteremailaddress(Email);
	}

	@And("^Enter the valid password ([^\"]*)$")
	public void enter_the_valid_ChangeMe(String Pass) throws Throwable 
	{
		HomePage_DEMODEV.Enterpassword(Pass);
	}

	@And("^Click on the Login button$")
	public void click_on_the_Login_button() throws Throwable 
	{
		HomePage_DEMODEV.clickonloginbtn();
	}

	@Then("^The ([^\"]*) login successfully and the dashboard loading properly ([^\"]*)$")
	public void the_Systemadmin_login_successfully_and_the_dashboard_loading_properly_systemadmin(String username, String usertype ) throws Throwable
	{
	    HomePage_DEMODEV.Verifytheloginscenario(username,usertype);
	    Thread.sleep(2000);
	}
	    
}
   
	

	