package clases;

import java.util.ArrayList;

import interfaces.Figures;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Black");
		colors.add("White");
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		ArrayList<Figures> result = new ArrayList<Figures>();

		int random = (int) (1 + Math.random() * 5); // for example, the range is from 1 to 5 elements
		for (int i = 0; i < random; i++) {
			result.add(new Squareimpl(colors.get((int) (Math.random() * 5)), ((int) (1 + Math.random() * 21))));
		}
		random = (int) (1 + Math.random() * 5);
		for (int i = 0; i < random; i++) {
			result.add(new Circleimpl(colors.get((int) (Math.random() * 5)), ((int) (1 + Math.random() * 21))));
		}
		random = (int) (1 + Math.random() * 5);
		for (int i = 0; i < random; i++) {
			result.add(new Triangleimpl(colors.get((int) (Math.random() * 5)), ((int) (1 + Math.random() * 21)),
					((int) (1 + Math.random() * 21)), ((int) (1 + Math.random() * 21))));
		}
		random = (int) (1 + Math.random() * 5);
		for (int i = 0; i < random; i++) {
			result.add(new Trapezoidimpl(colors.get((int) (Math.random() * 5)), ((int) (1 + Math.random() * 21)),
					((int) (1 + Math.random() * 21)), ((int) (1 + Math.random() * 21)),
					((int) (1 + Math.random() * 21))));
		}
		for (Figures figure : result) {
			figure.getAllPropertys();
		}

	}

}
