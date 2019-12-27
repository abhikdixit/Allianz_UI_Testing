package pk_Allianze_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Verify_RadioButton_Checked {
@Test
	public void RadioButton_Checked() {
		
	System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Allianz_UI_Testing\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		driver.navigate().to("http://newtours.demoaut.com/mercurywelcome.php");
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("testing");
		driver.findElement(By.name("login")).click();
		
		//WebElement element = driver.findElement(By.linkText("SIGN-OFF"));
		WebElement triptype=driver.findElement(By.xpath("//input[@value='roundtrip']"));
		Assert.assertEquals(triptype.isSelected(), true);
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		Assert.assertEquals(triptype.isSelected(), false);

		//element.click();
		driver.quit();
	}
}
