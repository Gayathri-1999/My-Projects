package pagepkg;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pgeproject {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/nav/div[1]/ul/li[8]/a")
	WebElement Signuppage;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/form/div[1]/input")
	WebElement Signupusername;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/form/div[2]/input")
	WebElement Signuppassword;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[3]/button[2]")
	WebElement Signupbutton;
	
	@FindBy(xpath="/html/body/nav/div[1]/ul/li[5]/a")
	WebElement Loginpage; 
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/input")
	WebElement Logusername; 
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[2]/input")
	WebElement Logpassword;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[2]")
	WebElement Logbutton;
	
	@FindBy(xpath="/html/body/nav/div[1]/ul/li[1]/a")
	WebElement Homepg;
	
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a")
	WebElement product;
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div[2]/div/a")
	WebElement Addtocart;
	
	@FindBy(xpath="/html/body/nav/div/div/ul/li[4]/a")
	WebElement cart;
	@FindBy(xpath="/html/body/div[6]/div/div[2]/button")
	WebElement placeorder;
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement name;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[2]/input")
	WebElement country;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[3]/input")
	WebElement city;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[4]/input")
	WebElement creditcard;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[5]/input")
	WebElement month;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[6]/input")
	WebElement yr;
	@FindBy(xpath="/html/body/div[3]/div/div/div[3]/button[2]")
	WebElement purchasebtn;
	
	@FindBy(xpath="/html/body/nav/div/div/ul/li[3]/a")
	WebElement Aboutus;
	
	@FindBy(xpath="/html/body/nav/div/div/ul/li[2]/a")
	WebElement contactus;
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/form/div[1]/input")
	WebElement contactusemail;
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/form/div[2]/input")
	WebElement contactuname;
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]/form/div[3]/textarea")
	WebElement message;
	@FindBy(xpath="/html/body/div[1]/div/div/div[3]/button[2]")
	WebElement sendmessage;
	
	public Pgeproject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	 public void signuppg()
	   {
	    	Signuppage.click();

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	Signupusername.sendKeys("upt@gmail.com");
	    	Signuppassword.sendKeys("nbg456");

			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	Signupbutton.click();
	    	
		     try {   
	    	Alert a1= driver.switchTo().alert();
			 a1.accept();
		     }catch(NoAlertPresentException e ) {
		    	 System.out.println("Exception is handled");
		    	 
		     }

	    	
		}
	 
	 public void loginbutton()
	    {
		 driver.get(driver.getCurrentUrl());
		 Loginpage.click();
		 Logusername.sendKeys("upt@gmail.com");
		 Logpassword.sendKeys("nbg456");
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Logbutton.click();
		
	    }
	 public void homepage()
	 {
		 driver.get(driver.getCurrentUrl());
		 Homepg.click(); 
		 product.click();
		 Addtocart.click();
		 try {   
		    	Alert a1= driver.switchTo().alert();
				 a1.accept();
			     }catch(NoAlertPresentException e ) {
			    	 System.out.println("Exception is handled1");
			    	 
			     }
		 try {
			 Alert a1= driver.switchTo().alert();
			 a1.accept();
		 }catch(Throwable e) {
			 System.out.println("UnhandledException is handled1");
		 }
	 }
	 
	 public void cartpage()
	 
	 {
		 
		
		 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 try {
			cart.click();
		 }catch(Throwable e) {
			 System.out.println("Exception is handled2"); 
		 }
		 placeorder.click();
		 name.sendKeys("Arya");
		 country.sendKeys("india");
		 city.sendKeys("ernakulam");
		 creditcard.sendKeys("25646554");
		 month.sendKeys("April");
		 yr.sendKeys("2024");
		 purchasebtn.click();
		 try {
			 Alert a1= driver.switchTo().alert();
			 a1.accept();
		 }catch(Throwable e) {
			 System.out.println("UnhandledException is handled3");
	 }
	
	 }
	public void contactpg() {
		 driver.get(driver.getCurrentUrl());
		contactus.click();	
		contactusemail.sendKeys("neena123@gmail.com");
		contactuname.sendKeys("Neena");
		message.sendKeys("error");
		sendmessage.click();
		try {
			 Alert a1= driver.switchTo().alert();
			 a1.accept();
		 }catch(Throwable e) {
			 System.out.println("UnhandledException is handled4");
		 }
	}
	
public void aboutuspg() {
		
		Aboutus.click();
		try {
		Alert a1= driver.switchTo().alert();
		 a1.dismiss();
		}catch(NoAlertPresentException e) {
			 System.out.println("UnhandledException is handled5");
		}
		 driver.get(driver.getCurrentUrl());
	
	
	
}
	
	
	
	
	
	
}
