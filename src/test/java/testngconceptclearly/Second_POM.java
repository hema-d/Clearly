package testngconceptclearly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Second_POM {
	
	WebDriver driver;
	Second_POM (WebDriver driver){
		this.driver=driver;
	}

	By tryonce=By.id("email");
	
	public void wnr(String str) {
		driver.findElement(tryonce).sendKeys(str);
	}
	
}
