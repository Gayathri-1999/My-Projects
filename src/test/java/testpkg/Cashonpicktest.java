package testpkg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import pagepkg.Cashonpickpage;

public class Cashonpicktest {
	
	
	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		driver = new ChromeDriver();
		driver.get("https://cashonpick.com/");
		driver.manage().window().maximize();
	}
	
	@org.testng.annotations.Test()
	public void Test()
	{
		Cashonpickpage ob = new Cashonpickpage(driver);
		ob.Action();
		ob.Search1();
		ob.Sellmobile();
		
		
		
		
	}
	//@org.testng.annotations.Test()
	//public void Test1(String string) throws IOException
	//{
		//Cashonpickpage ab = new Cashonpickpage(driver);
		//Cashonpickpage.captureScreenshot(driver, string);
		//ab.captureScreenshot(driver, string);
	//}
	
	

}
