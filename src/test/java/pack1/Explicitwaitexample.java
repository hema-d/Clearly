package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwaitexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(1));
		//wait.ignoring(NoSuchElementException.class);
		
	WebElement usr=(WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
	usr.sendKeys("hjknbhg");
	
	WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));
	WebElement pass=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pass']")));
	pass.sendKeys("skdn");
		
			}

}
