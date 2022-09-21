package demo.mvn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import PageObjects.Addtocart;
import PageObjects.aftersearch;
import PageObjects.landingpg;
import PageObjects.loginpage;
import PageObjects.searchpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigatingtesting extends base {
	WebDriver hello;


@Test
	public void test1() throws InterruptedException {
	//how we are able to call non static without object refernce?
	base a = new base();
	
	// webdriver is assign as datatype becoz contains method/data from webdriver thats y
	  hello = a.browserLauncher();
	 hello.get("https://demo.nopcommerce.com/");
	 
	 
	 landingpg l= new landingpg(hello);
	 l.login1();
		
	 
	 loginpage lp=new loginpage(hello);
	 lp.logintestfield();
	 Thread.sleep(2000);
	 
	 searchpage sp= new searchpage(hello);
	 sp.searchtask();
	 Thread.sleep(2000);	
	 
	 aftersearch as=new aftersearch(hello);
	 as.selectmobile();
	 Thread.sleep(2000);	
	 
	 Addtocart ac=new  Addtocart(hello);
	 ac.addingtocart();
	 Thread.sleep(2000);
	 
	}

@AfterMethod
public void testclosure()
{
	hello.close();
}
}
