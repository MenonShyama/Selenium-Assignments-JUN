package week4.day4HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SalesForceLogin extends ProjectSpecificMethods{
	
	@Test(dataProvider = "loginInfo")
	public void login(String fname,String lname) throws InterruptedException {
	// - Click on the toggle menu button from the left corner
	driver.findElement(By.xpath("//div[@class='slds-r8']")).click();
	Thread.sleep(5000);
	
	// - Click View All and click Legal Entities from App Launcher
	driver.findElement(By.xpath("//button[text()='View All']")).click();

	WebElement legal = driver.findElement(By.xpath(
			"//p[text()='Legal Entities']"));wait.until(ExpectedConditions.elementToBeClickable(legal));driver.executeScript("arguments[0].click();",legal);

	// - Click on the Dropdown icon in the legal Entities tab
	WebElement legalEntity = driver.findElement(By.xpath(
			"//span[contains(text(),'Legal Entities')]/following::span[contains(text(),'Legal Entities List')]"));wait.until(ExpectedConditions.elementToBeClickable(legalEntity));driver.executeScript("arguments[0].click();",legalEntity);

	// - Click on New Legal Entity
	WebElement newLegalEntity = driver.findElement(By.xpath(
			"//span[text()='New Legal Entity']"));wait.until(ExpectedConditions.elementToBeClickable(newLegalEntity));driver.executeScript("arguments[0].click();",newLegalEntity);

	// - Enter the Company name as 'TestLeaf'.
	driver.findElement(By.xpath("//label[text()='Company Name']/following::input")).sendKeys(fname);

	// - Enter Description as 'Salesforces'.
	driver.findElement(By.xpath("//label[text()='Description']/following::textarea")).sendKeys(lname);

	// - Select Status as 'Active'
	WebElement Status = driver.findElement(By.xpath(
			"//label[text()='Status']/following::button"));wait.until(ExpectedConditions.elementToBeClickable(Status));driver.executeScript("arguments[0].click();",Status);driver.findElement(By.xpath("//span[text()='Active']")).click();

	// Click Save button
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

	// - Verify the Alert message (Complete this field) displayed for Name*/
	// Get Error Message and Verify
	driver.findElement(By.xpath("//ul[contains(@class,'errorsList')]//a")).click();
	WebElement Error = driver.findElement(
			By.xpath("//div[@class='slds-form-element__help']"));wait.until(ExpectedConditions.visibilityOf(Error));
	String ErrorMsg = Error
			.getText();System.out.println("Error Msg : "+ErrorMsg);if(ErrorMsg.contains("Complete this field"))
	{
		System.out.println("Please provide input for this field");
	}else
	{
		System.out.println("Entity Saved");
	}}
	
	@DataProvider(name="loginInfo")
	public String[][] sendata(){
		String[][] data=new String[2][2];
		data[0][0]="TestLeaf";	
		data[0][1]="Salesforces";
		data[1][0]="shyama";
		data[1][1]="testleaf";
		
		return data;
	}
}
