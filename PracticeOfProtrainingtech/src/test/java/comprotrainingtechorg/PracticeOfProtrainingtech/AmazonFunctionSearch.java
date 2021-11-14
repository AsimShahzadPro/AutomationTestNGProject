package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.testng.annotations.Test;

import PageObjectClasses.Home;
import PageObjectClasses.Registry;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AmazonFunctionSearch {
	WebDriver driver;
  @Test(priority = 0)
  public void f() {
	  Home ob=new Home(driver);
	  ob.SearchFieldSendKeys("Protrainingtech");
	  ob.searchbuttonclicking();
	  ob.RegistryButtonClick();
	  System.out.println("This is F method");
	  
  }
  @Test(priority = 1,dependsOnMethods = "f")
  public void Register() throws InterruptedException {
	  System.out.println("This is R method");
	  Registry ob6=new Registry(driver);
	  Thread.sleep(6000);
	  ob6.NameFieldSend("Phone");
	  ob6.Sbuttonclicking();
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.navigate().to("https://www.amazon.com");
      driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  
  }

}
