package testngconceptclearly;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_POM {
	
	WebDriver driver;
	
	@Test(priority=1)
void setup() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	
	@Test(priority=2)
	void login() {
		First_POM pm=new First_POM(driver);
		pm.sendingname("hemalatha.sajjanapu@gmail.com");
		pm.sendingpass("Qwert@79");
		pm.clickinglogin();
		
		Second_POM sp=new Second_POM(driver);
		sp.wnr("hemalath");
	}
}
