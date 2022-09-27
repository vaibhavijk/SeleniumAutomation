package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {
    WebDriver driver=null;
    
   @Given("^Browser is open$")
   public void browser_is_open() throws Throwable {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP Xclusive\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    
    //driver.manage().window().maximize();
   }
   
   @And("^User is on login page$")
   public void User_is_on_login_page() throws Throwable {
     driver.navigate().to(" https://www.saucedemo.com/");
   }

    @When("^User enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
    driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
    }
    
    @And("^User clicks on login$")
    public void user_clicks_on_login() throws Throwable {
    driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    }
    
    
	/*
	 * @And("^User clicks on logout$") public void user_clicks_on_logout() throws
	 * Throwable {
	 * driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click(); }
	 */
    @Then("^User clicks on logout$")
    public void user_is_navigated_to_home_page() throws Throwable {
    	driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
    	Thread.sleep(3000);
    	 driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
    	//driver.close();
    	//driver.quit();
    }
}

  