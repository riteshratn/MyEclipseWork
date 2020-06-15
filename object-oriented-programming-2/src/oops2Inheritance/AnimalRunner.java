package oops2Inheritance;

abstract class Animal {
	abstract void bark();
}

class Dog extends Animal {
	public void bark() {
		System.out.println("Bow Bow");
	}
}

class Cat extends Animal {
	public void bark() {
		System.out.println("Meow Meow");
	}

}

public class AnimalRunner {
	public static void main(String[] args) {
		Animal[] animal = { new Cat(), new Dog() };
		for (Animal animals : animal) {
			animals.bark();
		}
	}

}
