package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbpage {
 
	
	WebDriver driver;
	//Locating Login button
	By loginBtn=By.name("login");
    //Locating Email id Text box
    By emailIdField=By.id("email");
    //Locating password Text box
    By psswd=By.id("pass");

    //Initializing the Objects

    public Fbpage(WebDriver driver)

    {

               this.driver=driver;

    }

//Clicking on Login button

    public void clickLoginBtn()

    {
    	 driver.findElement(loginBtn).click();
                

    }

	public void setvalues(String userName, String pwd) {
		


        driver.findElement(emailIdField).sendKeys(userName);   
        driver.findElement(psswd).sendKeys(pwd);

		
		
	}

}
