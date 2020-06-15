package oops2;

public class fan {
	private String make;
	private double radius;
	private String color;
	
	private boolean isOn;
	private byte speed;
	
	 //creation
	 public fan(String make,double radius,String color) {
		 this.make=make;
		 this.radius=radius;
		 this.color=color;

}
	 
	 //isOn
	 public void isOn(boolean isOn) {
			this.isOn=isOn;
			
		}
	 
	 public void setSpeed(byte speed) {
		 this.speed=speed;
	 }
		 
    //print the state
	 public String toString() {
		return String.format("make-%s, radius-%f, color-%s, isOn-%b, speed-%d",
				 make,radius,color,isOn,speed);
	 }

	
 }
