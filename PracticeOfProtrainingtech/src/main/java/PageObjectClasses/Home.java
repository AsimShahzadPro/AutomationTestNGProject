package PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	@FindBy(id = "twotabsearchtextbox") WebElement SearchFieldClick;
	@FindBy(id="nav-search-submit-buttonc") WebElement SearchButtonClick;
	@FindBy(linkText = "Registry") WebElement Registry;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void SearchFieldSendKeys(String name) {
		SearchFieldClick.sendKeys(name);
	}
	public void searchbuttonclicking() {
		SearchButtonClick.click();
	}
	public void RegistryButtonClick() {
		Registry.click();
	}

}
