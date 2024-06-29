package week2.day4HomeAssignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		// - Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		// - In the search box, type as "bags" and press enter
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='searchVal']"));
		searchBox.sendKeys("bags");
		searchBox.sendKeys(Keys.ENTER);
		// - To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//input[@id='Men']//following-sibling::label")).click();
		// - Under "Category" click "Fashion Bags"
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']//following-sibling::label")).click();
		// - Print the count of the items found.
		Thread.sleep(5000);
		String itemCount = driver.findElement(By.xpath("//div[@class=' filter-container']//div[@class='length']"))
				.getText();
		System.out.println("Item Count:" + itemCount);
		// Get the list of brand of the products displayed in the page and print the
		// list.
		List<WebElement> brandList = driver.findElements(By.xpath("//div[@class='brand']"));
		Set<WebElement> brandSet = new HashSet<WebElement>(brandList);
		System.out.println("Available Brand List:");
		for (WebElement list : brandSet) {
			System.out.println(list.getText());
		}
		// list. - Get the list of names of the bags and print it
		 List<WebElement> bagNameList = driver.findElements(By.xpath("//div[@class='nameCls']"));
		 System.out.println("Available Bags");
		 for(WebElement bagNames:bagNameList) {
			 System.out.println(bagNames.getText());
		 }
		 driver.close();
	}

}
