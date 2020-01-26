package testRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseclassRunner;

public class TestRunnerClass extends BaseclassRunner{

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@Test
	public void curefit()
	{
		try
		{
			driver.navigate().to("https://www.cure.fit/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			cure.obj_eatfit.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		

			cure.obj_Wellness.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			cure.obj_Buy.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			cure.obj_cart.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			cure.obj_cart_wrapper.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			WebElement obj_plus_sign = driver.findElement(By.xpath("//img[@class='plus-sign']"));
			for(int i=1;i<10;i++)
			{
				obj_plus_sign.click();
				Thread.sleep(2000);
			}
			cure.obj_cart_checkout.click();
			Thread.sleep(2000);

			cure.obj_sngoogle.click();
			Thread.sleep(2000);


			cure.obj_agree.click();
			Thread.sleep(2000);

			String P_W = driver.getWindowHandle();
			for(String C_W:driver.getWindowHandles())
			{
				driver.switchTo().window(C_W);
			}
	//		cure.new_window.click();

				cure.obj_gmail.sendKeys("mahirssmm28@gmail.com");
				Thread.sleep(1000);

				cure.obj_next.click();
				Thread.sleep(2000);
				
				cure.obj_pwd.sendKeys("mahirsm123@");
				Thread.sleep(2000);
				
				cure.obj_next.click();
				Thread.sleep(1000);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
