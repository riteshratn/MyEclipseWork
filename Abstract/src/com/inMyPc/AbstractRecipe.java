package com.inMyPc;

public abstract class AbstractRecipe {
	
	public void execute() {
		getReady();
		DoTheDish();
		Cleanup();
	}
	
	abstract void getReady();
	abstract void DoTheDish();
	abstract void Cleanup();
	
	//SetUp
	//Recipe
	//CleanUp

}
