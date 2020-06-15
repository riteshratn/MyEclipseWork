package timBuchulkaChallenge;

public class Car extends Vehicle{
	private int wheels;
	private int doors;
	private int geers;
	
	private boolean isManual;
	private int currentGeer;
	
	
	public Car(String name, String size, int wheels, int doors, int geers, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.geers = geers;
		this.isManual = isManual;
		this.currentGeer = 1;
	}

	public void changeGeer(int currentGeer) {
		this.currentGeer = currentGeer;
		System.out.println("car.setCurrentGeer() changed to "+this.currentGeer+" geer.");
	}
	public void changeVelocity(int speed,int direction) {
		move(speed,direction);
		System.out.println("Car.changeVelocity(): velocity "+speed+" direction "+direction);
		
	}

}
