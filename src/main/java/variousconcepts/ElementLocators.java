package variousconcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {
	WebDriver driver;

	@Before
	public void launchbrowser() {
		// Create Object and Set Property
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		// Set URL
		driver.get("https://objectspy.space/");
		// Maximize
		driver.manage().window().maximize();
		// Delete Cookies
		driver.manage().deleteAllCookies();
		// Define Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void learnElementlocators() {

		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		// Upload a file if you have INPUT tag
		//driver.findElement(By.className("input-file")).sendKeys("");
		
		// Link Text
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
        
		// Navigate Back
		driver.navigate().back();
		
		// Partial Link Text
		driver.findElement(By.partialLinkText("TF-API Product Backend")).click();
		
		// CSS Selector
		driver.findElement(By.cssSelector("input#sex-0")).click();
		driver.findElement(By.cssSelector("input[value='3']")).click();
		
		// CSS with multiple attributes
		driver.findElement(By.cssSelector("input[type='radio'][id='exp-3']")).click();
		
		//xPath Absolute/Relative
		
		//Relative xPath
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Selenium is fun");
		
		// xPath for Links
		driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
		
		
	
	
	}
	
	public void tearDown() {
		driver.close();
		driver.quit();
	}


}
