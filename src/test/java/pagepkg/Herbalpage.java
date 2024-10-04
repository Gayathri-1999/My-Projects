package pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Herbalpage {
	
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"menu\"]/ul/li[2]/a")
	WebElement Health; 
	
	@FindBy(xpath="//*[@id=\"input-sort\"]")
	WebElement dropdown;
	
	@FindBy(xpath="//*[@id=\"input-sort\"]")
	WebElement AtoZ;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/button/span")
	WebElement Enquiries;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/form/div[2]/div/input")
	WebElement Edit;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/form/div[3]/div/textarea")
	WebElement En;
	
	@FindBy(xpath="//*[@id=\"sendEnquiryModal\"]/div/div/div[3]/button")
	WebElement send;
	
	@FindBy(xpath="//*[@id=\"search\"]/input")
	WebElement search;
	
	public Herbalpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Action()
	{
		
		Health.click();
	}
	public void drop()
	
	{
		dropdown.click();
		Select dp= new Select(dropdown);
		dp.selectByValue("alphabet-asc");
		Enquiries.click(); 
	}
	public void values()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Edit.click();
		Edit.clear();
		Edit.sendKeys("3");
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		En.click();
		En.sendKeys("medicine");
		send.click();
		
	}
	public void refresh()
	{
		driver.get(driver.getCurrentUrl());
		search.click();
		search.sendKeys("Herbal");
	}
 
}
