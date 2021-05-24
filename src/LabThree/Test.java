package LabThree;

import java.util.Scanner;


public class Test {
	static Scanner _scanner = new Scanner(System.in);

	private static void getShape(ShapeType shapeType){
		System.out.print("Enter the length of a " + shapeType.name() + "'s side:");
		ITwoDimensionalShape shape = ITwoDimensionalShape.generateShape(shapeType,_scanner.nextDouble());
		System.out.println(shape.toString());
	}

	public static void main(String[] args) {
		getShape(ShapeType.SQUARE);
		getShape(ShapeType.REGULAR_TRIANGLE);
		getShape(ShapeType.REGULAR_HEXAGON);
	}
}
