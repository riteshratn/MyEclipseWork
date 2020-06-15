package com.inOops;

public class Main {

	public static void main(String[] args) {
		Pen p=new Pen();
		
		System.out.println("Pen colour: "+p.color);
		System.out.println("Pen point: "+p.point);
		System.out.println("Pen type: "+p.type);
		
		System.out.println("Pen click: "+p.clicked);
		p.click();
		System.out.println("Pen click: "+p.clicked);
		

	}

}
