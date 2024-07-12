package week4.day1HomeAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonActions {

	public static void main(String[] args) throws InterruptedException {
		
		//- Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		
		//- Load the URL (https://www.amazon.in/)
		driver.get("https://www.amazon.in/");
		//- Maximize the browser window
		driver.manage().window().maximize();
		//- Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//2. Search for "oneplus 9 pro".
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("oneplus 9 pro");
		searchBox.sendKeys(Keys.ENTER);
		
		//3. Get the price of the first product.
		String firsProductPrice = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		firsProductPrice=firsProductPrice.replaceAll("[^0-9]", "");
		System.out.println("Price of First resulting Produce : "+firsProductPrice);
		
		//4. Print the number of customer ratings for the first displayed product.
		String customerRatings = driver.findElement(By.xpath("//span[contains(@class,'a-size-base s-underline-text')]")).getText();
		System.out.println("customer ratings for the first displayed product : "+customerRatings);
		//5. Click the first text link of the first image.
		driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base a-text-normal')]")).click();
		String parentWindow=driver.getWindowHandle();
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> window=new ArrayList<String>(windowHandles);
		String childWindow=window.get(1);
		driver.switchTo().window(childWindow);
		
		 // 6. Take a screenshot of the product displayed. 
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(5000);
		//8. Get the cart subtotal and verify if it is correct. 
		//driver.switchTo().alert();
		String cartSubtotal = driver.findElement(By.xpath("//div[@id='attach-accessory-pane']//span[@id='attach-accessory-cart-subtotal']")).getText();
		//String  r="₹";
		Thread.sleep(5000);
		cartSubtotal=cartSubtotal.replaceAll("[^0-9]","");
		System.out.println("cart subtotal "+cartSubtotal);
		if(cartSubtotal.equals(firsProductPrice)) {
			System.out.println("Both price match");
		}else {
			System.out.println("price mismatch");
		}
		
		//9. Close the browser.
		driver.close();
		driver.switchTo().window(parentWindow);
		driver.close();
		

	}

}
