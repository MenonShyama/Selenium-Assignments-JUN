package week2.day3HomeAssignment;

public class LoginPage extends BasePage {
	
	public void performCommonTasks() {
		System.out.println("Perorm common task-child class");
	}

	public static void main(String[] args) {
		LoginPage lp=new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTasks();
		BasePage bp=new BasePage();
		bp.performCommonTasks();

	}

}
