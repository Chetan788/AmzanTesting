package test1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Base;
import pomClasses.ApplicationHeader;
import util.Utility;



public class VarifyHeaderTab {
	
		WebDriver driver; 
		ApplicationHeader applicationheader;
@Parameters("BrowserName")	
	@BeforeTest
	public void launchBrowser(String browser)
	{
		if( browser.equals("chrome"))
		{
			driver=Base.openchromedriver();
		}
		if( browser.equals("firefox"))
		{
		driver=	Base.openfirefox();
		}
		if( browser.equals("opera"))
		{
			driver=Base.openopera();
		}

		if( browser.equals("edge"))
		{
		driver=	Base.openedge();
		}
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		
	}
	@BeforeClass
	public void createpomclass()
	{
		applicationheader= new ApplicationHeader(driver);
		
	}
	@BeforeMethod
	public void loginoApplication()
	{
	driver.get("https://www.amazon.in/");
	}
	@Test 
	public void varifyBestSeller() throws InterruptedException
	{
		
		  Thread.sleep(2000);
			applicationheader.clickOnBestSeller();
			String url= driver.getCurrentUrl();
			Thread.sleep(2000);
			Assert.assertEquals(url, "https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers", "Missmatched link");

	}
	@Test  
	public void varifyMobile() throws InterruptedException
	{
		
		Thread.sleep(2000);
		applicationheader.clickOnmobiles();
String url1= driver.getCurrentUrl();
Thread.sleep(2000);
//		Assert.assertEquals(url1, "https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles", "Missmatched link");
Assert.assertEquals(url1, "https://www.mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles", "Missmatched link");


	
	}
	@AfterMethod
	public void relounch(ITestResult result) throws IOException, InterruptedException
	
	{
		if (ITestResult.FAILURE==result.getStatus()) 
			Utility.captureScrenshot(driver, 101-01);
		driver.get("https://www.amazon.in/");
	}
	@AfterClass
	public void clearobject()
	{
		applicationheader=null;
	}
	@AfterTest
	public void closedBrowser()
	{
		driver.close();
		driver=null;
		System.gc();
				}
}
