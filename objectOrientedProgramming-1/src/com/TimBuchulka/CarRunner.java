package com.TimBuchulka;

public class CarRunner {

	public static void main(String[] args) {
		Car porsche=new Car();
		Car holden=new Car();
           
		porsche.setModel("Carrera");
		holden.setModel("Commodore");
		System.out.println("Model is "+ porsche.getModel());
	//	System.out.println("Model is "+ holden.getModel());

	}

}
