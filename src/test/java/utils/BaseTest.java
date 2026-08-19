package utils;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {
	
	public WebDriver driver;
  
	
  @BeforeMethod
  public void setup() {
	  driver = new ChromeDriver(); //ChromeDriver path set pannum
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
