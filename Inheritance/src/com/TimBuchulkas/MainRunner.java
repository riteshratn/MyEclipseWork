package com.TimBuchulkas;

public class MainRunner {

	public static void main(String[] args) {
		Animal animal=new Animal("Animal",1,1,5,5);
		Dog dog=new Dog("Rocky",8,20,2,4,1,20,"long silky");
		dog.eat();
		dog.chew();
		dog.walk();
		dog.run();
	}

}
