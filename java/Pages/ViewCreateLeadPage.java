package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMethods;

public class ViewCreateLeadPage extends ProjectSpecificMethods{
	
	

	public ViewCreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public void createLeadSuccess() {
		String ExpectedTitle = "View Lead | opentaps CRM";
		String ActualTitle = driver.getTitle();
		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Displayed Title is correct");
		} else {
			System.out.println("Displayed Title error");
		}
		String leadId = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]", "");
		System.out.println(leadId);
	}

}
