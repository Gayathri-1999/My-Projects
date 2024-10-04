package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepkg.OrangeBase;

public class OrangeLogin extends OrangeBase {

	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"txtUsername\"]")
	WebElement Username;
	
	@FindBy(xpath="//*[@id=\"txtPassword\"]")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"frmLogin\"]/div[4]/button")
	WebElement Login;
	
	public OrangeLogin (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void Action() {
		
		
		Username.sendKeys("Admin");
		Password.sendKeys("Anr@7UP5Gs");
		Login.click();
	}
	
}
