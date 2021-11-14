package ProTrainingTech;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Common.Utilities;

public class Ilistners extends Utilities implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test is started successfully");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Utilities)result.getInstance()).driver;
		Date dt=new Date();
		String di=dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(di);
		File Shotsof  =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			FileHandler.copy(Shotsof, new File("C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Pictures\\Passed\\Amazon_"+di+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Utilities)result.getInstance()).driver;
		Date dt=new Date();
		String di=dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(di);
		File Shotsof  =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			FileHandler.copy(Shotsof, new File("C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Pictures\\Failed\\Amazon_"+di+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver = ((Utilities)result.getInstance()).driver;
		Date dt=new Date();
		String di=dt.toString().replace(" ", "_").replace(":", "_");
		System.out.println(di);
		File Shotsof  =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			FileHandler.copy(Shotsof, new File("C:\\Users\\MUHAMMAD Shahbaz Sal\\Downloads\\CodingOfWeekendSunday\\PracticeOfProtrainingtech\\Pictures\\Skipped\\Amazon_"+di+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		
		
	}

	
}
