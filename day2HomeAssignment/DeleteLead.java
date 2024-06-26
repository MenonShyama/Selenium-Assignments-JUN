package week2.day2HomeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		//- Click "Find leads.
		driver.findElement(By.linkText("Leads")).click();
		/*"
		- Click on the "Phone" tab.
		- Enter the phone number.
		- Click the "Find leads" button.
		- Capture the lead ID of the first resulting lead.
		- Click the first resulting lead.
		- Click the "Delete" button.
		- Click "Find leads" again.
		- Enter the captured lead ID.
		- Click the "Find leads" button.
		- Verify the presence of the message "No records to display" in the Lead List. This 
		message confirms the successful deletion.
		
		*/
		// - Close the browser window
				driver.close();

	}

}
