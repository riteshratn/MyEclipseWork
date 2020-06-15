package com.inMyPc;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("get the raw materials");
		System.out.println("switch ON the microwave");
	}

	@Override
	void DoTheDish() {
		System.out.println("get stuff ready");
		System.out.println("put it in the microwave");
		
	}

	@Override
	void Cleanup() {
		System.out.println("clean up the utensils");
		System.out.println("switch OFF the microwave");
		
	}

}
