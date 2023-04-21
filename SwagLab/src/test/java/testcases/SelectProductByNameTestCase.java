package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SelectProductByNamePage;
import utility.BaseClass;

public class SelectProductByNameTestCase extends BaseClass{
	
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
		
		SelectProductByNamePage sp=new SelectProductByNamePage(driver); 
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		sp.TitleisDisplayed();
		
		sp.BackpackName();
		sp.AddToCart();
		sp.RemoveElement();
		System.out.println("select by Name");
	
			
		sp.DetailsElement();
		System.out.println("Details displayed");
		
		
		
		
		
		
		
	}
	
}
