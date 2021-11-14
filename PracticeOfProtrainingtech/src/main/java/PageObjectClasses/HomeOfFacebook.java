package PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOfFacebook {
	WebDriver driver;
@FindBy(xpath = "//*[contains(text(),'Connect with friends ')]") WebElement Tofhome;
@FindBy(name="email") WebElement Email;
@FindBy(name="pass") WebElement Password;
@FindBy(name="login") WebElement loginbutton;
public HomeOfFacebook(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	
	
	
	
}
public String Get() {
String homeoftext=	Tofhome.getText();
return homeoftext;
}
public void EmailFieldSendKeys(String name) {
	Email.sendKeys(name);
}
public void PsswdFieldSendKeys(String names) {
	Password.sendKeys(names);
}
public void clickloginbutton() {
	loginbutton.click();
}
}
