package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinations {
	 WebDriver driver=null;
	 
    @Given("^Browser is open$")
    public void browser_is_open() throws Throwable {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP Xclusive\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	    driver=new ChromeDriver();
    	    driver.navigate().to("http://practice.automationtesting.in/");
    }

    @When("^User clicks on ShopMenu$")
    public void user_clicks_on_shopmenu() throws Throwable {
    	driver.findElement(By.linkText("Shop")).click();
        
    }
    
    @And("^User clicks Home menu button$")
    public void user_clicks_home_menu_button() throws Throwable {
    	driver.findElement(By.linkText("Home")).click();
    }
    
    
    @Then("^Home page has Three Sliders only$")
    public void home_page_has_three_sliders_only() throws Throwable {
    	driver.findElement(By.cssSelector("div[id='n2-ss-6-arrow-next'] img[alt='Arrow']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.cssSelector("div[id='n2-ss-6-arrow-next'] img[alt='Arrow']")).click();    	
    	Thread.sleep(1000);
    	driver.findElement(By.cssSelector("div[id='n2-ss-6-arrow-next'] img[alt='Arrow']")).click();
    	Thread.sleep(1000);
    	driver.close();
    	Thread.sleep(1000);
    }
}
    
