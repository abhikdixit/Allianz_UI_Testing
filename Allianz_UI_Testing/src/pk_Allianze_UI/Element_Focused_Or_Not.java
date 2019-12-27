package pk_Allianze_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Element_Focused_Or_Not {
@Test(priority=1)
	public void Google_Search_Focus() {
		
	System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Allianz_UI_Testing\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		
		WebElement element = driver.findElement(By.name("q"));
		// Verify Search box is focused or not
		element.equals(driver.switchTo().activeElement());
		driver.quit();
	}

@Test
public void Flight_Edit_Focus() {
	
	System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Allianz_UI_Testing\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.linkText("SIGN-ON")).click();
	WebElement element=driver.findElement(By.name("userName"));
	//WebElement element=driver.findElement(By.name("password"));
	// Verify Edit box is focused or not
	//element.equals(driver.switchTo().activeElement());
	element.equals(driver.switchTo().activeElement());
	
	driver.quit();
}
}
