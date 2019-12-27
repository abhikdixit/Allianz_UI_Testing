package pk_Allianze_UI;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TestNG_Example {
	ChromeDriver driver;
  @Test
  public void FLight_SignOn() {
	  
		driver.findElement(By.partialLinkText("SIGN")).click();
		//driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("testing");
		driver.findElement(By.name("login")).click();
		//*********Below line is to verify whether user has logged in or not
		String ExpectedResult = "SIGN-OF";
		String ActualValue = driver.findElementByLinkText("SIGN-OFF").getText();
		Assert.assertEquals(ExpectedResult, ActualValue);
		//*******Below line to verify Current URL
		String ExpectedURL = "http://newtours.demoaut.com/mercuryreservation.php";
		String ActualURL = driver.getCurrentUrl();
		Assert.assertEquals(ExpectedURL, ActualURL);
		//*******Below line to verify the Title
		String ExpectedTitle = "Find a Flight: Mercury Tours:";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
	  
  }
  @BeforeTest
  public void beforeTest() {
		String absolutePath=System.getProperty("user.dir");
		String filepath=absolutePath+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",filepath);
		
		//System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Allianz_UI_Testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://newtours.demoaut.com/mercurysignon.php");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
