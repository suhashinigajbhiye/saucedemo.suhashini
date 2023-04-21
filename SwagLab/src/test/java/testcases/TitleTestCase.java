package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.TitlePage;
import utility.BaseClass;

public class TitleTestCase extends BaseClass{

	@Test
	
	void Tiltle()

	{
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		LoginPage login=new LoginPage(driver);
		
		TitlePage tp=new TitlePage(driver);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		tp.TitleisDisplayed();
		System.out.println("Title is Displayed");
		
	}
	
		

	}


