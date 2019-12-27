package pk_Allianze_UI;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Verify_Button_Should_Be_Image {
	@Test
	public void Button_Image()
	
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Allianz_UI_Testing\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("SIGN-ON")).click();
		String ButtonType=driver.findElement(By.name("login")).getAttribute("type");
		System.out.println(ButtonType);
		Assert.assertEquals(ButtonType, "image");
		driver.quit();

	}

}
