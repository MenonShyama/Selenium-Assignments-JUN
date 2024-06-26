package week2.day2HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtons {

	public static void main(String[] args) {
	
		//- Initialize ChromeDriver
				ChromeDriver driver=new ChromeDriver();
				//- Load the URL https://leafground.com/checkbox.xhtml
				driver.get("https://leafground.com/button.xhtml");
				//- Maximize the browser window
				driver.manage().window().maximize();
				//- Add an implicit wait to ensure the web page elements are fully loaded
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				//- Click on the button with the text ‘Click and Confirm title.’
				driver.findElement(By.xpath("//span[text()='Click']")).click();
				//- Verify that the title of the page is ‘dashboard.’
				String expectedTitle="Dashboard";
				String actualtitle = driver.getTitle();
				System.out.println(actualtitle);
				if(expectedTitle.equals(actualtitle)) {
					System.out.println("Title Match");
				}else {
					System.out.println("Incorrect title");
				}
				driver.get("https://leafground.com/button.xhtml");
				//- Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
				System.out.println(driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled());
				//- Find and print the position of the button with the text ‘Submit.’
				//System.out.println(driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-bookmark']")).getAriaRole());
				//- Find and print the background color of the button with the text ‘Find the Save button color.’
				WebElement attribute = driver.findElement(By.name("j_idt130"));
				String bg=attribute.getAttribute("back color");
				System.out.println(bg);
				//- Close the browser window.
				driver.close();
	}

}
