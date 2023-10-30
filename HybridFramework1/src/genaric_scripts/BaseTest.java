package genaric_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements FrameWorkConstValues
{
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
		{
			System.setProperty(Chrome_key,Chrome_value);
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
			
	@AfterMethod
	public void closeAppln()
		{
			driver.close();
		}

}



