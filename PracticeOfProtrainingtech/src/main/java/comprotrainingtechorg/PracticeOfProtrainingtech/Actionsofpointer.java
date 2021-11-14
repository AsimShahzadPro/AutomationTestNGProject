package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsofpointer {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        WebElement signtodrop=driver.findElement(By.xpath("//*[text()='Hello, Sign in']"));
        Actions ob=new Actions(driver);
        Thread.sleep(6000);
        ob.moveToElement(signtodrop).build().perform();
        Thread.sleep(6000);
        WebElement browserto=driver.findElement(By.linkText("Kindle Unlimited"));
        ob.moveToElement(browserto).click().build().perform();
        
        
        
	}

}
