package week2.day3HomeAssignment;

public class TextField extends WebElement{
public void getText() {
	System.out.println("Iam get text method from parent");
}
	public static void main(String[] args) {
		TextField tf=new TextField();
		tf.click();
		tf.setText("HI");
		tf.getText();
	}
}
