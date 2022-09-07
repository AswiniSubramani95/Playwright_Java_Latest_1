package StepDefinitions_Productadd;

import Modules.Product_Add;
import Utilities.Testbase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_tx.Thenyall;

public class StepDefinitions_Productadd extends Testbase
{	
	/*
	 * @Before public void launchbrowser() throws InterruptedException {
	 * Testbase.init_browser(); Thread.sleep(2000); }
	 * 
	 * @After public void quitbrowser() { browser.close(); }
	 */
    
	@Given("^Go to the Login page$")
	public void go_to_the_Login_page() throws Throwable 
	{  
	   Testbase.init_browser(); Thread.sleep(2000);
	   Product_Add.Launchtheurl();
	   Thread.sleep(2000);
	}

	@When("^Enter the valid emailaddress$")
	public void enter_the_valid_developer_skunexus_com() throws Throwable 
	{
		Product_Add.Enteremailaddress();
	}

	@And("^Enter the valid password$")
	public void enter_the_valid_ChangeMe() throws Throwable 
	{
		Product_Add.Enterpassword();
	}

	@And("^Click on the Login button$")
	public void click_on_the_Login_button() throws Throwable 
	{
		Product_Add.clickonloginbtn();
		Thread.sleep(2000);
	}
    
	@Given("^Launch the product grid url$")
	public void Launchtheproductgridurl() throws Throwable 
	{
		   Product_Add.GototheProductgrid();
	}
	
	@When("^Click on the add product button$")
	public void Click_on_addproduct() throws InterruptedException
	{
		Product_Add.ClickonAddproduct();
		Thread.sleep(2000);

	} 
	
	@And("^Enter the product name ([^\"]*)$")
	public void enter_the_product_name_PlayAutoTest(String name) throws Throwable 
	{
		Product_Add.Enterproductname(name);
	}

	@And("^Enter the product sku ([^\"]*)$")
	public void enter_the_product_sku_PlayAutoTest(String sku) throws Throwable 
	{
		Product_Add.Enterproductsku(sku);
	}

	@And("^Enter the product Weight ([^\"]*)$")
	public void enter_the_product_Weight(String weight) throws Throwable 
	{
		Product_Add.Enterproductweight(weight);
	}

	@And("^Enter the product description ([^\"]*)$")
	public void enter_the_product_description_PlayAutoTest(String des) throws Throwable 
	{
		Product_Add.Enterproductdes(des);
	}

	@And("^Select the ParentMaster value ([^\"]*)$")
	public void select_the_ParentMaster_value_Yes(String master) throws Throwable 
	{
		Product_Add.SelectParentmaster(master);
	}
	
	@And("^Click on the save button$")
	public void savebtn() throws InterruptedException
	{
		Product_Add.Clicksavebtn();
	}

	@Then("^It displays the success message for adding the product$")
	public void it_displays_the_success_message_for_adding_the_product() throws Throwable 
	{
	  Product_Add.verificationmessage();
	  Thread.sleep(1000);
	}
	    
}
   
	

	