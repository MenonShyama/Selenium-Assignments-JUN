package week1.day4HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// To open chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Open url
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		// -Enter username and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// -Click login
		driver.findElement(By.className("decorativeSubmit")).click();
		// -Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// - Click on the "Leads" tab.
		driver.findElement(By.linkText("Leads")).click();
		// - Click on the "Create Lead" button.
		driver.findElement(By.linkText("Create Lead")).click();
		// - Enter a FirstName.
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("shyama");
		// - Enter a LastName.
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("menon");
		// - Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		// - Enter a Title .
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("HCL");
		// - Click the "Create Lead" button.
		driver.findElement(By.name("submitButton")).click();
		// - Verify that the Title is displayed correctly.
		String ExpectedTitle = "View Lead | opentaps CRM";
		String ActualTitle = driver.getTitle();
		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Displayed Title is correct");
		} else {
			System.out.println("Displayed Title error");
		}
		// - Close the browser window
		driver.close();

	}

}
