package comprotrainingtechorg.PracticeOfProtrainingtech;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dragordrop {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait ok=new WebDriverWait(driver, 10);
        driver.switchTo().frame(0);
        ok.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));
        ok.until(ExpectedConditions.visibilityOfElementLocated(By.id("droppable")));
        WebElement dragttoelement=driver.findElement(By.id("draggable"));
        WebElement dropitelements=driver.findElement(By.id("droppable"));
        Actions ob=new Actions(driver);
        ob.dragAndDrop(dragttoelement, dropitelements).build().perform();
        driver.switchTo().parentFrame();
	}

}
