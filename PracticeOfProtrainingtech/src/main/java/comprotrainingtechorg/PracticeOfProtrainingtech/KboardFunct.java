package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KboardFunct {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Computer");
        Actions ob = new Actions(driver);
        ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        ob.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
       search.clear();
       search.click();
       Thread.sleep(6000);
       ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        
	}

}
