package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.PageObjectClass;

public class BaseclassRunner {

	public static WebDriver driver = null;
	public static PageObjectClass cure = null;

	public static void initialization() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Library\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		cure = new PageObjectClass(driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

}
