package Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Utils.ReadExcel;


public class ProjectSpecificMethods {
	public ChromeDriver driver;
	public String fileName;
	@BeforeMethod
	public void preCondition() {
		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	@AfterMethod
	public void postCondition() {
		driver.close();

	}
	@DataProvider
	public String[][] getData() throws IOException{
	return ReadExcel.readExcel(fileName);
	}

}
