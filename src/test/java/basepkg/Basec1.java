package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Basec1 {
	
	 public static WebDriver driver;

     @BeforeClass

     public void preCondition()

     {

                 driver = new ChromeDriver();

                 driver.get("https://www.saucedemo.com/");


                 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

     }

     @AfterClass

     public void postCondition() 

     {

                // driver.quit();

     }


}
