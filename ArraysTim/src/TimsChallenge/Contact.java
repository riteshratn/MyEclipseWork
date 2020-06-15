package TimsChallenge;

public class Contact {
	private String name;
	private String phonenumber;
	public Contact(String name, String phonenumber) {
		//super();
		this.name = name;
		this.phonenumber = phonenumber;
	}
	public String getName() {
		return name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public static Contact createContact(String name,String phoneNumber) {
		return new Contact(name,phoneNumber);
	}

}
