package library1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


	public class Photo {
		   public static void getScreenShot(WebDriver driver,String folderpath) {
		   SimpleDateFormat s=new SimpleDateFormat("MM-dd-yyyy hh-mm-ss");
		   String dateTime=s.format(new Date());
		   TakesScreenshot t=(TakesScreenshot) driver;
		   File srcFile=t.getScreenshotAs(OutputType.FILE);
		   File destFile=new File(folderpath+dateTime+".png");
		 
			   FileUtils
			  
		
}
