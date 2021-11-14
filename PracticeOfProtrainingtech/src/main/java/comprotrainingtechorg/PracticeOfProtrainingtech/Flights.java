package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.qatarairways.com/en/homepage.html");
        driver.manage().window().maximize();
        WebElement buttod=driver.findElement(By.xpath("(//*[text()='Close'])[1]"));
        buttod.click();
        Thread.sleep(2000);
        WebElement dt=driver.findElement(By.xpath("(//*[@class='qr-datepicker active d-flex'])[1]"));
        dt.click();
        Thread.sleep(6000);
        WebElement departure=driver.findElement(By.xpath("//*[@aria-label='6 November 2021']"));
        departure.click();
        WebElement returned=driver.findElement(By.xpath("//*[@aria-label='26 November 2021']"));
        returned.click();
        

	}

}
