package week2.day4HomeAssignment;

public class JavaConnection implements DatabaseConnection{

	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();

	}

	public void connect() {
		System.out.println("Connection Established");
		
	}

	public void disconnect() {
		System.out.println("Disconnected");
		
	}

	public void executeUpdate() {
		System.out.println("Update query executed");
		
	}

}
