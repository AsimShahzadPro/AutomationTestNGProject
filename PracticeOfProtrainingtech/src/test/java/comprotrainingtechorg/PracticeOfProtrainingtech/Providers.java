package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.testng.annotations.Test;

import Common.Utilities;
import PageObjectClasses.HomeOfFacebook;

import org.testng.annotations.DataProvider;

public class Providers extends Utilities{
  @Test(dataProvider = "dpi")
  public void f(String n, String s) throws InterruptedException {
	  HomeOfFacebook ob=new HomeOfFacebook(driver);
	  ob.EmailFieldSendKeys(n);
	  ob.PsswdFieldSendKeys(s);
	  ob.clickloginbutton();
	  Thread.sleep(6000);
	  
  }

  @DataProvider
  public Object[][] dpi() {
    return new Object[][] {
      new Object[] { "Pro@gmail.com", "123456" },
      new Object[] { "Training@gmail.com", "asdfghj" },
      new Object[] { "Tech@gmail.com" ,"cdfvbnmj"      },
    };
  }
}
