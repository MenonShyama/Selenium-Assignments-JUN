package week3.day2HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W3Schools {

	public static void main(String[] args) {

		// Initialize ChromeDriver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		ChromeDriver driver = new ChromeDriver(options);
		// - Load the URL(https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt)
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		// - Maximize the browser window
		driver.manage().window().maximize();

		// - Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// - Switch to the frame
		driver.switchTo().frame("iframeResult");

		// - Click the "Try It" button inside the frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		// - Click OK/Cancel in the alert that appears
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Shyama");
		alert.accept();

		// - Confirm the action is performed correctly by verifying the text displayed
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if (text.contains("Shyama")) {
			System.out.println("Execution success");
		} else {
			System.out.println("Execution failed");
		}

		driver.close();

	}

}
