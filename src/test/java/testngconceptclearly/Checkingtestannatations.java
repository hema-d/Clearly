package testngconceptclearly;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkingtestannatations {
WebDriver driver;

@Test(priority=0, groups= {"sanity"})
	void Set() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(priority=1, dependsOnMethods= {"Set"}, groups= {"sanity"})
	void Login() {
		System.out.println("login started");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}
	
	@Test (priority=3, dependsOnMethods= {"Login"}, groups= {"sanity","regression"})
	void clickonPIM() throws InterruptedException{
		System.out.println("PIM started");
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(3000);
	}
	
	@Test( dependsOnGroups="sanity")
	void teardown() {
		driver.close();
	}
}
