package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.YourCartPage;
import utility.BaseClass;

public class YourCartTestCases extends BaseClass {
	
	
	
	@Test
	
	void YourCart()
	{

		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		LoginPage login=new LoginPage(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickLoginButton();
		System.out.println("cart ");
		
		
		YourCartPage yc= new YourCartPage(driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		yc.AddToCart();
		
		yc.shopping_cart();
		
		yc.Title();
		
		yc.ItemName();
		
		
		yc.Checkout();
		System.out.println("cart 1 ");
		
	}
	

}
