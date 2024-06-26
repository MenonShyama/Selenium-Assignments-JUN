package week2.day3HomeAssignment;

public class CheckBoxButton extends Button{
	public void clickCheckButton() {
		System.out.println("clickCheckButton");
	}

	public static void main(String[] args) {
		CheckBoxButton cb=new CheckBoxButton();
		cb.click();
		cb.clickCheckButton();
		cb.setText("HI");
		cb.submit();
	}

}
