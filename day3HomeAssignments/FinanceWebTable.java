package week3.day3HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FinanceWebTable {

	public static void main(String[] args) {

		// - Initialize ChromeDriver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		ChromeDriver driver = new ChromeDriver(options);

		// - Load the URL (http://leaftaps.com/opentaps/control/login)
		driver.get("https://finance.yahoo.com/");

		// - Maximize the browser window
		driver.manage().window().maximize();

		// - Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//- Click on “Crypto” tab
		Actions builder=new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//span[text()='Markets']"))).perform();
		
		builder.moveToElement(driver.findElement(By.xpath("(//div[text()='Crypto'])[2]"))).click().perform();

		/*
			
			- Locate the table in the dom page
			- Locate the cryptocurrency names in the table using specific row and column.
			- Use loop to iterate the cryptocurrency names
			- Print the cryptocurrency names 
			Requirements:
			- Create java class named FinanceYahoo
			- Load the url and click on “Crypto” tab
			- Identify the table in the dom using <table> tag (//table)
			- To access the row values, identify the row using <tr> to travel through the table 
			- To access the column values of the table, identify the column using <th>/<td>
			- Act on the elements in the table using WebElement function by iterating through the 
			rows and columns
			- Print the cryptocurrency names from table.
			Hints to Solve:
			- Identify the element using the locator to click on the "Crypto" tab.
			- Use //table to locate the table
			- Use `findElements()` to extract a List of `WebElement` from the table
			- Retrieving the cryptocurrency names and print it using getText().*/

	}

}
