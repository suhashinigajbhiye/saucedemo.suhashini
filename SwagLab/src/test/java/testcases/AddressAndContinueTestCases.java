package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.AddressAndContinuePage;
import pages.LoginPage;
import utility.BaseClass;

public class AddressAndContinueTestCases extends BaseClass {
	
	@Test
	
	void AddressAndContinue()
	{
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage login=new LoginPage(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickLoginButton();
		System.out.println("login before address");
		
		
		
		AddressAndContinuePage ac= new AddressAndContinuePage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ac.AddToCart1();
		
		ac.shopping_cart();
		
		ac.Checkout();
		
		ac.YourInfoisDisplayed();
		
		ac.FirstName("Suhashini");
		
		ac.LastName("Gajbhiye");
		
		ac.PstalCode("34562");
		
		ac.Continue();
		
		ac.CancelisDisplayed();
		System.out.println("Enter adress and continued");
	}
	
	
	

}
