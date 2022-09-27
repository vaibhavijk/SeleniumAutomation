package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenCart{
public WebDriver driver;
public String landingPageProductName;
public String offerPageProductName;

	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() {
	//	System.setProperty("webdriver.chrome.driver","/Users/HP Xclusive/Documents/chromedriver_win32");
		System.setProperty("webdriver.chrome.driver","https://rahulshettyacademy.com/seleniumPractise");
		driver=new ChromeDriver();
		driver .get("https://rahulshettyacademy.com/seleniumPractise");
	    throw new io.cucumber.java.PendingException();
	    
	    
	}
	@When("User searched with shortname {string} and extract actual name of product")
	public void user_searched_with_shortname_and_extract_actual_name_of_product(String shortName) {
	   driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	 String ProductName=   driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
	 System.out.println(ProductName +"is extracted from the home page");
	    throw new io.cucumber.java.PendingException();
	}
	
	
	@Then("\"User searched for {string} shortname in offers page")
	public void user_search_for_same_short_name_in_offers_pages(String shortName) throws InterruptedException {
	 driver.findElement(By.linkText("Top Deals")).click();
	 Set<String> s1=driver.getWindowHandles();
	 Iterator<String> i1=s1.iterator();
	 String parentWindow=i1.next();
	 String childWindow=i1.next();
	 driver.switchTo().window(childWindow);
	 driver. findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	 Thread.sleep(2000);
	 String offerPageProductName=driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	 throw new io.cucumber.java.PendingException();
	}
	
	
	@Then("Validate product name in offers page matches with landing page")
	public void Validate_product_name_in_offers_page()
	{
		Assert.assertEquals(offerPageProductName, landingPageProductName);
	}
}