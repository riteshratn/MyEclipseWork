
public class TimeClassRunner {

	public static void main(String[] args) {
		
		TimeClass TimeClassObject=new TimeClass();
		System.out.println(TimeClassObject.toMilitary());
		TimeClassObject.setTime(13, 27, 6);
		System.out.println(TimeClassObject.toMilitary());
	}

}
