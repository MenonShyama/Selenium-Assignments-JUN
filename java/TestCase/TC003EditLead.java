package TestCase;

import org.testng.annotations.Test;

import Base.ProjectSpecificMethods;
import Pages.LoginPage;

public class TC003EditLead extends ProjectSpecificMethods{
	@Test
	public void editLead() {
		new LoginPage(driver)
		.enterUserName("demoCsr")
		.enterPassword("crmsfa")
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickEditLeadLink()
		.clickPhoneTab()
		.enterPhoneNumber()
		.clickFindLeads().clickLeadID();
		}
}
