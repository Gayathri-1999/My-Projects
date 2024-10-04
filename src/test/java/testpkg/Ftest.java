package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Floginpage;

public class Ftest {

	
	
		WebDriver driver;
		@BeforeTest
		public void Setup()
		{
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
		}
		
		@Test
		
		public void testlogin()
		{
			Floginpage ob = new Floginpage(driver);
			ob.Setvalues("ghd@gmail.con", "abc123");
			ob.login();
		}
		
	}

