package TestCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificMethods;
import Pages.LoginPage;

public class TC001Login extends ProjectSpecificMethods{
	
	@Test(dataProvider = "getData")
	public void login(String uname,String pswd) {
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(uname).enterPassword(pswd).clickLogin().clickCRMSFA();
	}
	@BeforeTest
	public void setData() {
		fileName="Login";
	}

}
