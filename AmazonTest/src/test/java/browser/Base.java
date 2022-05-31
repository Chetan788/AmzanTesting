package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {
	public static WebDriver openchromedriver()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\study\\selinium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		return driver;
	}
	public static WebDriver openfirefox()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\study\\g\\New folder\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		return driver;
	}
	public static WebDriver openopera()
	{
		System.setProperty("webdriver.opera.driver", "E:\\study\\opera\\operadriver_win64\\operadriver.exe");
		 WebDriver driver=new OperaDriver();
		return driver;
	}
	public static WebDriver openedge()
	{
		System.setProperty("webdriver.edge.driver", "E:\\study\\edgekey\\msedgedriver.exe");
		 WebDriver driver=new EdgeDriver();
		return driver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
