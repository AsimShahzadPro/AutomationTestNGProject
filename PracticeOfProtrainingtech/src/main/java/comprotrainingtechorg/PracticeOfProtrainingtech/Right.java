package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.qatarairways.com/en/homepage.html");
        driver.manage().window().maximize();
        driver.navigate().to("http://deluxe-menu.com/popup-mode-sample.html");
        WebElement picture=driver.findElement(By.xpath("//img[contains(@src,'data-samples/images/popup_pic.gif')]"));
        Actions ob=new Actions(driver);
        ob.contextClick(picture).build().perform();
	}

}
