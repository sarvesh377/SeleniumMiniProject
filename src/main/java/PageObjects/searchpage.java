package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class  searchpage {

	WebDriver search;
	
	public searchpage(WebDriver hello)
	{
		search=hello;
	}
	
	public void  searchtask()
	{
		search.findElement(By.id("small-searchterms")).sendKeys("htc");
		search.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
	}
}
