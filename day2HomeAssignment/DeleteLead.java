package week2.day2HomeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		// - Click "Find leads.
		driver.findElement(By.linkText("Find Leads")).click();
		// - Click on the "Phone" tab.
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		// - Enter the phone number.
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");
		// - Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		// - Capture the lead ID of the first resulting lead.
		WebElement leadID = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext']"));
		String leadIDValue = leadID.getText();
		System.out.println("First resulting LeadId: " + leadIDValue);
		// - Click the first resulting lead.
		leadID.click();
		// - Click the "Delete" button.
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		// - Click "Find leads" again.
		driver.findElement(By.linkText("Find Leads")).click();
		// - Enter the captured lead ID.
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadIDValue);
		// - Click the "Find leads" button.
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		// - Verify the presence of the message "No records to display" in the Lead
		// List. This
		// message confirms the successful deletion.
		String noRecordMessage = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(noRecordMessage);
		if (noRecordMessage.equals("No records to display")) {
			System.out.println("ID deleted successfully");
		} else {
			System.out.println("Deletion error occured");
		}

		// - Close the browser window
		 driver.close();

	}

}
