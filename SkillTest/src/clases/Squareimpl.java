package clases;

import interfaces.Square;

public class Squareimpl implements Square {

	private final String name = "Square";
	private String color;
	private int sideLenght;

	public Squareimpl(String color, int sideLenght) {
		this.color = color;
		this.sideLenght = sideLenght;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getArea() {
		return sideLenght * sideLenght;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public void getAllPropertys() {
		System.out.println("Name: " + name + "  " + "Color: " + color + "  " + "Area: " + this.getArea() + "  "
				+ "SideLenght: " + this.getSideLenght());
	}

	@Override
	public int getSideLenght() {
		return this.sideLenght;
	}

}
