package week2.day2HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		//- Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		//- Load the URL https://leafground.com/checkbox.xhtml
		driver.get("https://leafground.com/checkbox.xhtml");
		//- Maximize the browser window
		driver.manage().window().maximize();
		//- Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//- Click on the "Basic Checkbox.”
		WebElement basicCheckbox = driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
		//System.out.println(basicCheckbox.isDisplayed());
		basicCheckbox.click();
		//- Click on the "Notification Checkbox."
		driver.findElement(By.xpath("//h5[text()='Notification']/following::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		 //- Verify that the expected message is displayed. 
		String Actualtext = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		String ExpectedText="Checked";
		if(Actualtext.equals(ExpectedText)) {
			System.out.println("Expected action:Notification checkbox is checked and message "+Actualtext+"  is verified");
		}else {
			System.out.println("Expected action:Notification checkbox is unchecked");
		}
		  
		 
		//- Click on your favorite language (assuming it's related to checkboxes).
		driver.findElement(By.xpath("(//h5[text()='Choose your favorite language(s)']/following::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]")).click();
		//- Click on the "Tri-State Checkbox."
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		//- Verify which tri-state option has been chosen.
		String state = driver.findElement(By.xpath("//span[@class='ui-growl-title']/following-sibling::p")).getText();
		System.out.println(state);
		if(state.contains("0")) {
			System.out.println("State 0");
		}
		else if(state.contains("1")) {
			System.out.println("State 1");
		}
		else if(state.contains("2")) {
			System.out.println("State 2");
		}
		//- Click on the "Toggle Switch."
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following::div[@class='ui-toggleswitch-slider']")).click();
		//- Verify that the expected message is displayed.
		String Actualtextdisplayed = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		String ExpectedTextDisplayed="Checked";
		if(Actualtextdisplayed.equals(ExpectedTextDisplayed)) {
			System.out.println("Expected  action Toggle is done and message "+Actualtextdisplayed+" is displayed ");
		}else {
			System.out.println("Expected action toggle is not verified ");
		}
		//- Verify if the Checkbox is disabled.
		WebElement checkbox = driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/following::div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']"));
		System.out.println("Check box is disabled "+checkbox.isEnabled());
		//- Select multiple options on the page (details may be needed).
		driver.findElement(By.xpath("//h5[text()='Select Multiple']/following::div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]/preceding-sibling::div")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		//- Close the web browser when done.
		driver.close();

	}

}
