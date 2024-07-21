package TestCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificMethods;
import Pages.LoginPage;

public class TC002CreateLead extends ProjectSpecificMethods{
	@Test(dataProvider = "getData")
	public void createLead(String uname,String pswd,String cname,String fname,String lname) {
		new LoginPage(driver).enterUserName(uname)
		.enterPassword(pswd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeadLink()
		.entercompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.submitCreateLead()
		.createLeadSuccess();
		
	}
	@BeforeTest
	public void setData() {
		fileName="CreateLead";
	}
}
