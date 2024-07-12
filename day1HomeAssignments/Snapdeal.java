package week4.day1HomeAssignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		//- Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		
		//- Load the URL (https://www.snapdeal.com/)
		driver.get("https://www.snapdeal.com/");
		
		//- Maximize the browser window
		driver.manage().window().maximize();
		
		//- Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		//2. Go to "Men's Fashion".
		Actions builder=new Actions(driver); 
		builder.moveToElement(driver.findElement(By.xpath("//span[@class='catText']"))).perform();
		
		//3. Go to "Sports Shoes".
		builder.moveToElement(driver.findElement(By.xpath("//span[text()='Sports Shoes']"))).click().perform();
		
		//4. Get the count of sports shoes.
		String countOfSportsShoes = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("Number of Sports Shoes "+countOfSportsShoes);
		
		//5. Click on "Training Shoes".
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//6. Sort the products by "Low to High".
		driver.findElement(By.xpath("//div[contains(text(),'Popularity')]")).click();
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		
		//7. Check if the displayed items are sorted correctly.
				
		//8. Select any price range ex:(500-700).
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("700");
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		
		//9. Filter by any colour.
		driver.findElement(By.xpath("//input[@id='Color_s-Black']/following::label")).click();
		
		//10. Verify all the applied filters.
		String price=driver.findElement(By.xpath("//div[@class='filters']//div[1]//a")).getText();
		if(price.contains("Rs. 500 - Rs. 700")) {
			System.out.println("Price filter applied ");
		}else {System.out.println("Price filter error ");}
		
		String color=driver.findElement(By.xpath("//div[@class='filters']//div[2]//a")).getText();
		if(color.contains("Black")) {
			System.out.println("color filter applied ");
		}else {System.out.println("color filter error ");}
		
		//11. Mouse hover on the first resulting "Training Shoes".
		Thread.sleep(5000);
		builder.moveToElement(driver.findElement(By.xpath("//img[@class='product-image wooble']"))).perform();
		
		//12. Click the "Quick View" button.
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		
		//13. Print the cost and the discount percentage.
		String Cost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Cost :"+Cost);
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Discount :"+discount);
		
		//14. Take a snapshot of the shoes.
		
		//15. Close the current window.
		driver.quit();
		
	}

}
