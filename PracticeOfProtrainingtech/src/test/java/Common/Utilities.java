package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Utilities {
	public WebDriver driver;

  @Parameters({"browser","URL"})
  @BeforeClass
  public void beforeClass(String NameOfBrowser, String website) {
	  	if(NameOfBrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
		      driver=new ChromeDriver();
		      driver.navigate().to(website);
		      driver.manage().window().maximize();
				
			}else if(NameOfBrowser.equalsIgnoreCase("Firefox")){
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\geckodriver.exe");
			      driver=new FirefoxDriver();
			      driver.navigate().to(website);
			      driver.manage().window().maximize();
			
		}else if(NameOfBrowser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\msedgedriver.exe");
		    driver=new EdgeDriver();
		    driver.navigate().to(website);
		    driver.manage().window().maximize();
		}
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  public void ShotOfPages() throws IOException {
		Date dt=new Date();
		String di=dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(di);
		File Shotsof  =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileHandler.copy(Shotsof, new File("C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Pictures\\Amazon_"+di+".png"));
		  
		
	}

}
