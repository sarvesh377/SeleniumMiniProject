package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addtocart {
	WebDriver  Addtocart;
	public Addtocart(WebDriver hello)
	{
		Addtocart=hello;
	}
	
	
	public void addingtocart() throws InterruptedException
	{
		 Addtocart.findElement(By.id("add-to-cart-button-19")).click();
		 Thread.sleep(2000);
		 Addtocart.findElement(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]")).click();
		 Thread.sleep(2000);
		 Addtocart.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
		 Thread.sleep(2000);	 	
	}
	

}

