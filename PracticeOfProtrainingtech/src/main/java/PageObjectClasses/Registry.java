package PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registry {
	public WebDriver driver;
	@FindBy(name = "name") WebElement Registrant;
	@FindBy(xpath = "(//*[@aria-label='Search'])[2]") WebElement Sbuttonclick;
	public Registry(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void NameFieldSend(String textof) {
		Registrant.sendKeys(textof);
	}
	public void Sbuttonclicking() {
		Sbuttonclick.click();
	}

}
