package pagepkg;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import basepkg.OrangeBase;

public class OrangeMain extends OrangeBase {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"menu_item_101\"]/span")
	WebElement HRadministration;
	
	@FindBy(xpath="//*[@id=\"systemUserDiv\"]/crud-panel/div/div/list/table/tbody/tr[1]/td[1]/label")
	WebElement Checkbox;
	

	@FindBy(xpath="//*[@id=\"menu_item_128\"]/span")
	WebElement Employeemanagement;
	
	@FindBy(xpath="//*[@id=\"employeeListTable\"]/tbody/tr[1]/td[3]/a")
	WebElement Mazie;
	
	@FindBy(xpath="//*[@id=\"topbar-ribbon\"]/div[2]/ui-view/div/div[1]/top-level-menu-item[3]/div/a")
	WebElement job;
	
	@FindBy(xpath="//*[@id=\"employement_details_tab\"]/form/div/oxd-decorator[1]/div/div[9]/oxd-dropdown/div/div/div[2]/div/button/i[2]")
	WebElement Dropdownbutton;
	
	public OrangeMain (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void Main()
	
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		HRadministration.click();
		Checkbox.click();
		Employeemanagement.click();
		Mazie.click();
		job.click();
		Dropdownbutton.click();
		Select sales=new Select(Dropdownbutton);
		sales.selectByValue("Sales");
		
	}
	
	

}
