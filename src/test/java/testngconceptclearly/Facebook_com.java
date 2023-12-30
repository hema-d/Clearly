package testngconceptclearly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(testngconceptclearly.MyListerner_Facebook.class)
public class Facebook_com {

	WebDriver driver;
	
	@Test(priority=1)
	void Setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test(priority=2)
	void login() {
		driver.findElement(By.id("email")).sendKeys("hemalatha.sajjanapu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Qwert@79");
	}
	
	//@Test(priority=3)
//	void teardown() {
		//driver.close();
	}

