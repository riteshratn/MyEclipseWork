package oops2;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Get the utensils");
	}

	@Override
	void doTheDish() {
		System.out.println("do the dish");
		
	}

	@Override
	void cleanUp() {
		System.out.println("Cleanup the utensils");
		
	}

}
