package oops2;

public class RecipeWithMicrowave extends AbstractRecipe{
	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Switch on the Microwave");
	}

	@Override
	void doTheDish() {
		System.out.println("get stuff ready");
		System.out.println("Put it in the Microwave");
	}

	@Override
	void cleanUp() {
		System.out.println("Cleanup the utensils");
		System.out.println("Switch off the Microwave");
	}
}
