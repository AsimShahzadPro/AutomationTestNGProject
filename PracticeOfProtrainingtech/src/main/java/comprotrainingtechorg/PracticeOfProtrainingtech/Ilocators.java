package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement PhoneNumberField=driver.findElement(By.name("email"));
        PhoneNumberField.sendKeys("Asim@protrainingtech.com");
        Thread.sleep(6000);
     //   WebElement linktx=driver.findElement(By.linkText("Forgot Password?"));
        //WebElement linktx=driver.findElement(By.partialLinkText("Forgot"));
     //  linktx.click();
       WebElement signinbutton=driver.findElement(By.id("u_0_d_d/"));
       signinbutton.click();
        
	}

}
