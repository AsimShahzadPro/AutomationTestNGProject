package comprotrainingtechorg.PracticeOfProtrainingtech;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        WebElement kindle=driver.findElement(By.linkText("Customer Service"));
        Actions object=new Actions(driver);
        object.keyDown(Keys.SHIFT).build().perform();
        kindle.click();
        object.keyUp(Keys.SHIFT).build().perform();
        //following is action performed on other window
       // WebElement outers=driver.findElement(By.linkText("Author Follow"));
      //  outers.click();
  //    String parentwindowhandle=  driver.getWindowHandle();
     // System.out.println(parentwindowhandle);
     Set<String> Otherwindowhandles= driver.getWindowHandles();
     Iterator<String> iterat=Otherwindowhandles.iterator();
    String FirstWindowHandle= iterat.next();
     String secondwindow=iterat.next();
     System.out.println(FirstWindowHandle);
     System.out.println(secondwindow);
     driver.switchTo().window(secondwindow);
     driver.findElement(By.xpath("(//*[@class='a-box self-service-rich-card'])[2]")).click();
	}

}
