package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HP 
{
	WebDriver driver;
	 By UserId = By.xpath("//input[@id='ap_email']");
	 By Continue = By.xpath("//input[@id='continue']");

  //  By Continue = By.id("continue");

	    By password =By.id("ap_password");

	    By submit = By.id("signInSubmit");
	   
	    By navg=By.id("nav-link-accountList");
	    
	    By giftdeal=By.linkText("Gift Cards");

	    By Checkbox=By.xpath("//body/div[@id='a-page']/div[2]/div[2]/div[2]/div[2]/div[1]/div[9]/ul[1]/li[1]/span[1]/a[1]/div[1]/label[1]/i[1]");

	    By Deals=By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]/img[1]");
	    	    By Cart=By.xpath("//input[@id='add-to-cart-button']");
	    	  //button[@id='a-autoid-3-announce']
	    
public HP(WebDriver driver)
{
	  this.driver=driver;
}

public void username(){

    driver.findElement(UserId).sendKeys("8050111825");
}
public void Continue()
{
	driver.findElement(Continue).click();
}
public void Password(){

    driver.findElement(password).sendKeys("Amazon@123");
}
public void submit()
{
	driver.findElement(submit).click();
}
public void GiftDeals()
{
	driver.findElement(giftdeal).click();
}
public void Checkbox()
{
	driver.findElement(Checkbox).click();
}

public void Deals()
{
	driver.findElement(Deals).click();
}
public void Cart()
{
	driver.findElement(Cart).click();
}
}




