package oops2;

public class FanRunner {

	public static void main(String[] args) {
	fan fan=new fan("manufacturer1",0.34567,"green");
	fan.setSpeed((byte)5);
	fan.isOn(false);
       System.out.println(fan);
	
}
}

