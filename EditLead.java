package week2.day2HomeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// - Initialize the WebDriver (ChromeDriver).
		ChromeDriver driver = new ChromeDriver();
		//- Load the URL http://leaftaps.com/opentaps/.
		driver.get("http://leaftaps.com/opentaps/");
		//  - Maximize the browser window.
		driver.manage().window().maximize();
		// - Enter the Username as "DemoSalesManager" and the Password as "crmsfa".
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// - Click on the Login Button.
		driver.findElement(By.className("decorativeSubmit")).click();
		// - Click on the CRM/SFA Link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		// - Click on the Leads Button.
		driver.findElement(By.linkText("Leads")).click();
		// - Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		//  - Enter the CompanyName Field
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL123456");
		//Using Xpath. - Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Shyama");
		//- Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("menon");
		// - Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("B");
		//- Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");
		//  - Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Selenium class");
		// - Enter your email in the E-mail address Field using the locator of your choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("class@gmail.com");
		// - Select State/Province as NewYork Using Visible Text.
		WebElement statedd = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select stateDropDown=new Select(statedd);
		stateDropDown.selectByVisibleText("New York");
		// - Click on the Create Button. 
		driver.findElement(By.name("submitButton")).click();
		//Click on the edit button.
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		// - Clear the Description Field. 
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		//- Fill the Important Note Field with Any text.
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Selenium class");
		//- Click on the update button.
		driver.findElement(By.name("submitButton")).click();
		//- Get the Title of the Resulting Page.
		String title = driver.getTitle();
		System.out.println(title);
		//- Close the browser window.
		driver.close();
		 

	}

}
