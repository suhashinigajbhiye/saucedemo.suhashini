package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import pages.FilterByPricePage;
import pages.LoginPage;
import utility.BaseClass;

//Verify Product Filter By Price
public class FilterByPriceTestCase extends BaseClass {
	
	@Test
	public void FilterByPrice()
	{
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	LoginPage login=new LoginPage(driver);
	login.setUserName("standard_user");
	login.setPassword("secret_sauce");
	login.clickLoginButton();
	System.out.println("login before Filter");
	
	FilterByPricePage fp=new FilterByPricePage(driver); 
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	fp.LowToHigh();
	
	fp.HighToLow();
	
	}

}
