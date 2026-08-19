package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {
  @Test
  public void testValidLogin() {
	  
	  LoginPage lp = new LoginPage(driver);
	  lp.login("standard_user", "secret_sauce");
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
	  
	  
  }
}
