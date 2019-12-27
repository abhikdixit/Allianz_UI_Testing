package pk_Allianze_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handle_Window_Alert {
	ChromeDriver driver;	
	@Test()
	public void HDFCLAlert() throws Exception
	{
			
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		 driver.switchTo().frame("login_page");
		 driver.findElement(By.xpath("//img[@alt='continue']")).click();
		String ExpTest = driver.switchTo().alert().getText();
		System.out.println(ExpTest);
		Assert.assertEquals("Customer ID  cannot be left blank.", ExpTest);
		driver.switchTo().alert().accept();
		
	}

@BeforeTest
public void LaunchBrowser() {
	System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Allianz_UI_Testing\\chromedriver.exe");
	driver = new ChromeDriver();
}

@AfterTest
public void CloseBrowser() {
	  driver.quit();
}

}
