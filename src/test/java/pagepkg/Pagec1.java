package pagepkg;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Pagec1 {

	WebDriver driver;
	
	
		By loginBtn=By.name("login-button");
	  
	    By Username =By.id("user-name");
	    
	    By pswd=By.id("password");
	    
	    By cart=By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div/div/button");
	    
	    public Pagec1(WebDriver driver)

	    {

	               this.driver=driver;

	    }
	    
	    public void values(String UN, String PD) {
			

           driver.findElement(Username).sendKeys(UN);
           driver.findElement(pswd).sendKeys(PD);
			
			
		}
	    
	    public void clickLoginBtn()

	    {
	    	 driver.findElement(loginBtn).click();
	                

	    }
	    
	    public void cart()
	    
	    {
	    	
	    	
	    	driver.findElement(cart).click();
	    }
	
	
	
}
