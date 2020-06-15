package com.inMyPc;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("get the raw materials");
		System.out.println("get the utensils");
	}

	@Override
	void DoTheDish() {
		System.out.println("do the dish");
		
		
	}

	@Override
	void Cleanup() {
		System.out.println("clean up the utensils");
		
		
	}

}
