package clases;

import java.text.DecimalFormat;

import interfaces.Triangle;

public class Triangleimpl implements Triangle {

	private final String name = "Triangle";
	private String color;
	private int side1;
	private int side2;
	private int side3;

	DecimalFormat f = new DecimalFormat("##.000000");

	public Triangleimpl(String color, int side1, int side2, int side3) {
		this.color = color;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getArea() {
		double p = (side1 + side2 + side3) / 2;
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public void getAllPropertys() {
		System.out.println("Name: " + name + "  " + "Color: " + color + "  " + "Area: " + f.format(this.getArea())
				+ "  " + "HypotenuseLength: " + this.getHypotenuseLength());
	}

	@Override
	public int getHypotenuseLength() {
		if (side1 != side2 && side1 != side3) {
			return Math.max(side3, Math.max(side1, side2));
		} else
			return side1;
	}

}
