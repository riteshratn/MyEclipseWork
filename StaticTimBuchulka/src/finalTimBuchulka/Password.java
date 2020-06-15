package finalTimBuchulka;

public class Password {
	private static final int key=67413981;
	private final int encryptedPassword;
	public Password(int password) {
		this.encryptedPassword=encryptDecript(password);
	}
	private int encryptDecript(int password) {
		return password ^key;
		
	}
	public void storePassword() {
		System.out.println("saving password as "+ this.encryptedPassword);
	}
	public boolean letMeIn(int password) {
		if(encryptDecript(password)==this.encryptedPassword) {
			System.out.println("welcome");
			return true;
		}else {
			System.out.println("Nope, u cant come in");
			return false;
		}
			
	}

}
