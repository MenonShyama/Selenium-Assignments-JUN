package week2.day3HomeAssignment;

public class Button extends WebElement{
	public void submit() {
		System.out.println("Iam submit method from parent class");
	}

	public static void main(String[] args) {
		Button bt=new Button();
		bt.setText("Hi");
		bt.submit();
		bt.click();
	}
}
