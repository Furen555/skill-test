package clases;

import java.text.DecimalFormat;

import interfaces.Trapezoid;

public class Trapezoidimpl implements Trapezoid {

	private final String name = "Trapezoid";
	private String color;
	private int base1;
	private int base2;
	private int side1;
	private int side2;

	DecimalFormat f = new DecimalFormat("##.0000");

	public Trapezoidimpl(String color, int base1, int base2, int side1, int side2) {
		this.color = color;
		this.base1 = base1;
		this.base2 = base2;
		this.side1 = side1;
		this.side2 = side2;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getArea() {
		return (base1 + base2) / 2 * Math.sqrt(side1 * side1
				- (((base1 - base2) * (base1 - base2) + side1 * side1 - side2 * side2) / 2 * (base1 - base2))
						* (((base1 - base2) * (base1 - base2) + side1 * side1 - side2 * side2) / 2 * (base1 - base2)));
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public void getAllPropertys() {
		System.out.println("Name: " + name + "  " + "Color: " + color + "  " + "Area: " + f.format(this.getArea())
				+ "  " + "MiddleLine: " + f.format(this.getMiddleLine()));
	}

	@Override
	public double getMiddleLine() {
		return (base1 + base2) / 2;
	}

}
