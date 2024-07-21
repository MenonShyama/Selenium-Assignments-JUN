package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}

	public LeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage(driver);
	}

	public void clickAccounts() {

	}

	public void clickContacts() {

	}

	public void clickCases() {

	}

}
