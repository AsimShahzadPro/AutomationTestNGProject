package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.manage().window().maximize();
        WebElement simplealertclick=driver.findElement(By.name("alert"));
        simplealertclick.click();
        Thread.sleep(6000);
       // driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        Thread.sleep(6000);
        WebElement confirmationofalert=driver.findElement(By.name("confirmation"));
        confirmationofalert.click();
        Thread.sleep(6000);
        driver.switchTo().alert().accept();
        Thread.sleep(6000);
        confirmationofalert.click();
        Thread.sleep(6000);
        driver.switchTo().alert().dismiss();
        WebElement promptofalerts=driver.findElement(By.name("prompt"));
        promptofalerts.click();
        Thread.sleep(6000);
        driver.switchTo().alert().sendKeys("protrainingtech");
        Thread.sleep(6000);
        driver.switchTo().alert().accept();
        
	}

}
