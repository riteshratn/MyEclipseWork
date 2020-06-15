package timBuchulkaChallenge;

public class Outlander extends Car {
	private int roadServiceMonths;

	public Outlander(int roadServiceMonths) {
		super("Outlander","40",5,5,6,false);
		this.roadServiceMonths = roadServiceMonths;
		
		
	}
	public void accelerate(int rate) {
		int newVelocity=getCurrentVelocity()+rate;
		if(newVelocity==0) {
			stop();
			changeGeer(1);
		}else if(newVelocity>0&&newVelocity<=10) {
			changeGeer(1);
		}else if(newVelocity>10&&newVelocity<=20) {
			changeGeer(2);
		}else if(newVelocity>20&&newVelocity<=30) {
			changeGeer(3);
		}else {
			changeGeer(4);
		}
		if(newVelocity>0) {
			changeVelocity(newVelocity,getCurrentDirection());
		}
	}

}
