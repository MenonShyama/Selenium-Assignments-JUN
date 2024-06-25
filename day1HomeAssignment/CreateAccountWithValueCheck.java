package week2.day1HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWithValueCheck {

	public static void main(String[] args) {
				// To open chrome browser
				ChromeDriver driver = new ChromeDriver();
				// Open url
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
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
				String accName="HCL12345";
				driver.findElement(By.id("accountName")).sendKeys(accName);
				// - Enter a description as "Selenium Automation Tester."
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
				//- Select "ComputerSoftware" as the industry.
				WebElement indusDropdown = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
				Select industryDropDown = new Select(indusDropdown);
				industryDropDown.selectByIndex(3);
				//- Select "S-Corporation" as ownership using SelectByVisibleText.
				WebElement ownerDropdown = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
				Select ownershipDropDown = new Select(ownerDropdown);
				ownershipDropDown.selectByVisibleText("S-Corporation");
				//- Select "Employee" as the source using SelectByValue.
				WebElement sourceDd = driver.findElement(By.id("dataSourceId"));
				Select sourceDropDown = new Select(sourceDd);
				sourceDropDown.selectByValue("LEAD_EMPLOYEE");
				//- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
				WebElement marketingDd = driver.findElement(By.id("marketingCampaignId"));
				Select marketingCampignDropDown = new Select(marketingDd);
				marketingCampignDropDown.selectByIndex(7);
				//- Select "Texas" as the state/province using SelectByValue.
				WebElement stateDd = driver.findElement(By.id("generalStateProvinceGeoId"));
				Select stateDropDown = new Select(stateDd);
				stateDropDown.selectByValue("TX");
				// - Click the "Create Account" button.
				driver.findElement(By.className("smallSubmit")).click();
				//- Verify that the account name is displayed correctly.
				String accountName = driver.findElement(By.xpath("//span[@class='requiredField']/following::span")).getText();
				if (accountName.contains(accName)) {
					System.out.println(accountName+"- Displayed account name match");
				} else {
					System.out.println("Account name mismatch");
				}
				//if()
				// - Close the browser window.
				driver.close();
	}

}
