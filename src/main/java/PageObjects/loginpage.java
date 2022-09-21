package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

	WebDriver loginpage;
	
	public  loginpage(WebDriver hello)
	{
		loginpage=hello;
	}
	
	public void logintestfield() throws InterruptedException
	{
		loginpage.findElement(By.id("Email")).sendKeys("updatesremark@gmail.com"); 
		loginpage.findElement(By.id("Password")).sendKeys("sam987987");
		loginpage.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		Thread.sleep(2000);
	}
	
}
