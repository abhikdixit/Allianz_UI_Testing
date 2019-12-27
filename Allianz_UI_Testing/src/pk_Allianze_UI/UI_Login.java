package pk_Allianze_UI;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UI_Login {
	@Test
	public void Flight_Sign_On()
	
	{
		
		//String absolutePath=System.getProperty("user.dir");
		//String filepath=absolutePath+"\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver",filepath);
		
		//System.setProperty("webdriver.chrome.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Allianz_UI_Testing\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
  		System.setProperty("webdriver.gecko.driver","D:\\F Drive\\Selenium Training Data\\workspace\\Allianz_UI_Testing\\geckodriver.exe");
  		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://newtours.demoaut.com/mercurysignon.php");
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
		driver.quit();	
		//driver.close();
	}

}
