package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterByPricePage {
	
	
	WebDriver ldriver;
	public  FilterByPricePage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements( driver, this);
	}	
		@FindBy(xpath="//option[@value='lohi']")
		WebElement LowToHighElement;

		public void LowToHigh()
		{
			LowToHighElement.click();
		}
		
		
		@FindBy(xpath="//option[@value='hilo']")
		WebElement HighToLowElement;

		public void HighToLow()
		{
			HighToLowElement.click();
		}

}
