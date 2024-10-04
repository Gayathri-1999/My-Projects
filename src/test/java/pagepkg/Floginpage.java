package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Floginpage {

	WebDriver driver;
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpassword;
	
	@FindBy(name="login")
	WebElement fblogin;
	
	
	public Floginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Setvalues(String un,String pswd)
	{
		fbemail.sendKeys(un);
		fbpassword.sendKeys(pswd);
	}
	
	public void login()
	{
		fblogin.click();
	}
	
	
	
	
	
	
}
