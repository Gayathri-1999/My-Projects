package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Verifysignup {
	
	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
	}
	@org.testng.annotations.Test
	public void Test()
	{
		Pgeproject ob= new Pgeproject(driver);
	     ob.signuppg();
	     ob.loginbutton();
	     ob.homepage();
	     ob.cartpage();
	     ob.contactpg();
	     ob.aboutuspg();
	}
	

}
