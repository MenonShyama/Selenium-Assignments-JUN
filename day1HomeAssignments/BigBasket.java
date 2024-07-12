package week4.day1HomeAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		// - Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// - Load the URL (https://www.bigbasket.com/)
		driver.get("https://www.bigbasket.com/");
		// - Maximize the browser window
		driver.manage().window().maximize();
		// - Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		// 2. Click on "Shop by Category".
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();

		// 3. Mouse over "Foodgrains, Oil & Masala".
		WebElement hover1 = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(hover1).perform();

		// 4. Mouse over "Rice & Rice Products".
		WebElement hover2 = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		builder.moveToElement(hover2).perform();

		// 5. Click on "Boiled & Steam Rice".
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		// 6. Filter the results by selecting the brand "bb Royal".
		/*
		 * driver.switchTo().frame("FullStory-iframe");
		 * driver.findElement(By.xpath("//input[@id='i-BBRoyal']")).click();
		 * Thread.sleep(5000);
		 */
		// 7. Click on "Tamil Ponni Boiled Rice".
		driver.findElement(By.xpath("//a[@class='h-full']//h3[text()='Tamil Ponni Boiled Rice']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		String childWindow = window.get(1);
		driver.switchTo().window(childWindow);
		// 8. Select the 5 Kg bag.
		driver.findElement(By.xpath("//span[text()='1 kg']")).click();
		// 9. Check and note the price of the rice.
		String price = driver
				.findElement(By
						.xpath("//span[text()='1 kg']//following::span[contains(@class,'PackSizeSelector')]//span[1]"))
				.getText();
		System.out.println("Price" + price);
		// 10. Click "Add" to add the bag to your cart.
		driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
		// 11. Verify* the success message that confirms the item was added to your
		// cart.
		String text = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']")).getText();
		System.out.println(text);
		// 12. Take a snapshot of the current page
		// 13. Close the current window.
		driver.close();
		driver.switchTo().window(window.get(0));
		driver.quit();
		/*
		 * 12. Take a snapshot of the current page 14. Close the main window.
		 */

	}

}
