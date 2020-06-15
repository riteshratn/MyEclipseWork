package com.TimBuchulka;

public class RunnerClass {

	public static void main(String[] args) {
		Dimensions dimensions=new Dimensions(20,20,5);
		Case theCase=new Case("2020","Asus","123",dimensions);
		
		Monitor theMonitor=new Monitor("27inch dell","dell",25,new Resolution(2540,1223));
		MotherBoard theMotherBoard =new MotherBoard ("7346","acer",4,6,"v2.0");
		PC thePC=new PC(theCase,theMonitor,theMotherBoard);
		
		thePC.powerUp();

	}

}
