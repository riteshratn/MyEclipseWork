package timChallenge;

public class Bedroom {
	private String name;
	private wall wall1;
	private wall wall2;
	private wall wall3;
	private wall wall4;
	private ceiling ceiling;
	private Bed bed;
	private Lamp lamp;
	public Bedroom(String name, wall wall1, wall wall2, wall wall3, wall wall4, timChallenge.ceiling ceiling, Bed bed,
			Lamp lamp) {
		//super();
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.bed = bed;
		this.lamp = lamp;
	}
	public Lamp getLamp() {
		return this.lamp;
	}
	public void makeBed() {
		System.out.println("Bedroom-> making bed");
		bed.make();
	}

}
