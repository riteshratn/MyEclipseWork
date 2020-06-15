package finalTimBuchulka;

public class MainRunner  {

	public static void main(String[] args) {
		SomeClass one=new SomeClass("one");
		SomeClass two=new SomeClass("two");
		SomeClass three=new SomeClass("three");
		
		System.out.println(one.getInstanceNumber());
		System.out.println(two.getInstanceNumber());
		System.out.println(three.getInstanceNumber());
		
		//one.getInstanceNumber=4;
		
		System.out.println(Math.PI);
		//Math m=new Math();
		
		int pw=654354;
		Password password=new Password(pw);
		password.storePassword();
		
		password.letMeIn(1);
		password.letMeIn(45678);
		password.letMeIn(67564);
		password.letMeIn(876453);
		password.letMeIn(657651);
		password.letMeIn(980678);

	}

}
