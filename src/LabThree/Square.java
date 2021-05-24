package LabThree;

public class Square implements ITwoDimensionalShape{

	public Square(double sideLength) {
		this._sideLength = sideLength;
	}

	private double _sideLength;


	@Override
	public double getArea() {
		return  getSideLength() * getSideLength();
	}

	@Override
	public double getPerimeter() {
		return 4 * getSideLength();
	}

	@Override
	public ITwoDimensionalShape getShape() {
		return this;
	}

	@Override
	public String toString() {
		return "Square's area = " + String.format("%.2f", this.getArea()) + ", perimeter = " + String.format("%.2f",
																										this.getPerimeter());
	}

	//region getter & setter
	public double getSideLength() {
		return _sideLength;
	}

	public void setSideLength(double sideLength) {
		this._sideLength = sideLength;
	}
	//endregion
}
