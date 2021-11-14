package comprotrainingtechorg.PracticeOfProtrainingtech;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Common.Utilities;
import PageObjectClasses.HomeOfFacebook;

public class Property extends Utilities {
  @Test
  public void f() throws IOException, InterruptedException {
	  Properties pro=new Properties();
	  FileInputStream obj=new FileInputStream("C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\src\\Production.properties");
	  pro.load(obj);
	String id=  pro.getProperty("Ids");
	String ds=  pro.getProperty("Psswd");
	  
	  HomeOfFacebook ob=new HomeOfFacebook(driver);
	  ob.EmailFieldSendKeys(id);
	  ob.PsswdFieldSendKeys(ds);
	  ob.clickloginbutton();
	  Thread.sleep(6000);
	  driver.find
  }
}
