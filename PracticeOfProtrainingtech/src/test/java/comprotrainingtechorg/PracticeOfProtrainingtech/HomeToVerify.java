package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectClasses.HomeOfFacebook;
//import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class HomeToVerify {
	WebDriver driver;
  @Test
  public void f() {
	  HomeOfFacebook ob=new HomeOfFacebook(driver);
	  String TOfHOme=ob.Get();
	  System.out.println(TOfHOme);
	  //Assert.assertEquals("Connect with friends and the world around you on Facebook.", TOfHOme);
	  SoftAssert soft=new SoftAssert();
	  soft.assertEquals("Connect with friends and the world around you on Facebook direct.", TOfHOme);
	  System.out.println("This is after assertion");
	  soft.assertAll();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.navigate().to("https://www.facebook.com");
      driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
