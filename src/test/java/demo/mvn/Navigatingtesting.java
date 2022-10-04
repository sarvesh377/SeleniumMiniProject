package demo.mvn;

import java.io.IOException;

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
	public void test1() throws InterruptedException, IOException {
	
	  hello = browserLauncher();
	 hello.get(prop.getProperty("url"));
	 
	 
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
