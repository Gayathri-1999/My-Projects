package basepkg;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class OrangeBase {
	
	public static WebDriver driver;

    @BeforeClass

    public void preCondition() throws InterruptedException

    {
    	

                driver = new ChromeDriver();
                
                Thread.sleep(4000);
              

                driver.get("https://gayathriv-trials714.orangehrmlive.com/auth/seamlessLogin");
                
               
                
              
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

    }

    @AfterClass

    public void postCondition() 

    {

               // driver.quit();

    }
	

}
