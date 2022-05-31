package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footerstab {
	@FindBy (xpath ="(//a[@class='nav_a'])[1]")
	private WebElement aboutUs; 

	@FindBy (xpath ="(//a[@class='nav_a'])[2]")
	private WebElement career;

	@FindBy (xpath ="(//a[@class='nav_a'])[3]")
	private WebElement pressRelease;
	
	public Footerstab(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}
	public void clickOnAboutUs()
	{
		aboutUs.click();
	}
	public void clickOncareer()
	{
		career.click();
	}
	public void clickOnPressrelease()
	{
		pressRelease.click();
	}
	
	
	
	
	
	
	
}
