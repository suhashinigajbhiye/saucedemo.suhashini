package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectProductByImagePage {
	
	WebDriver ldriver;
	 public SelectProductByImagePage(WebDriver driver)
	{

		ldriver=driver;
		PageFactory.initElements( driver, this);
	}
	//Product Select By Image
		
		@FindBy(xpath="//img[@alt='Sauce Labs Bike Light']")
		WebElement ImgBikeLightElement;
		
		@FindBy(id="add-to-cart-sauce-labs-bike-light")
		WebElement AddToCartElement1;
		
		public void BikeLights()
		{
			ImgBikeLightElement.click();
		}
		
		public void AddToCart1()
		{
			AddToCartElement1.click();
		}
	
	

}
