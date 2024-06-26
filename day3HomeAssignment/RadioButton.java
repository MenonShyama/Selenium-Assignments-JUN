package week2.day3HomeAssignment;

public class RadioButton extends Button{
	public void selectRadioButton() {
		System.out.println("selectRadioButton");
	}

	public static void main(String[] args) {
		RadioButton rb=new RadioButton();
		rb.click();
		rb.selectRadioButton();
		rb.setText("HI");
		rb.submit();
	}

}
