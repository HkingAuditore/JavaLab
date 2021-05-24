package LabThree;

public interface ITwoDimensionalShape {
	double getArea();
	double getPerimeter();

	ITwoDimensionalShape getShape();

	public static ITwoDimensionalShape generateShape(ShapeType shapeType,double shapeLength){
		switch (shapeType){
			case SQUARE -> {return new Square(shapeLength);}
			case REGULAR_TRIANGLE -> {return new RegularTriangle(shapeLength);}
			case REGULAR_HEXAGON -> {return new RegularHexagon(shapeLength);}
		}
		return null;
	}

}
