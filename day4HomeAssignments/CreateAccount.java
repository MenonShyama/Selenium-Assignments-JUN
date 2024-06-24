package week1.day4HomeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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
		// - Click on the "Accounts" tab.
		driver.findElement(By.linkText("Accounts")).click();
		// - Click on the "Create Account" button.
		driver.findElement(By.linkText("Create Account")).click();
		// - Enter an account name.
		driver.findElement(By.id("accountName")).sendKeys("HCL123");
		// - Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		// - Enter a Number Of Employees.
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		// - Enter a Site Name as “LeafTaps”
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		// - Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		// - Verify that the Title is displayed correctly.
		String ExpectedTitle = "Account Details | opentaps CRM";
		String ActualTitle = driver.getTitle();
		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Displayed Title is correct");
		} else {
			System.out.println("Displayed Title error");
		}
		// - Close the browser window.
		driver.close();

	}

}
