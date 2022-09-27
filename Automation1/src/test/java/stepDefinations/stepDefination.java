package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
	 @Given("^User is on NetBanking landing page$")
	    public void User_is_on_NetBanking_landing_page() throws Throwable {
		 System.out.println("navigated to login url");
   //    throw new io.cucumber.java.PendingException();
	    }

	   @Given("^validate the browser$")
	    public void validate_the_browser() throws Throwable {
		   System.out.println("deciding browser to open");
	//        throw new PendingException();
	    }

	    @When("^browser is triggered$")
	    public void browser_is_triggered() throws Throwable {
	    	 System.out.println("browser is triggered");
//	        throw new PendingException();
	    }

	    @Then("^check if browser is started$")
	    public void check_if_browser_is_started() throws Throwable {
	    	 System.out.println("browser is started");
	//        throw new PendingException();
	    }


	    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	     System.out.println(strArg1);
	     System.out.println(strArg2);
	  //  	throw new PendingException();
	    }

	    @Then("^Home page is populated$")
	    public void Home_page_is_populated() throws Throwable {
	    	 System.out.println("validate home page");
	//    	   throw new io.cucumber.java.PendingException();
	    }


	    @And("^Cards are displayed \"([^\"]*)\"$")
	    public void cards_are_displayed_something(String strArg1) throws Throwable {
	    	 System.out.println(strArg1);
//	        throw new PendingException();
	    }

	    @When("^User signup with following details$")
	    public void user_signup_with_following_details(DataTable data) throws Throwable {
	    
	     List<List<String>> obj=data.asLists();
	   System.out.println(obj.get(0).get(0));
	   System.out.println(obj.get(0).get(1));
	  System.out.println(obj.get(0).get(2));
       System.out.println(obj.get(0).get(3));
       System.out.println(obj.get(0).get(4));
//	        throw new PendingException();
	    }


	    @When("^User login in to application with (.+) and Password (.+)$")
	    public void user_login_in_to_application_with_and_password(String username, String password) throws Throwable {
	    	 System.out.println(username);
	    	 System.out.println(password);
	    	//	        throw new PendingException();
	}
}    

	


