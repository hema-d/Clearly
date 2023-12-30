package testngconceptclearly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class First_POM {
	//constarators
	
	WebDriver driver;
	
	First_POM(WebDriver driver){
		this.driver=driver;
	}
	
	//locators
	By username=By.xpath("//input[@id='email']");
	By passwword=By.xpath("//input[@id='pass']");
	By login=By.name("login");
	
	//action methods
	
	public void sendingname(String user) {
		driver.findElement(username).sendKeys(user);}
	
	public void sendingpass(String pass) {
		driver.findElement(passwword).sendKeys(pass);}
	
	public void clickinglogin() {
		driver.findElement(login).click();
				
	}

}
