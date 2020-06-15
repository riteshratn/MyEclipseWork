package timChallenge;

public class RunnerClass {

	public static void main(String[] args) {
		wall wall1=new wall("west");
		wall wall2=new wall("east");
		wall wall3=new wall("south");
		wall wall4=new wall("north");
		
		ceiling ceiling=new ceiling(12,55);
		
		Bed bed=new Bed("Modern",4,3,2,1);
		
		Lamp lamp=new Lamp("Classic",false,75);
		Bedroom bedroom=new Bedroom("Tims",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
		bedroom.makeBed();
		
		bedroom.getLamp().turnOn();
		

	}

}
