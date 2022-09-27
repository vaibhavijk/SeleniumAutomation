package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks{
	
@Before("@MobileTest")
public void beforevalidation()
{
	System.out.println("Before mobile hook");
}
@After("@MobileTest")
public void aftervalidation() 
{
	System.out.println("After mobile hook");
}
@Before("@WebTest")
public void beforWebevalidation()
{
	System.out.println("Before web hook");
}
@After("@WebTest")
public void afterWebvalidation() 
{
	System.out.println("After web hook");
}
}