package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsOfBrowser {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Webdriver interface 
		//Set the chrome driver path
		//how to open
		//how to open the site in chrome
		//how to refresh the browser
		//how to go back
		//how to move forward
		//how to maximize 
		//how to close
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
       // driver.get("https://www.facebook.com");
        driver.navigate().refresh();
        Thread.sleep(6000);
        driver.navigate().back();
        Thread.sleep(6000);
        driver.navigate().forward();
        driver.manage().window().maximize();
        Thread.sleep(6000);
        driver.close();
	}

}
