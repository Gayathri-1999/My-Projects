package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Floginpage;
import pagepkg.OrangeLogin;
import pagepkg.OrangeMain;

public class Orangetest {
	

		WebDriver driver;
		@BeforeTest
		
		public void Setup()
		{
			driver = new ChromeDriver();
			driver.get("https://gayathriv-trials714.orangehrmlive.com/auth/seamlessLogin");
			driver.manage().window().maximize();
		}
		
        @Test
		
		public void testlogin()
		{
			OrangeLogin ob= new OrangeLogin(driver);
			ob.Action();
			OrangeMain ab = new OrangeMain(driver);
			ab.Main();
			
		}
		
		
		
		
	}
	
	


