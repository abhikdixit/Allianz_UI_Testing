package pk_Allianze_UI;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Verify_EditBox_Height_Width {
	@Test
	public void UserName_Height_Width()
	
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Allianz_UI_Testing\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("SIGN-ON")).click();
		String ActUserNameHeight=driver.findElement(By.name("userName")).getCssValue("height");
		System.out.println("Height of UserName=" + ActUserNameHeight);
		String ActUserNameWidth=driver.findElement(By.name("userName")).getCssValue("width");
		System.out.println("Width of UserName=" + ActUserNameWidth);
		Assert.assertEquals(ActUserNameHeight, "22px");
		Assert.assertEquals(ActUserNameWidth, "160.8px");
		driver.quit();
	}

}
