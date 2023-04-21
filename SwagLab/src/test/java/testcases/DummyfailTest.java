package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utility.BaseClass;

public class DummyfailTest extends BaseClass {
	
	@Test
void FailTestExample()
{
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	LoginPage login=new LoginPage(driver);
	login.setUserName("user");
	login.setPassword("pass");
	login.clickLoginButton();
	System.out.println("login");
	 // we are verifying that we logged in successfully
	boolean res =driver.findElement(By.xpath("//div[@class='login_logo']")).isDisplayed();
	Assert.assertTrue(res);// if its true test wil pass other wise test wil fail
}

}
