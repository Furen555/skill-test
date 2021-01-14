package clases;

import java.text.DecimalFormat;

import interfaces.Circle;

public class Circleimpl implements Circle {

	private final String name = "Circle";
	private String color;
	private int radius;

	DecimalFormat f = new DecimalFormat("##.0000");

	public Circleimpl(String color, int radius) {
		this.color = color;
		this.radius = radius;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public void getAllPropertys() {
		System.out.println("Name: " + name + "  " + "Color: " + color + "  " + "Area: " + f.format(this.getArea())
				+ "  " + "Radius: " + this.getRadius());
	}

	@Override
	public int getRadius() {
		return this.radius;
	}

}
