package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {@FindBy (xpath="//input[@id='ap_customer_name']")
private WebElement Username;

@FindBy (xpath="//input[@id='ap_email']")
private WebElement mobileNo;

@FindBy (xpath="//input[@id='ap_password']")
private WebElement Password;

@FindBy (xpath="//input[@id='ap_password_check']")
private WebElement PasswordAgain;

@FindBy (xpath="//a[@class='a-link-emphasis'])[1]")
private WebElement signin;
public Registration(WebDriver driver)
{
PageFactory.initElements(driver, this);
}
public void CreateAcc()
{
	mobileNo.sendKeys("chetan");
	Password.sendKeys("chetan");
	PasswordAgain.sendKeys("chetan");
}

public void signin()
{
	signin.click();
}

}
