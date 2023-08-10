package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition
{

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable
	{
	    // Express the Regexp above with the code you wish you had
		
		System.out.println("user is already on Login Page");
	    
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("title of login page is Free CRM");
	    
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("user enters username and password");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		System.out.println("user clicks on login button");
	    
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		System.out.println("user is on home page");
	}

	@Then("^Close the browser$")
	public void Close_the_browser() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		System.out.println("Close the browser");
	    
	}


}
