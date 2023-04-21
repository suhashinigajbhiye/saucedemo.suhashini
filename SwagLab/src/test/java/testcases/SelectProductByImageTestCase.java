package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SelectProductByImagePage;
import utility.BaseClass;

public class SelectProductByImageTestCase extends BaseClass{
	

	@Test
	void SelectProduct()
	{
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		LoginPage login=new LoginPage(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickLoginButton();
		System.out.println("login before select product");
		
		SelectProductByImagePage sp=new SelectProductByImagePage(driver); 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		sp.BikeLights();
		System.out.println("bike");
		sp.AddToCart1();
		System.out.println("select by image");
		
		
	}
}
