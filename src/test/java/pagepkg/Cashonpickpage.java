package pagepkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cashonpickpage {

	WebDriver driver;
	@FindBy(xpath="/html/body/div[7]/div[1]/div[2]/div[1]")
	WebElement logo; 
	
	@FindBy(xpath="//*[@id=\"auto-searchterms1\"]")
	WebElement Search;
	
	@FindBy(xpath="//*[@id=\"products-pagesize\"]")
	WebElement Drop;
	
	@FindBy(xpath= "/html/body/div[7]/div[1]/div[2]/div[2]/ul[1]/li[1]/a")
	WebElement Sell;
	
	@FindBy(xpath="/html/body/div[7]/div[1]/div[2]/div[2]/ul[1]/li[1]/ul/li[1]/a")
	WebElement Sellmobilephone;
	
	public Cashonpickpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Action()
	{
		logo.click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Sell Used Old Mobile Phones Online in India For The Best Price | CashOnPick";
	    driver.getTitle();
	    System.out.println(actualTitle);
	    if(actualTitle.equals(expectedTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	
	public void Search1()
	{
		Search.sendKeys("Samsung");
		Search.submit();
		Drop.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Select dp= new Select(Drop);
		
		try {
		dp.selectByValue("https://cashonpick.com/search?q=samsung&pagesize=9");
		}catch(NoSuchElementException e) {
			System.out.println("Exception is Handled");
		}
	}
	
	public void Sellmobile()
	{    
		Sell.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
		Sellmobilephone.click();
		}catch(ElementNotInteractableException e) {
			System.out.println("Elementnotinteractable exception is handled");
		}
		String actualTitle = driver.getTitle();
		String expectedTitle = "Sell old Phone online for Best Price, we buy used mobile phone, laptop, macbook, iMac, desktop, Apple iWatch";
	    
	    System.out.println(actualTitle);
	    if(actualTitle.equals(expectedTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	    
	    public void captureScreenshot(WebDriver driver, String screenshotName) throws IOException
	    {
	        try {
	            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	            		 FileHandler.copy(src, new File("./Screenshots/CashonpickScreenshot.png"));
	            		 
	        } catch (IOException e)
	        {
	            System.out.println("Error capturing screenshot: " + e.getMessage());
	        }
	   
	    
		
		
		
	}
}
