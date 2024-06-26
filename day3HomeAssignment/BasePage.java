package week2.day3HomeAssignment;

public class BasePage {
	 public void findElement() {
		 System.out.println("Find Element");
	 }
	 public void clickElement() {
		 System.out.println("Clcik Element");
	 }
	 public void enterText() {
		 System.out.println("Enter Text");
	 }
	 public void performCommonTasks() {
		 System.out.println("Perorm common task-parent class");
	 }

	public static void main(String[] args) {
		BasePage bp=new BasePage();
		bp.performCommonTasks();

	}

}
