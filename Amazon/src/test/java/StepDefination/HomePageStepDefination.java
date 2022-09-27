package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.HP;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefination {
	WebDriver driver;
	 HP hp;
	 
		/*
		 * public HomePageStepDefination(WebDriver driver) { this.driver=driver;
		 * 
		 * }
		 */
	@Given("Landing on amazon website")
	public void landing_on_amazon_website() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP Xclusive\\Downloads\\chromedriver_win32\\chromedriver.exe");
 	    driver = new ChromeDriver();
 	    driver.navigate().to("https://amazon.in/");

	}
	@When("User login into application with {string} and click on cont")
	public void user_login_into_application_with_and_click_on_cont(String string) {
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
//		driver.findElement(By.xpath("//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[@id='nav-flyout-accountList']/div[2]/div[1]/div[1]/div[1]/a[1]/span[1]")).click();
	  HP hp=new HP(driver);
	  hp.username();
	  hp.Continue();
	}
	
	@Then("User clicks on password with {string} click on cont")
	public void user_clicks_on_password_with_click_on_cont(String string) {
	   HP hp=new HP(driver);
	   hp.Password();
	   hp.submit();
	}
	@Then("Signin to home page and Select gift deal")
	public void signin_to_home_page_and_select_gift_deal() {
	  HP hp=new HP(driver);
	   hp.GiftDeals();
	   
	}
	@Then("Select the first item from Deals Add the item to the cart")
	public void select_the_first_item_from_deals_add_the_item_to_the_cart() {
		  HP hp=new HP(driver);
		   hp.Checkbox();
		   hp.Deals();
		   hp.Cart();
	}
}
