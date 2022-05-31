package test1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Base;
import pomClasses.Footerstab;

public class VarifyFooter {
	WebDriver driver;
	Footerstab footerstab;
	
@Parameters("BrowserName")
@BeforeTest
public void lounchbrowser(String browser)
{
	if( browser.equals("chrome"))
	{
	driver=	Base.openchromedriver();
	}
	if( browser.equals("firefox"))
	{
		driver=Base.openfirefox();
	}
	if( browser.equals("opera"))
	{
driver=	Base.openopera();
	}
if (browser.equals("edge"))
{
	driver=Base.openedge();
}
	
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


}
@BeforeClass
public void createpomclasses()
{
	footerstab= new Footerstab(driver);
}
@BeforeMethod
public void lounchapplication()
{
	driver.get("https://www.amazon.in/");
}
	@Test
	public void varifyaboutus() throws InterruptedException
	{
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		WebElement w = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='nav_a'])[3]")));
		Thread.sleep(2000);
		footerstab.clickOnAboutUs();
	String url=	driver.getCurrentUrl();
	Thread.sleep(2000);
	Assert.assertEquals(url, "https://www.aboutamazon.in/?utm_source=gateway&utm_medium=footer", "missmatched url");
	}

@Test
public void Varify() throws InterruptedException
{
	Thread.sleep(2000);
	footerstab.clickOncareer();
	Thread.sleep(2000);
	String url=	driver.getCurrentUrl();
	Assert.assertEquals(url, "https://amazon.jobs/en-gb/", "missmatched url");
}
@AfterMethod 
public void homeopage()
{
	driver.get("https://www.amazon.in/");
	
}
@AfterClass
public void clear()
{
	footerstab=null;
}
@AfterTest
public void closebrowser()
{

	driver.close();
	driver=null;
	System.gc();
}
}
