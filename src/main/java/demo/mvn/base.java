package demo.mvn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	public Properties prop;

	
	public WebDriver browserLauncher() throws IOException
	{
		prop = new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\Sarvesh\\Desktop\\JAVA CC\\mvn\\src\\main\\java\\demo\\mvn\\data.properties");
		prop.load(file);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		return driver;
	}
}