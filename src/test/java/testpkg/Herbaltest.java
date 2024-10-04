package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import pagepkg.Herbalpage;

public class Herbaltest {

	
	WebDriver driver;
	@BeforeTest
	public void Setup()
	{
		driver = new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
		driver.manage().window().maximize();
	}
	@org.testng.annotations.Test
	public void Test()
	{
		Herbalpage ob= new Herbalpage(driver);
		ob.Action();
		ob.drop();
		ob.values();
		ob.refresh();
	}
	 
	
}
