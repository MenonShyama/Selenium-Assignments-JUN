package week2.day3HomeAssignment;

public class WebElement {
	public void click() {
		System.out.println("I am click method displayed from base class");
	}
	public void setText(String text) {
		System.out.println("I am Set Text method displayed from base class:"+text);
	}

	public static void main(String[] args) {
		WebElement we=new WebElement();
		we.click();
		we.setText("HI");
	}

}
