package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.FilterByNamePage;
import pages.LoginPage;
import utility.BaseClass;

//Verify Product Filter By Name

public class FilterByNameTestCase extends BaseClass{
	
	@Test
	
	public void FilterByName()
	{
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		LoginPage login=new LoginPage(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickLoginButton();
		System.out.println("login before Filter");
		
		FilterByNamePage fn=new FilterByNamePage(driver); 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		fn.NameAtoZ();
		
		fn.NameZtoA();
	}

}
