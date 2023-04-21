package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterByNamePage {
	
	WebDriver ldriver;
	public  FilterByNamePage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements( driver, this);
	}	
		@FindBy(xpath="//option[@value='az']")
		WebElement AToZElement;

		public void NameAtoZ()
		{
			AToZElement.click();
		}
		
		
		@FindBy(xpath="//option[@value='za']")
		WebElement ZToAElement;

		public void NameZtoA()
		{
			ZToAElement.click();
		}
		
		
		
	}


