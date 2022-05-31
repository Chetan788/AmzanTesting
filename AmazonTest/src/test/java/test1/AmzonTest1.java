package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.ApplicationHeader;


public class AmzonTest1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\study\\selinium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//test case1
	driver.get("https://www.amazon.in/");
	 ApplicationHeader applicationheader= new ApplicationHeader(driver);
	applicationheader.clickOnBestSeller();
	String url= driver.getCurrentUrl();
	String title=driver.getTitle();
	if(url.equals("https://www.amazon.in/gp/bestsellers/?ref_=nav_cs_bestsellers")&& title.equals("Amazon.in Bestsellers: The most popular items on Amazon"))
	{
		System.out.println("Pass"); 
	}
	else
	{
		System.out.println("fail");
	}
System.out.println("Eefxchx");

	//test case2
			driver.get("https://www.amazon.in/");
			 applicationheader= new ApplicationHeader(driver);
			applicationheader.clickOnmobiles();
		url= driver.getCurrentUrl();
			title=driver.getTitle();
			if(url.equals("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles")&& title.equals("Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in"))
			{
				System.out.println("Pass"); 
			}
			else
			{
				System.out.println("fail");
			}
	//test case3
		driver.get("https://www.amazon.in/");
		 applicationheader= new ApplicationHeader(driver);
		applicationheader.clickOncostomerservices();
		 url= driver.getCurrentUrl();
		title=driver.getTitle();
		if(url.equals("https://www.amazon.in/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help")&& title.equals("Help - Amazon Customer Service"))
		{
			System.out.println("Pass"); 
		}
		else
		{
			System.out.println("fail");
		}
	
	
	
	driver.close();
	
	
	}

}
