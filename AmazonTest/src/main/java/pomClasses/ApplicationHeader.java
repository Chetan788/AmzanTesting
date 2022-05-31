package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {

@FindBy (xpath="//a[@data-csa-c-content-id='nav_cs_bestsellers']")
private WebElement bestsellers;

@FindBy (xpath="//a[@data-csa-c-slot-id='nav_cs_1']")
private WebElement mobiles;

@FindBy (xpath="//a[@data-csa-c-content-id='nav_cs_help']")
private WebElement costomerservices ;

@FindBy (xpath="//a[@data-csa-c-id='amtfqp-f949v6-z9cdzy-emskjg']")
private WebElement todaysdeal ;

@FindBy (xpath="//a[@data-csa-c-content-id='nav_cs_fashion']")
private WebElement fashion ;


public ApplicationHeader(WebDriver driver)
{
PageFactory.initElements(driver, this);
}
public void clickOnBestSeller()
{
	bestsellers.click();
}

public void clickOnmobiles()
{
	mobiles.click();
}

public void clickOncostomerservices()
{
	costomerservices.click();
}

public void clicktodaysdeal()
{
	todaysdeal.click();
}

public void fashion()
{
	fashion.click();
}

}
