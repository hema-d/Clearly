package pack1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
	/*	TakesScreenshot  ts= driver;
	File src=	ts.getScreenshotAs(OutputType.FILE);
	File trg=new File("C:\\Users\\hp\\eclipse-workspace\\Clearly\\Scrennshots\\fullpage.png");
		FileUtils.copyFile(src, trg);*/
		
	WebElement ele=	driver.findElement(By.id("name"));
	
	File src1=ele.getScreenshotAs(OutputType.FILE);
	
	File trg2=new File("C:\\Users\\hp\\eclipse-workspace\\Clearly\\Scrennshots\\fullpage.png");
	FileUtils.copyFile(src1, trg2);
	

	}

}

