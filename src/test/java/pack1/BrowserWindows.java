package pack1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.w3schools.com/python/default.asp");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");
		 
		 driver.findElement(By.linkText("Try it Yourself »")).click();
		 
	  Set<String> windowsID=  driver.getWindowHandles();
	  
	  List<String> list = new ArrayList <String> (windowsID);
	String parent=  list.get(0);
	 String child=  list.get(1);

	 driver.switchTo().window(child);
	 driver.findElement(By.id("runbtn")).click();
	 driver.switchTo().window(parent);
	 driver.findElement(By.xpath("//button[text()='Submit Answer »']")).click();
	// String third= list.get(3);
	 
	//String fourth= driver.getWindowHandle();
//	driver.switchTo().window(fourth);
//driver.findElement(By.xpath("//button[@class='w3s-exercisebtn showanswerbutton hide-from-small ga-exercise']")).click();
	 
	  
	  driver.close();
	}

}
