package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class aftersearch {
WebDriver aftersearch;
public  aftersearch(WebDriver hello)
{
	aftersearch=hello;
}
public void selectmobile() throws InterruptedException
{
	aftersearch.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/h2[1]/a[1]")).click();
	Thread.sleep(5000);
}
}
