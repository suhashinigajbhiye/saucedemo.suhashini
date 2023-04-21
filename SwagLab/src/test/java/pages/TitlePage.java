package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TitlePage {

	WebDriver ldriver;
	public TitlePage(WebDriver driver)
	{

		ldriver=driver;
		PageFactory.initElements( driver, this);
	}
	@FindBy(xpath="//div[@class='login_logo']")
	WebElement LogoElement;

	public void TitleisDisplayed()
	{
		LogoElement.isDisplayed();
	}

}
