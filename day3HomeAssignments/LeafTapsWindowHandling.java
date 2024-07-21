package week3.day3HomeAssignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafTapsWindowHandling {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//- Initialize ChromeDriver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		ChromeDriver driver=new ChromeDriver(options);
		
		//- Load the URL (http://leaftaps.com/opentaps/control/login)
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//- Maximize the browser window
		driver.manage().window().maximize();
		
		//- Add an implicit wait to ensure the webpage elements are fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//- Enter the username and password.
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//- Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//- Click on the CRM/SFA link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//- Click on the Contacts button.
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//- Click on Merge Contacts.
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//- Click on the widget of the "From Contact".
		driver.findElement(By.xpath("//input[@id='ComboBox_partyIdFrom']//following::a")).click();
		
		//String parentWindow=driver.getWindowHandle();
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> windows=new ArrayList(windowHandles);
		String parent=windows.get(0);
		String childWindow=windows.get(1);
		driver.switchTo().window(childWindow);
	
		
		//- Click on the first resulting contact.
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		Thread.sleep(3000);
		driver.switchTo().window(parent);
		
		//- Click on the widget of the "To Contact".
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ComboBox_partyIdTo']//following::a")).click();
		Thread.sleep(5000);
		//String parentWindow2=driver.getWindowHandle();
		Set<String> windowHandles2=driver.getWindowHandles();
		List<String> windows2=new ArrayList(windowHandles2);
		String parent2=windows.get(0);
		String childWindow2=windows2.get(1);
		driver.switchTo().window(childWindow2);
		  
		  //- Click on the second resulting contact. 
		 // Thread.sleep(3000);
		  driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).
		  click(); 
		  driver.switchTo().window(parent);
		  
		  //- Click on the Merge button.
		  driver.findElement(By.xpath("//a[text()='Merge']")).click();
		  
		  //- Accept the alert. 
		  driver.switchTo().alert().accept();
		  
		  //- Verify the title of the page. 
		  String title = driver.getTitle();
		  System.out.println(title);
		 
	}
}

	/*
		
		
		
		
		
		
		
		*/
	
	
	//options.
	
