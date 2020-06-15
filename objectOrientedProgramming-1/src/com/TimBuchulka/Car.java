package com.TimBuchulka;

public class Car {
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;

	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if (validModel.equals("Carrera") || validModel.equals("Commodore")) {
			this.model = model;
		} else {
			this.model = "Unknown";
		}
		this.model = model;
	}

	public String getModel() {
		return model;
	}

}
