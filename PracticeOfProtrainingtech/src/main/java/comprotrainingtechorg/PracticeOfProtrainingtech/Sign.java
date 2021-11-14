package comprotrainingtechorg.PracticeOfProtrainingtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sign {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement emailfieldenter=driver.findElement(By.xpath(" //input[@placeholder='Email or Phone Number']"));
        WebElement psswdfieldentered=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
        WebElement Signbuttonclick=driver.findElement(By.xpath("//button[@name='login']"));
        
        /*emailfieldenter.sendKeys("Asim@protrainingtech.com");
        psswdfieldentered.sendKeys("virginia");
        Signbuttonclick.click();*/
        WebElement forgotlink=driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
        forgotlink.click();

	}

}
