package com.inMyPc;

public class RecipeRunner {

	public static void main(String[] args) {
		Recipe1 r= new Recipe1();
		r.execute();
		
		RecipeWithMicrowave rwm=new RecipeWithMicrowave();
		rwm.execute();

	}

}
