package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpg {
	WebDriver land;
	public landingpg(WebDriver hello)
	{
		land=hello;
	}
	
	public WebElement login1() throws InterruptedException
	{
	 WebElement e = land.findElement(By.xpath("//a[contains(text(),'Log in')]"));
	e.click();
	Thread.sleep(2000);
	
	
	return e;
	}
	
}
