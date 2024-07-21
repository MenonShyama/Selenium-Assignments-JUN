package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}

	
	
	public LoginPage enterUserName(String uname){
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;
	}
	public LoginPage enterPassword(String pswd) {
		driver.findElement(By.id("password")).sendKeys(pswd);
		return this;
	}
	
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
		
	

}
