package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods {
	
	public FindLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public FindLeadsPage clickPhoneTab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public FindLeadsPage enterPhoneNumber() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");
		return this;
	}
	public FindLeadsPage clickFindLeads()  {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Thread.sleep(5000);
		return this;
	}
	public void clickLeadID() {
		WebElement leadID = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext']"));
		String leadIDValue = leadID.getText().replaceAll("[^0-9]", "");
		System.out.println("First resulting LeadId: " + leadIDValue);
		leadID.click();
	}
	

}
