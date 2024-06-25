package week2.day1HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// - Initialize ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Open url
		driver.get("https://en-gb.facebook.com/");
		//- Maximize the browser window
		driver.manage().window().maximize();
		//- Add an implicit wait to ensure the web page elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//- Click on the Create new account button.
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//- Enter the First name.
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shyama");
		//- Enter the Surname.
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("menon");
		//- Enter the Mobile number or email address.
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		//- Enter the New password.
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123@ssssss");
		//- Handle all three dropdowns in Date of birth
		WebElement daydd = driver.findElement(By.id("day"));
		Select dayDropDown=new Select(daydd);
		dayDropDown.selectByVisibleText("26");
		WebElement monthdd = driver.findElement(By.id("month"));
		Select monthDropDown=new Select(monthdd);
		monthDropDown.selectByValue("10");
		WebElement yeardd = driver.findElement(By.id("year"));
		Select yearDropDown=new Select(yeardd);
		yearDropDown.selectByVisibleText("1992");
		//- Select the radio button in Gender.
		driver.findElement(By.xpath("//label[text()='Female']/following::input")).click();
		
		
	}

}
