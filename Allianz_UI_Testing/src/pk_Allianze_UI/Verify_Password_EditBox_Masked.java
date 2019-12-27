package pk_Allianze_UI;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Verify_Password_EditBox_Masked {
	@Test
	public void Verify_Password_Masked()
	
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Allianz_UI_Testing\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String PasswordMasked=driver.findElement(By.name("pass")).getAttribute("type");
		System.out.println(PasswordMasked);
		Assert.assertEquals(PasswordMasked, "password");
		driver.quit();

	}

}
