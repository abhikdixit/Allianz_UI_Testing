package pk_Allianze_UI;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Verify_Text_Color {
	@Test
	public void Sign_On_Text_Color()
	
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Allianz_UI_Testing\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		String ActColorCode=driver.findElement(By.linkText("SIGN-ON")).getCssValue("Color");
		System.out.println("Color code in RGB" + ActColorCode);
		String ExpColorCodeInRGB= "rgb(0, 0, 238)";
		Assert.assertEquals(ActColorCode, ExpColorCodeInRGB);
		//driver.quit();

	}

}
