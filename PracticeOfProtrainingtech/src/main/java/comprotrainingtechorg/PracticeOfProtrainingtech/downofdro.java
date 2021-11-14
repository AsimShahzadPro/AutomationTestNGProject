package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class downofdro {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement create=driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]"));
        create.click();
        Thread.sleep(6000);
        WebElement Month=driver.findElement(By.name("birthday_month"));
        Select ob=new Select(Month);
        ob.selectByIndex(3);
       // ob.sel
        WebElement day=driver.findElement(By.name("birthday_day"));
       Select ob2=new Select(day);
       ob2.selectByValue("6");
       WebElement Years=driver.findElement(By.name("birthday_year"));
       Select ob6=new Select(Years);
       ob6.selectByVisibleText("1996");
       WebElement it=driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
       it.click();
	}

}
